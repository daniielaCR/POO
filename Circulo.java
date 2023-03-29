package Salud;

public class Circulo extends Figura {

    float radio;
    float area;

    double PI=3.14;

    public Circulo( float radio){
        this.radio=radio;

    }

    
    public double getRadio() {
        return radio;
    }


    public void setRadio(Float radio) {
        this.radio = radio;
    }


    public double getArea() {
        return area;
    }


    public void setArea( float area) {
        this.area = area;
    }


    public double getPI() {
        return PI;
    }


    public void setPI(double pI) {
        PI = pI;
    }


    public void calcularArea() {
        double area2 = (PI*(radio*radio));
        System.out.println("La base del circulo es "+area+" su altura es "+radio+" y el área es "+area2);
       
    }
    
}
