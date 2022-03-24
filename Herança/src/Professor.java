/**
 * Classe criada para...
 * @author Alice
 * @since Classe criada em 24/03/2022 
 */

// "Professor extends Pessoa" - Pessoa herda, amplia (extends) tudo da classe Pessoa
    public class Professor extends Pessoa {
    
        int codigo;
        String disciplina;
        String titulacao;
        float salario;
        
    public Professor(String nome, int idade, float altura, int codigo, String disciplina, String titulacao, float salario){
    
        super(nome, idade, altura);
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.titulacao = titulacao;
        this.salario = salario;
   }
    
    public void exibirProfessor(){
        
        System.out.println("Nome: " + nome);
        System.out.println("Titulção: " + titulacao);
        System.out.println("Salário: " + salario);
    }
    
    public void analisarSalario(){
           
       if (salario < 3000)
            System.out.println("Auxiliar");
       else if(salario > 3001 && salario < 5000)
            System.out.println("Assistente");
       else if(salario > 5001 && salario < 8000)
            System.out.println("Associado");
       else
            System.out.println("Pleno");
    }
    
} // fim da classe Professor
