/**
 * @author Gabriel de Oliveira Ferreira
 */
public class Personagem {
    private String nome, cla, aldeia;
    private long nivelChakra;
    
    //permitir guardar informação
    public void setNome(String x1) {
        if (x1.trim().equals("")) {
            throw new
                IllegalArgumentException(
                "Nome não pode ser vazio!!");
        }
        if (x1.trim().length() < 3) {
            throw new IllegalArgumentException(
            "Nome tem que conter no minimo 3 caracteres");
        }
        this.nome = x1;
    }
    public String getNome(){
        return nome;
    }
}
