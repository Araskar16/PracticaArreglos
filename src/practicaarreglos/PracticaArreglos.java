/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarreglos;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author soporte
 */
public class PracticaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuarios[][] ={
            //email,contraseña
            {"usuario1@mail.com", "123"},
            {"usuario2@mail.com", "456"},
            {"usuario3@mail.com", "789"}
        
            
       
                
        };
        
    String email = 
            JOptionPane.showInputDialog( "Ingresa el correo");
    
    int password = 
            Integer.parseInt(JOptionPane.showInputDialog( "Ingresa la contraseña"));
    
         boolean flag=false;
            for (int i=0;i<usuarios.length;i++){
            if(email.equals(usuarios[i][0])){
            if(password==Integer.parseInt(usuarios[i][1])){
                flag=true;
                System.out.println("Credenciales correctas");
                break;
            }else{
                flag=true;
                System.out.println("usuario existente, Contraseña incorrecta");
                break;
            }
        }
    }
    if (flag==false){
        System.out.println("Usuario y contraseña incorrecta");
    }
            
    
       
            
    }
    
    
}
