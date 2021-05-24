package AulaJava_3.TM_2;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class SortingFactory {
    public static Sorter create()  {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String sorterPath = rootPath + "AulaJava_3/TM_2/SortingFactory.properties";
        var properties = new Properties();
        try {
            properties.load(new FileInputStream(sorterPath));
            Constructor<?> constructor = Class.forName(properties.getProperty("sorter")).getConstructor();
            var sorter = constructor.newInstance();
            if(sorter instanceof Sorter){
                return (Sorter) sorter;
            }
            System.out.println(sorter.getClass());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
