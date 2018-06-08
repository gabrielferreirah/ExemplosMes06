
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class Exemplo04 {

    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane
                .showInputDialog("Digite a quantidade de cadastros"));
        ArrayList<Character> letras = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            letras.add(JOptionPane.showInputDialog("Letra").charAt(0));
        }
        
        String caracteres = "";
        for (int i = 0; i < letras.size(); i++) {
            caracteres += letras.get(i) + "/n";
        }
        JOptionPane.showMessageDialog(null, letras);
    }
}
