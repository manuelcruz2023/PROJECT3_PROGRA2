/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;
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
