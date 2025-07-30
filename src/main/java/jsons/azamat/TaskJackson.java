package jsons.azamat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TaskJackson {
    private static final Logger logger = LogManager.getLogger(TaskGson.class);
    private static final Path filePath = Path.of("jackson_tasks.json");
    //private static final Gson gson = new Gson();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        logger.info("Программа башлады:");

        List<Task> tasks = new ArrayList<>();

        // Json файлды окуу
        if (Files.exists(filePath)) {
            try (var reader = Files.newBufferedReader(filePath)) {
                tasks = objectMapper.readValue(reader, new TypeReference<List<Task>>() {});
                logger.info("Файлдан " + tasks.size() + "тапшырма жүктөлдү");
            } catch (IOException e) {
                logger.error("Файлды окуп атканда ката чыкты: " + e.getMessage());
            }
        } else {
            logger.warn("Файл жасала элек!");
        }

        // Тапшырма жасап аны json файлга сактоо Jackson китепкана менен
        // Уникалдуу ID (for менен жасайбыз азыр, TODO: кийин Stream API өткөндө өзгөртөбүз)

        int maxId = 0;
        for (Task task : tasks) {
            if (task.getId() > maxId) {
                maxId = task.getId();
            }
        }
        int nextId = maxId + 1;
        tasks.add(new Task(nextId, "Жаңы тапшырманын аты", false));

        try (var writer = Files.newBufferedWriter(filePath)) {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(writer, tasks);
            logger.info("Тапшырма json файлга жазылды");
        } catch (IOException e) {
            logger.error("Файлга жаза албай калдым: " + e.getMessage());
        }


        logger.info("Программа аягына чыкты");
    }
}
