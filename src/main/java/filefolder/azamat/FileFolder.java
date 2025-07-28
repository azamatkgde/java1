package filefolder.azamat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class FileFolder {
    private static final Logger logger = LogManager.getLogger(CreateFile.class);

    public static void main(String[] args) {
        logger.info("Программабыз башталды!");

        try {
            // Папка ачуу
            Path folder = Path.of("data/files");
            if (!Files.exists(folder)) {
                Files.createDirectories(folder);
                logger.info("Папка түзүлдү:  {}", folder);
            } else {
                logger.info("Папка түзүлгөн:  {}", folder.toAbsolutePath());
            }

            // Файл түзөбүз
            Path file = folder.resolve("example.txt");
            if (!Files.exists(file)) {
                Files.createFile(file);
                logger.info("Файл түзүлдү: {}", file);
            } else {
                logger.info("Файл түзүлгөн: {}", file.toAbsolutePath());
            }

            // Файлга жазуу
            Files.writeString(file, "Салам группа!\n Биз файлдарды өтүп атабыз\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            logger.info("Файлга жазылды: {}", file.toAbsolutePath());

            List<String> lines = Files.readAllLines(file);
            for (String line : lines) {
                logger.info(">>> {}", line);
            }

            // Копировать
            Path copy = folder.resolve("example_copy.txt");
            if (!Files.exists(copy)) {
                Files.copy(file, copy);
                logger.info("Файл көчүрүлдү: {}", copy);
            }

            //Переименовать
            Path moved = folder.resolve("example_renamed.txt");
            if (!Files.exists(moved)) {
                Files.move(copy, moved);
                logger.info("Файлдын аты өзгөрдү: {}" , moved);
            }

            // Папканын ичиндеги файлдар
            logger.info("Папканын ичиндеги файлдар: ");
            try (DirectoryStream<Path> files = Files.newDirectoryStream(folder)) {
                for (Path f : files) {
                    String type = Files.isDirectory(f) ? "папка" : "файл";
                    logger.info("{} - бул {}", f.getFileName(), type);
                }
            }

            // Файлдардын көлөмү
            long size = Files.size(file);
            logger.info("Көлөмү: {} байт", size);

            // Файлдарды өчүрүү
            Scanner scanner = new Scanner(System.in);
            System.out.println("Файлдарды өчүрөлүбү? (ооба/жок): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("ооба")) {
                Files.deleteIfExists(file);
                Files.deleteIfExists(copy);
                Files.deleteIfExists(moved);
                logger.info("Файлдар өчүрүлдү {} ", file, copy, moved);
            }

        } catch (IOException e) {
            logger.error("Ката кетти {}", e.getMessage(), e);
        }


    }
}
