/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;
import java.io.File;
public class ShowFiles
{
  public void showFiles (String location) {
    File folder = new File(location);
        String[] listado = folder.list();
        for (int i=0; i< listado.length; i++) {
            System.out.println(listado[i]);
            }
        }
  }
