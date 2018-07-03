import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainLoggerClass {

    public static final Logger logger=LoggerFactory.getLogger(MainLoggerClass.class);

    public static void main(String[] args) {
        String name="FURKAN";
        logger.debug("Hi {}"+name);
        logger.info(name);
        logger.warn("uyarı mesajı");
        logger.error("hata mesajı");
        logger.info("Request Fields: id durum");
        logger.info("Request Fields: id ");
        logger.info("Request Fields: id ");
        logger.info("Request Fields: id ");
        logger.info("Request Fields: id  acliliyetBilgisi");
    }
}
