package calcularnumerosprimos;

import java.util.ArrayList;

/**
 *
 * @author rfernandezgonzalez
 */
public class Modelo {

    ArrayList <Integer> primos = new ArrayList <> ();

    int digitos;

    public Modelo() {
    }

    public Modelo(int digitos) {
        this.digitos = digitos;
    }

    public ArrayList<Integer> getPrimos() {
        return primos;
    }

    public void setPrimos(ArrayList<Integer> primos) {
        this.primos = primos;
    }

    public int getDigitos() {
        return digitos;
    }

    public void setDigitos(int digitos) {
        this.digitos = digitos;
    }

}
