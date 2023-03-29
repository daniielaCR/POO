package principal;
import java.text.BreakIterator;
import java.util.Scanner;

import Salud.*;
public class ejecucuion {
   
    /**
     * @param args
     */
    public static void main(String[] args) {
        int selecion;
        float base,altura;
        float radio;
        float area;
        int  i= 0;

        Scanner capturar=new Scanner(System.in);
        while (i == 0) {
        System.out.print("Selecciona: 1/Círculo 2/Rectángulo 3/Triángulo");
        selecion =capturar.nextInt(); 

        switch(selecion){ 

        case 1:   
        System.out.println("Ingrese el valor del radio");
        radio=capturar.nextFloat();
        System.out.println("Ingrese el valor del area");
        area=capturar.nextFloat();

        Circulo c1=new Circulo(radio);
        c1.calcularArea();
        break; 

       case 2:
        System.out.println("Ingrese el valor de la base del reactángulo");
        base=capturar.nextFloat();
        System.out.println("Ingrese el valor de la altura del reactángulo");
        altura=capturar.nextFloat();

        rectangulo r1=new rectangulo(base, altura);
        r1.calcularArea();
        break; 

        case 3:

        System.out.println("Ingrese el valor de la base del triangulo");
        base=capturar.nextFloat();
        System.out.println("Ingrese el valor de la altura del triangulo");
        altura=capturar.nextFloat();

        trinangulo t1=new trinangulo(base, altura);
        t1.calcularArea();
        break; 

    }

    }
    
}
}
