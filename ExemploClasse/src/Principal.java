
import javax.swing.JOptionPane;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class Principal {

    public static void main(String[] args) {
        
        Pessoa lucas = new Pessoa();
        lucas.nome = "Lucas";
        lucas.idade = 16;
        lucas.peso = 94.0f;
        lucas.altura = 1.94f;
        lucas.sexo = 'm';
        lucas.cpf = "123.456.789-10";
        lucas.sobrenome = "Rodrigo";
        
        Pessoa carlos = new Pessoa();
        carlos.nome = "Carlos";
        carlos.sobrenome = "Augusto";
        carlos.idade = 18;
        carlos.altura = 1.78f;
        carlos.sexo = 'm';
        carlos.peso = 78;
        carlos.cpf = "098.765.432-10";
        
        JOptionPane.showMessageDialog(null, lucas.toString()
        );
        
    }
    
}
