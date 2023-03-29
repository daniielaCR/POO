package Salud;

public class Empleado extends persona {
    private String cargo;
    private int valor_hora;
    private int horas_trabajadas;
    private String depart;
    private double honorarios=0;
  
    public Empleado(String tipdoc, int docu,String nombre,String apellido,double peso,double estatura, int edad, String sexo,double pesoActual, String cargo, int valor_hora, int horas_trabajadas, String depart, double honorarios){
       super(tipdoc, docu, nombre, apellido, peso, estatura, edad, sexo, pesoActual, cargo, valor_hora, horas_trabajadas, depart);
        this.cargo=cargo;
        this.valor_hora=valor_hora;
        this.horas_trabajadas=horas_trabajadas;
        this.depart=depart;

    }
    public Empleado(String tipdoc, int docu, String nombre, String apellido, String cargo2, int valor_hora2,
            int horas_trabajadas2, double reteica, double honorarios) {
    }
    public double calcularHonorarios(){
        double reteica=0.966;
        double honorarios=0;

        honorarios=valor_hora*horas_trabajadas;
        honorarios=honorarios-(honorarios*reteica/100);
        return honorarios;
        

    }

    public void mostrarEmpleado(){
        System.out.println("el tipo de documento es " +getTipdoc()+ "documento" +getDocu()+  "el nombre del empleado es "+getNombre()+ "el cargo es "+cargo+ "horas trabajadas" +horas_trabajadas+ "valor por hora "+valor_hora+ "valor a pagar"+honorarios);

    }
    
}
