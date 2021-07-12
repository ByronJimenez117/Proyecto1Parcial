/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephanie
 */
public class Oferta {
    private Vehiculo vehiculo;
    private String correocomprador;
    private String precioofertado;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getCorreocomprador() {
        return correocomprador;
    }

    public String getPrecioofertado() {
        return precioofertado;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setCorreocomprador(String correocomprador) {
        this.correocomprador = correocomprador;
    }

    public void setPrecioofertado(String precioofertado) {
        this.precioofertado = precioofertado;
    }


    
public static void saveFile(ArrayList<Oferta> ofertas, String nomfile){
    try(PrintWriter pw=new PrintWriter(new FileOutputStream(new File(nomfile),true)))
    {
        for(Oferta o: ofertas)
             //pw.println());
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());    
        
        }
}
        
public static ArrayList<Oferta> readFile(String nomfile){
    ArrayList<Oferta> ofertas= new ArrayList<>();
    try(Scanner sc= new Scanner(new File(nomfile))){
        while(sc.hasNextLine())
        {
            String linea=sc.nextLine();
            String[] tokens = linea.split("\\|");
            //Oferta o = new Oferta(tokens[0],tokens[1]);
            //ofertas.add(o);
                
        }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
        return ofertas;
    }

}
