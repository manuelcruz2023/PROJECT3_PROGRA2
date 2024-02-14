package services;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class LeerArchivoByteAByte {
  public void leerArchivo () throws IOException {
    File filePath = new File("C:\\Users\\sala310\\Documents\\vscode manuel\\person2.txt");
    // Instance of the FileInputStream
    FileInputStream fileInputStream = new FileInputStream(filePath);

    // Create a byte array
    byte[] demoArray = new byte[(int) filePath.length()];

    // Read file content to byte array
    fileInputStream.read(demoArray);

    // Close the instance
    fileInputStream.close();

    // Print the above byte array
    System.out.print(Arrays.toString(demoArray));
  }
}
