package utils;

import java.io.FileReader;
import java.util.Properties;
import java.util.logging.Logger;

public class Configuration {

    private final Properties properties = new Properties();
    private final Logger logger = Logger.getLogger(Configuration.class.getName());

    public Configuration() {
        try {
            this.properties.load(new FileReader("src/main/resources/configuration.properties"));
        } catch (Exception var2) {
            this.logger.severe("No se pudo cargar el archivo  configuration.properties");
        }

    }

    public String getUrl() throws Exception {
        try {
            String url = this.properties.getProperty("url.web").trim();
            return url;
        } catch (Exception var2) {
            this.logger.severe("No se pudo obtener el dato del url.web, verifique configuration.properties");
            throw new Exception(var2.getMessage());
        }
    }

    public int getWaitSecond() throws Exception {
        try {
            int seconds = Integer.parseInt(this.properties.getProperty("selenium.wait").trim());
            return seconds;
        } catch (Exception var2) {
            this.logger.severe("No se pudo obtener el dato del Selenium.wait, verifique configuration.properties");
            throw new Exception(var2.getMessage());
        }
    }

    public boolean getHeadless() {
        return this.properties.getProperty("selenium.headless").trim().equalsIgnoreCase("enable");
    }

}

