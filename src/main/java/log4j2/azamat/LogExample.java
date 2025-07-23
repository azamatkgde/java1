package log4j2.azamat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogExample {
    private static final Logger logger = LogManager.getLogger(LogExample.class);

    public static void main(String[] args) {
        logger.info("Программа башталды!");

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Ката: санды 0 бөлүүгө болбойт");
            logger.fatal("Фатальная ошибка!");
            logger.trace("Trace ката");
            logger.warn("Бул сан жөн эле, бирок баарыбир бир ката!");
        }

        logger.info("Программа бүттү!");
    }
}
