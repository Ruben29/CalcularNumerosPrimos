package calcularnumerosprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author rfernandezgonzalez
 */
public class Vista {
    
    public void imprimir(int i) {
        
        System.out.println(i);
    }
    
    public void introducir(Modelo mod) {
        
        mod.setDigitos();
        
    }
    
}
