package services;
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
