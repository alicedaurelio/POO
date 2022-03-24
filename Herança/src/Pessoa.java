/**
 * Classe criada para demonstrar o princípio da Herança
 * @author Alice Daurelio Dias
 * @since Classe criada em 24/03/2022
 */

public class Pessoa { // Super Classe
    String nome;
    int idade;
    float altura;
    
    // Método Construtor do objeto em memória (metodo principal), e do tipo Pessoa
    public Pessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    // Método comum para exibir os dados de uma pessoa na tela. Do tipo VOID que não retornará nada
    public void exibirPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + altura);
        System.out.println("Altura: " + altura);
        
    }
} // fim da classe Pessoa
