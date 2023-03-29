package Salud;

import java.util.Scanner;

public class trinangulo extends Figura{
    private float base, altura,area=0;

    public trinangulo(float  base, float altura){
        this.base = base;
        this.altura = altura;
    }

    
   
      
        public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }


        public void calcularArea()
        {
            Scanner capturar = new Scanner(System.in);
            System.out.print("Ingresa la base ");
            base = capturar.nextFloat();
            System.out.print("Ingresa la altura ");
            altura = capturar.nextFloat();
            area=(base*altura)/2;
            System.out.print("La base del triángulo es: " + base + ", su altura es: " + altura + " y su área es: " + area );
        }


    }
