import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestApp1 {
    public static void main(String[] args) throws IOException {
        Properties settings = new Properties();
        settings.setProperty("country", "USA");
        settings.setProperty("lang", "English");

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("foo.properties");
            settings.store(out, "Foo Properties");
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}