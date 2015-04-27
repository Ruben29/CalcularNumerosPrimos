package calcularnumerosprimos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rfernandezgonzalez
 */
public class Modelo {

    ArrayList<Integer> primos = new ArrayList<>();

    int digitos;

    public Modelo() {
    }

    public Modelo(int digitos) {
        this.digitos = digitos;
    }

    public int getDigitos() {
        return digitos;
    }

    public void setDigitos() {

        int num;

        do {

            String respuesta = JOptionPane.showInputDialog(null, "Introduzca un límite para encontrar los primos deseados" + "\n 1 = 9    2 = 99    3 = 999    4 = 9999");

            num = Integer.parseInt(respuesta);

        } while (num < 1 || num > 4);

        this.digitos = num;
    }

}
