package services;
import java.io.PrintWriter;

public class Text {
      public void Text (String name, String content) {
        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\FAMILIA CRUZ\\OneDrive\\Documentos\\progra2\\" + name + ".txt", "UTF-8");
            writer.println(content);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
      
      
}
