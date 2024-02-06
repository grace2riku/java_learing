import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestApp2 {
    public static void main(String[] args) throws IOException {
        // Propertiesの読み込み
        Properties settings = new Properties();
        FileInputStream in = null;

        try {
            in = new FileInputStream("foo.properties");
            settings.load(in);
        } finally {
            if (in != null) {
                in.close();
            }
        }

        // langの値を出力
        String lang = settings.getProperty("lang");
        System.out.println("lang = [" + lang + "]");

        // 試しに設定ファイルになきキーを読み込む
        String xyz = settings.getProperty("xyz");
        System.out.println("xyz = [" + xyz + "]");

        // 全ての設定を出力
        settings.list(System.out);
    }    
}
