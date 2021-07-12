/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;	
import java.util.Scanner;
import java.io.FileOutputStream; 
import java.io.PrintWriter;
/**
 *
 * @author byron
 */
public class vendedor extends usuario{

    public vendedor(String nombres, String apellidos, String organizacion, String correoelectronico, String clave) {
        super(nombres, apellidos, organizacion, correoelectronico, clave);
    }
   
    public static String convertirSHA256(String password) {
	MessageDigest md = null;
	try {
		md = MessageDigest.getInstance("SHA-256");
	} 
	catch (NoSuchAlgorithmException e) {		
		e.printStackTrace();
		return null;
	}
	    
	byte[] hash = md.digest(password.getBytes());
	StringBuffer sb = new StringBuffer();
	    
	for(byte b : hash) {        
		sb.append(String.format("%02x", b));
	}
	    
	return sb.toString();
    }
    public static void saveFile(ArrayList<vendedor> vendedores, String nomfile){
        try(PrintWriter pw=new PrintWriter(new FileOutputStream(new File(nomfile),true)))
        {
            for(vendedor p: vendedores)
                pw.println(p.getNombres()+"|"+p.getApellidos()+"|"+p.getOrganizacion()+"|"+p.getCorreoelectronico()+"|"+p.getClave());
        }
        catch(Exception e){
            System.out.println(e.getMessage());    
        
        }
    }
        
    public static ArrayList<vendedor> readFile(String nomfile){
        ArrayList<vendedor> vendedores= new ArrayList<>();
        try(Scanner sc= new Scanner(new File(nomfile))){
            while(sc.hasNextLine())
            {
                String linea=sc.nextLine();
                String[] tokens = linea.split("\\|");
                vendedor p=new vendedor(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4]);
                vendedores.add(p);
                
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return vendedores;
}
    
}