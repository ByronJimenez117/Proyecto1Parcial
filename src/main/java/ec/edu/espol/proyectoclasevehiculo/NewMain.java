/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.proyectoclasevehiculo;

import Clases.Vehiculo;
import static Clases.Vehiculo.generarTipoVehiculo;
import Clases.vendedor;
import static Clases.vendedor.convertirSHA256;
import java.util.ArrayList;
import java.util.HashMap;// Claves serian los correos y los valores las contraseñas 
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author byron
 */
public class NewMain {
static Map<String, vendedor> sellerMap= new HashMap<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
{
    
}
int opcion;

        do{
            Scanner scan_1= new Scanner(System.in);
            System.out.println("Venta de Vehiculos");
            System.out.println("Menu de opciones: ");
            System.out.println("1. Vendedor");
            System.out.println("2. Comprador");
            System.out.println("3. Salir");
            System.out.println("Ingrese el numero de opcion: ");
            opcion=scan_1.nextInt();
            //opciones vendedor
            if(opcion==1){
                System.out.println("Ha ingresado la opcion 1");
                int opcion_2;
                do{
                    //submenu del vendedor completo
                    //solo faltan las funciones
                    Scanner scan_2=new Scanner(System.in);
                    System.out.println("1. Regristrar un nuevo vendedor");
                    System.out.println("2. Ingresar un nuevo vendedor");
                    System.out.println("3. Aceptar oferta");
                    System.out.println("4. Regresar");
                    System.out.println("Ingrese el numero de la opcion");
                    opcion_2=scan_2.nextInt();
                    Scanner scanner = new Scanner(System.in);
                    
                    
                    if(opcion_2==1){
                                ArrayList<vendedor> vendedores = vendedor.readFile("vendedores.txt");
                                System.out.println("Ingrese nombre"); String name= scanner.nextLine();
                                System.out.println("Ingrese apellidos"); String surnames= scanner.nextLine();
                                System.out.println("Ingrese organizacion"); String organization= scanner.nextLine();
                                System.out.println("Ingrese correo electronico"); String email= scanner.nextLine();
                                System.out.println("Ingrese contraseña"); String password= scanner.nextLine();
                                vendedor v= new vendedor(name,surnames,organization,email,password );
                                String hashcode;
                                hashcode= convertirSHA256(password);
                                System.out.println(hashcode);
                                registrarNuevoVendedor(v);
                                vendedores.add(v);
                                vendedor.saveFile(vendedores,"vendedores.txt");
                                
                  
                    }
                    else if(opcion_2==2){
                        System.out.println("Ingresar correo electronico: "); String email= scanner.nextLine();
                        System.out.println("Ingresar clave: "); String password= scanner.nextLine();
                        String hashcode;
                        hashcode=convertirSHA256(password);
                        ArrayList<vendedor> vendedores = vendedor.readFile("vendedores.txt");
                        for(vendedor v: vendedores){
                            if(!v.getClave().equals(hashcode)){
                                System.out.println("Clave incorrecta");
                            }
                            else{
                                Vehiculo p =generarTipoVehiculo();
                                ArrayList<Vehiculo> vehiculos = Vehiculo.readFile("vehiculos.txt");
                                for(Vehiculo vehi: vehiculos){
                                    if(p.getPlaca().equals(vehi.getPlaca()))
                                        System.out.println("vehiculo ya registrado");
                                    else{
                                        vehiculos.add(p);
                                        Vehiculo.saveFile(vehiculos,"vehiculos.txt");
                                        System.out.println("Vehiculo registrado exitosamente");
                                    }
                                
                                }
                            }
                        }
                    }
                    else if(opcion_2==3){
                    }
                    else if(opcion_2==4){
                        opcion_2=5;
                    }
                }while(opcion_2<=4);
            }
            
            //opciones comprador
            else if(opcion==2){
                System.out.println("Ha ingresado la opcion 2");
                int opcion_3;
                do{
                    //submenu de comprador completo 
                    //solo faltan las funciones 
                    //funciones
                    Scanner scan_3=new Scanner(System.in);
                    System.out.println("1. Regristrar un nuevo comprador");
                    System.out.println("2. Ofertar por un vehiculo");
                    System.out.println("Ingrese el numero de la opcion");
                    opcion_3=scan_3.nextInt();
                    if(opcion_3==1){
                    }
                    else if(opcion_3==2){
                    }                             
                }while(opcion_3<=4);               
            }
            
            //final del menu principal
            else if(opcion==3){
                opcion=4;
            }
    
        }while(opcion<=3);
        }
            private static void registrarNuevoVendedor(vendedor v) {
                if(estaVacio(v.getCorreoelectronico())) {
                        System.out.println("Error: El ID de correo electrónico no puede estar en blanco.");
                        return;
                }
                if(sellerMap.containsKey(v.getCorreoelectronico())) {
                        System.out.println("El usuario de error ya está registrado en el sistema");
                        return;
                }
                sellerMap.put(v.getCorreoelectronico(), v);
        }

        private static boolean estaVacio(String attr) {
                if(attr == null || attr.trim().length()==0) return true;
                return false;
        }
    }
    
   