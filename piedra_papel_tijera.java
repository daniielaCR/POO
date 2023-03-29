package Salud;

import java.util.Random;
import java.util.Scanner;

public class piedra_papel_tijera implements juego {
    Scanner capturar=new Scanner(System.in);
    private int num_min = 1;
     private int num_max = 2;
     private int seleccionar;
     private String nombre;
    
     Random random=new Random();
    private int getResultado;
     
    
    public Scanner getCapturar() {
        return capturar;
    }

    public void setCapturar(Scanner capturar) {
        this.capturar = capturar;
    }

    public int getNum_min() {
        return num_min;
    }

    public void setNum_min(int num_min) {
        this.num_min = num_min;
    }

    public int getNum_max() {
        return num_max;
    }

    public void setNum_max(int num_max) {
        this.num_max = num_max;
    }

    public int getSeleccionar() {
        return seleccionar;
    }

    public void setSeleccionar(int seleccionar) {
        this.seleccionar = seleccionar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getResultado() {
        return getResultado();
    }

    public void setResultado(int resultado) {
        this.getResultado = resultado;
    }

    public void inicio() {
        System.out.println("BIENVENIDO AL JUEGO");
    }
   
    public void jugar() {
        System.out.print("Selecione: \n 1piedra\n 2papel\n 3tijera\n");
        seleccionar= capturar.nextInt();
        
    }


    public void finalizar() {
        int resultado = random.nextInt(num_max + num_min )+ num_min;
        System.out.println("Se escogio escogio\n "+resultado);


        if (seleccionar==resultado) {
            System.out.println("Es empate");    
        }
        else if (seleccionar==1 && resultado==3) {
            System.out.println("Gano "+nombre);
        }
        else if (seleccionar==2 && resultado==1) {
            System.out.println("Gano "+nombre);
        }
        else if (seleccionar==3 && resultado==2) {
            System.out.println("Gano "+nombre);
        }
        else{
            System.out.println("Perdiste");
       
    }
    
}
}