package principal;
import java.util.Scanner;

import Salud.*;

public class inicio_1 {
    public static void main(String[] args) {
        Scanner capturar=new Scanner(System.in);

        String nombre, apellido, tipdoc, docu, cargo, depart;
            int valor_hora, horas_trabajadas;         
            Scanner get = new Scanner(System.in);
            System.out.print("Ingresa los nombres");
            nombre = get.next(); 
            System.out.print("Ingresa los apellidos");
            apellido = get.next();  
            System.out.print("Ingresa el tipo de documento");
            tipdoc = get.next();
            System.out.print("Ingresa el número de documento");
            docu = get.next();
            System.out.print("Ingresa el cargo \n");
            cargo = get.next();
            System.out.print("Ingresa el departamento ");
            depart = get.next();
            System.out.print("Ingresa las horas trabajadas ");
            horas_trabajadas=get.nextInt();
            System.out.print("Ingresa el valor por hora trabajada");
            valor_hora=get.nextInt();
            Empleado nom = new Empleado(tipdoc, horas_trabajadas, nombre, apellido, horas_trabajadas, horas_trabajadas, horas_trabajadas, docu, horas_trabajadas, cargo, valor_hora, horas_trabajadas, depart, horas_trabajadas);
            nom.mostrarEmpleado();
            nom.calcularHonorarios();
        
   
        
    }
    
}
