
package persistence;
import java.util.Scanner;
public class Main
{

  public static void main(String[] args)
  {
    Scanner lsScanner = new Scanner(System.in);
    FileText fileText = new FileText();
    fileText.setPath("./filel.txt");
    System.out.println("Ingrese el nombre del archivo");
    String name= lsScanner.nextLine();
    System.out.println("Ingrese el contenido del archivo");
    String content= lsScanner.nextLine();
    Text text = new Text();
    text.Text(name, content);
  }
  
}
