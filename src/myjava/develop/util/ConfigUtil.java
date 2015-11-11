package myjava.develop.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读到Properties工具�?
 * 
 * @author xs
 */
public class ConfigUtil {
    /*
     * 根据Properties地址反回Properties对象
     * 
     * @parm propertiesDir Properties地址
     */
    public static Properties getProperties(String propertiesDir) {
        Properties props = new Properties();
        ClassLoader loader = ConfigUtil.class.getClassLoader();
        InputStream ips = loader.getResourceAsStream(propertiesDir);
        try {
            props.load(ips);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }

    /*
     * 从配置文件里读�??
     * 
     * @param key;
     * 
     * @param propertiesDir 配置文件的地�?
     */
    public static String getValue(String key, String propertiesDir) {
        Properties props = getProperties(propertiesDir);
        return props.getProperty(key);
    }
}
