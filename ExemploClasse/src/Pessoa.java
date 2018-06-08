/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Pessoa {

    // Atributos == características
    public String nome, sobrenome, cpf;
    public byte idade;
    public float peso, altura;
    public char sexo;

    @Override
    public String toString(){
        return "Nome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade
                + "\nPeso: " + peso
                + "\nAltura: " + altura
                + "\nSexo: " + sexo
                + "\nCPF: " + cpf;
    }
}
