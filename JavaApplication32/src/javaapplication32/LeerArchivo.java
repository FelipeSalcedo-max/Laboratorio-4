/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANTY853
 */
public class LeerArchivo {
    
    public static void main(String[] args) {
        try {
            File Notas = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Laboratorio-4\\Notas.csv"); 
            
            System.out.println("Nombre del archivo: "+Notas.getName());
            System.out.println("Ruta del archivo: "+Notas.getAbsolutePath());
            ArrayList Lista = new ArrayList<>();
            
            Scanner myReader = new Scanner(Notas); 
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                Lista.add(data);
            }
                    
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");

        }
   }
}
