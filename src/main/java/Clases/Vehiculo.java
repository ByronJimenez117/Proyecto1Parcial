/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;	
import java.util.Scanner;
import java.io.FileOutputStream; 
import java.io.PrintWriter;
import static java.lang.Double.parseDouble;
/**
 *
 * @author byron
 */
public class Vehiculo {
        private String tipo;
        private String placa;
        private String marca;
        private String modelo;
        private String tipoMotor;
        private String recorrido;
        private String color;
        private String tipoCombustible;
        private Double precio;
        private String vidrio;
        private String transmision;
        private String traccion;
        
        //CONSTRUCTOR PARA AUTO
    private Vehiculo(String placa, String marca, String modelo, String tipoMotor, String recorrido, String color, String tipoCombustible, Double precio, String vidrio, String transmision) {
        this.placa = placa;
        this.modelo=modelo;
        this.marca = marca;
        this.tipoMotor = tipoMotor;
        this.recorrido = recorrido;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
        this.vidrio = vidrio;
        this.transmision = transmision;
        this.tipo="Auto";
    }
           //CONSTRUCTOR PARA CAMION
    private Vehiculo(String placa, String marca, String modelo, String tipoMotor, String recorrido, String color, String tipoCombustible, Double precio, String vidrio, String transmision, String traccion) {
        this.placa = placa;
        this.marca = marca;
        this.modelo=modelo;
        this.tipoMotor = tipoMotor;
        this.recorrido = recorrido;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
        this.vidrio = vidrio;
        this.transmision = transmision;
        this.traccion=traccion;
        this.tipo="Camion";
    }
        //CONSTRUCTOR PARA MOTOCICLETA
    private Vehiculo(String placa, String marca, String modelo, String tipoMotor, String recorrido, String color, String tipoCombustible, Double precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo=modelo;
        this.tipoMotor = tipoMotor;
        this.recorrido = recorrido;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
        this.tipo="Motocicleta"; 


    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getVidrio() {
        return vidrio;
    }

    public void setVidrio(String vidrio) {
        this.vidrio = vidrio;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", tipoMotor=" + tipoMotor + ", recorrido=" + recorrido + ", color=" + color + ", tipoCombustible=" + tipoCombustible + ", precio=" + precio + ", vidrio=" + vidrio + ", transmision=" + transmision + ", traccion=" + traccion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.tipoMotor, other.tipoMotor)) {
            return false;
        }
        if (!Objects.equals(this.recorrido, other.recorrido)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.tipoCombustible, other.tipoCombustible)) {
            return false;
        }
        if (!Objects.equals(this.vidrio, other.vidrio)) {
            return false;
        }
        if (!Objects.equals(this.transmision, other.transmision)) {
            return false;
        }
        if (!Objects.equals(this.traccion, other.traccion)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        return true;
    }    
        // Metodo para generar un tipo de Vehiculo de acuerdo a lo que 

                public static Vehiculo generarTipoVehiculo() {
                Scanner scanner = new Scanner(System.in);   
                System.out.println("Ingrese tipo de vehiculo"); String tipo= scanner.nextLine();
                System.out.println("Ingrese placa"); String placa= scanner.nextLine();
                System.out.println("Ingrese marca"); String marca= scanner.nextLine();
                System.out.println("Ingrese modelo"); String modelo= scanner.nextLine();
                System.out.println("Ingrese tipo de Motor"); String tipoMotor= scanner.nextLine();
                System.out.println("Ingrese recorrido"); String recorrido= scanner.nextLine();
                System.out.println("Ingrese color"); String color= scanner.nextLine();
                System.out.println("Ingrese tipo de Combustible"); String tipoCombustible= scanner.nextLine();
                System.out.println("Ingrese precio"); Double precio= scanner.nextDouble();
                
                if(tipo.equals("Auto")) {
                        Scanner scanner1 = new Scanner(System.in); 
                        System.out.println("Ingrese el vidrio"); String vidrio= scanner1.nextLine();
                        System.out.println("Ingrese la transmision"); String transmision= scanner1.nextLine();
                        return new Vehiculo(placa, marca,modelo, tipoMotor, recorrido, color, tipoCombustible, precio,  vidrio, transmision);
                }
                if(tipo.equals("Camion")) {
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Ingrese vidrio"); String vidrio= scanner2.nextLine();
                        System.out.println("Ingrese la transmision"); String transmision= scanner2.nextLine();
                        System.out.println("Ingrese la traccion"); String traccion= scanner2.nextLine();
                        return new Vehiculo(placa, marca,modelo, tipoMotor, recorrido, color, tipoCombustible, precio,  vidrio, transmision, traccion);
                }
                if(tipo.equals("Motocicleta")) {
                        return new Vehiculo(placa, marca,modelo, tipoMotor, recorrido, color, tipoCombustible, precio);
                }
                return null;
        }
     //Metodo de lectura y escritura de Vehiculos
        
public static void saveFile(ArrayList<Vehiculo> vehiculos, String nomfile){
        try(PrintWriter pw=new PrintWriter(new FileOutputStream(new File(nomfile),true)))
        {
            for(Vehiculo v: vehiculos)
                           //(String placa, String marca, String modelo, String tipoMotor, String recorrido, String color, String tipoCombustible, Double precio, String vidrio, String transmision, String traccion) { 
                pw.println(v.getPlaca()+"|"+v.getMarca()+"|"+v.getModelo()+"|"+v.getTipoMotor()+"|"+v.getRecorrido()+"|"+v.getColor()+"|"+ v.getTipoCombustible()+"|"+v.getPrecio()+"|"+v.getVidrio()+"|"+v.getTransmision()+"|"+v.getTraccion());
        }
        catch(Exception e){
            System.out.println(e.getMessage());    
        
        }
    }
        
    public static ArrayList<Vehiculo> readFile(String nomfile){
        ArrayList<Vehiculo> vehiculos= new ArrayList<>();
        try(Scanner sc= new Scanner(new File(nomfile))){
            while(sc.hasNextLine())
            {
                String linea=sc.nextLine();
                String[] tokens = linea.split("\\|");
                                  
                Vehiculo v=new Vehiculo(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],parseDouble(tokens[7]),tokens[8],tokens[9],tokens[10]);
                vehiculos.add(v);
                
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return vehiculos;
}
}