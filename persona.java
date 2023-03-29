package Salud;

import java.util.Scanner;

public class persona {
    private String tipdoc;
    private int docu;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private double pesoActual;

    public persona(String tipdoc2, int docu2, String nombre2, String apellido, double peso, double estatura, int edad2, String sexo, double pesoActual, String cargo, int valor_hora, int horas_trabajadas, String depart) {
    }


    public persona(){}

    
    
    public String getTipdoc() {
        return tipdoc;
    }


    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }


    public int getDocu() {
        return docu;
    }

    public void setDocu(int docu) {
        this.docu = docu;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getSexo() {
        return sexo;
    }



    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public double getPesoActual() {
        return pesoActual;
    }



    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public void persona(String tipdoc, int docu,String nombre,String apellido,double peso,double estatura, int edad, String sexo,double pesoActual) {
    this.tipdoc=tipdoc;
    this.docu=docu;
    this.nombre=nombre;
    this.apellido=apellido;
    this.peso=peso;
    this.estatura=estatura;
    this.edad=edad;
    this.sexo=sexo;
    this.pesoActual=pesoActual;

}



    public void registrarPersona(){
        Scanner capturar=new Scanner(System.in);
        System.out.println("Digite el tipo de documento" );
        tipdoc=capturar.next();
        System.out.println("Digite el documento");
        docu=capturar.nextInt();
        System.out.println("Digite el nombre");
        nombre=capturar.next();
        System.out.println("Digite el apellido");
        apellido=capturar.next();
        System.out.println("Digite la estatura promedio(en mentros)");
        estatura=capturar.nextInt();
        System.out.println("Digite el genero");
        sexo=capturar.next();
        System.out.println("Digite la edad");
        edad=capturar.nextInt();
        System.out.println("Digite el peso(en kilogramos)");
        peso=capturar.nextInt();
        capturar.close();
    }

    public void mostrarPersona(){
        System.out.println("tipo de documento registrado es " + tipdoc);
        System.out.println("el documento registrado es " + docu);
        System.out.println("la persona registrado es " +  nombre);
        System.out.println("El apellido registrado es " + apellido);
        System.out.println("la estatura registrado es " + estatura +"Metros");
        System.out.println("El genero registrado es " + sexo);
        System.out.println("la edad registrado es " + edad);
        System.out.println("El peso registrado es " + peso+"kilogramos");
        //pesoActual=peso(en kg)/(estatura(en m)^2
   
  }

  //RETO1
  /*public void calcularImc() {
    pesoActual = peso / (estatura * estatura);

if (pesoActual<=20) {
    System.out.println("el peso esta debajo de lo ideal");
}
else if (pesoActual>= 20 && pesoActual <= 25) {
    System.out.println("el peso esta ideal");
}
else if (pesoActual>=25) {
    System.out.println(" Usted tiene sobrepeso");
} 
else{
    System.out.println("digito datos incorrectos");
}  */

//RETO2
 
public String calcularImc( String result){
    pesoActual = peso / (estatura * estatura);
    
    if (pesoActual<=20){
        System.out.println("PesoBajo");}

        else if (pesoActual>=20  && pesoActual<=25){
            System.out.println("PesoIdeal");}

            else if (pesoActual>=25){
                System.out.println("SobrePeso");}
    return result;

}


public void mayorEdad(){

 if (edad<=18) {
    System.out.println("Usted es menor de edad ");
}
else if (edad>=18) {
    System.out.println("Usted es mayor de edad");
}  

}

}

