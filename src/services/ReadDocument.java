/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/**
 *
 * @author FAMILIA CRUZ
 */
public class ReadDocument
{
  public String ReadDocument(String path){
        String cont="";
        try (FileReader fr = new FileReader(path)) {
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null)
            cont=cont+linea;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return cont;
    }
}
