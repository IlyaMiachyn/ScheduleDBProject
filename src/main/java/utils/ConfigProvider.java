package utils;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
public class ConfigProvider {
    public static Config readConfig(final String resourceName) {
        return ConfigFactory.load(resourceName);
    }
}
