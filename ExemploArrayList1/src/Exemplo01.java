
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel de Oliveira Ferreira
 */
public class Exemplo01 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(21);
        numeros.add(22);
        numeros.add(23);
        numeros.add(23 + 1);
        numeros.add(25);

        int numerosPosicao0 = numeros.get(0);
        int numerosPosicao1 = numeros.get(1);
        int numerosPosicao2 = numeros.get(2);
        int numerosPosicao3 = numeros.get(3);
        int numerosPosicao4 = numeros.get(4);

        System.out.println(
                "Números: "
                + "\n[0] =>" + numerosPosicao0
                + "\n[1] =>" + numerosPosicao1
                + "\n[2] =>" + numerosPosicao2
                + "\n[3] =>" + numerosPosicao3
                + "\n[4] =>" + numerosPosicao4);

        double soma = numeros.get(0) + numeros.get(1) + numeros.get(2)
                + numeros.get(3) + numeros.get(4);

        System.out.println("Soma: " + soma);
    }

}
