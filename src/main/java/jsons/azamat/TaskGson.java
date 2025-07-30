package jsons.azamat;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TaskGson {
    private static final Logger logger = LogManager.getLogger(TaskGson.class);
    private static final Gson gson = new Gson();
    private static final Path filePath = Path.of("gson_tasks.json");

    public static void main(String[] args) {
        logger.info("Программа башлады:");

        List<Task> tasks = new ArrayList<>();

        // json файлды окуу жана аны коллекцияга жазуу
        try {
            if (Files.exists(filePath)) {
                String json = Files.readString(filePath);
                Type taskListType = new TypeToken<List<Task>>() {}.getType();
                tasks = gson.fromJson(json, taskListType);
                logger.info("Файлдан " + tasks.size() + "тапшырма жүктөлдү");
            } else {
                logger.info("Файл еще жок, түзүлөт");
            }
        } catch (IOException e) {
            logger.error("Файлды окуп атканда ката чыкты: " + e.getMessage());
        }

        // Тапшырма түзүү жана аны json файлга салуу
        Task newTask = new Task(1, "Тапшырманын аты", false);
        tasks.add(newTask);

        try {
            String updateJson = gson.toJson(tasks);
            Files.writeString(filePath, updateJson);
            logger.info("Түзүлгөн тапшырма json файлына жүктөлдү");
        } catch (IOException e) {
            logger.error("Файлга жазуу оор болуп калды: " + e.getMessage());
        }

        logger.info("Программа аягына чыкты");
    }
}
