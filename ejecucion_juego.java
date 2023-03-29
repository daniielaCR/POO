package principal;
import Salud.*;
public class ejecucion_juego {
    public static void main(String[] args) {
    piedra_papel_tijera jueguito = new piedra_papel_tijera();
    jueguito.inicio();
    jueguito.jugar();
    jueguito.finalizar();
    }
    
}
