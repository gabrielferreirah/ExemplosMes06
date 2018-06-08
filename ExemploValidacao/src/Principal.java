
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 0;
        while (true) {
            try {
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
                if (idade >= 0 && idade <= 130) {
                    break;
                }
                JOptionPane.showMessageDialog(null, "Idade inválida");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "IDADE INVÁLIDA super usuário");
                System.out.println(e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Idade: " + idade);
    }
    
}
