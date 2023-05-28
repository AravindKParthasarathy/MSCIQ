package base;

import java.util.Properties;

public class ConfigReader {
    private static Properties prop;
    
    public static void setProperties(Properties properties) {
        prop = properties;
    }
    
    public static Properties getProperties() {
        return prop;
    }
}