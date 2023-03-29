package principal;


import Salud.*;
public class Inicio {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        String result="";
      
        //crear obgetos
        persona humano=new persona();
        humano.registrarPersona();
        humano.mostrarPersona();
        humano.mayorEdad();
        /*humano.calcularImc();*/

        //RETO2

        humano.calcularImc(result);
        result= humano.calcularImc(result);
        
            if (result == "PesoBajo") {
                System.out.println("Su  peso por debajo del ideal.");
            } else if (result == "PesoIdeal") {
                System.out.println("Su peso es  ideal.");
            } else if (result == "SobrePeso") {
                System.out.println("Usted tiene sobre peso.");
            }

            
            System.out.println(result);
       

        }

        }




