package filefolder.azamat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    private static final Logger logger = LogManager.getLogger(CreateFile.class);

    public static void main(String[] args) {
        logger.info("Программабыз башталды!");

        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                logger.info("Файл түзүлдү");
            } else {
                logger.warn("Файл түзүлгөн жок, анткени ал уже түзүлгөн");
            }
        } catch (IOException e) {
            logger.error("Файл түзүүдө ката чыкты");
            e.printStackTrace();
        }
    }
}
