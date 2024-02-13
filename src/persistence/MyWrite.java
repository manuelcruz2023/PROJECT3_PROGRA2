/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
public class MyWrite
{
  public void Text (String path, String content) {
        try {
          path = "./filel.txt";
          File file = new File(path);
          if (!file.exists()) {
            file.createNewFile();
          }
          FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(),true);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          bufferedWriter.write(content);
          bufferedWriter.close();
        }
        catch(Exception e ) {
          e.printStackTrace();
        }
    
      }
}
