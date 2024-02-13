/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;
import java.io.File;
/**
 *
 * @author FAMILIA CRUZ
 */
public class ReadDocument
{
  public void readDocument(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            for (File filenum : files) {
                if (filenum.isFile()) {
                    System.out.println(filenum.getName());
                }
            }
        } else {
            System.out.println("La carpeta esta vacia o no existe.");
        }
    }
}
