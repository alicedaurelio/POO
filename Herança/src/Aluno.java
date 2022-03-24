/**
 * Classe criada para demonstrar a Herança da classe Aluno que herda TODOS os atributos e metodos da SUPER CLASSE Pessoa
 * @author Alice
 * @since Classe criada em 24/03/2022
 */

// "Aluno extends Pessoa" - Aluno herda, amplia (extends) tudo da classe Pessoa
    public class Aluno extends Pessoa {

       int ra;
       String curso;
       float nota;
       
                    //parametros da super classe          // parametros exclusivo de aluno
       public Aluno(String nome, int idade, float altura, int ra, String curso, float nota){
           
           super(nome, idade, altura); // enviando 3 parametros para a super classe Pessoa
           this.ra = ra;               // parametro exclusivo de ALUNO
           this.curso = curso;         // parametro exclusivo de ALUNO
           this.nota = nota;           // parametro exclusivo de ALUNO
       }
       
// Metodo para exibir os dados de um aluno
    public void exibirAluno(){
        
        super.exibirPessoa();               //Acessar o que esta na super classe, para mostrar em aluno alem do ra, curso e nota, mostrar tambem o nome, idade, e altura que esta na classe Pessoa
        System.out.println("RA: " + ra);
        System.out.println("Curso: " + curso);
        System.out.println("Nota: " + nota);
    }
    
    //Metodo para analisar qual a condição do aluno. (Reprovado, Exame, Aprovado)
    public void analisarNota(){
        if(nota < 4.0)
            System.err.println("O aluno (a) " + nome + " está REPROVADO(A)!");
        else if(nota < 6.0)
            System.err.println("O aluno (a)" + nome + " fará EXAME!");
        else
            System.out.println("Parabéns " + nome + ", você está APROVADO(A)!!!");
    }
    
    //Metodo para comparar o índice acadêmico entre os dois alunos
    
    public void compararIndiceAcademicoDoisAlunos(Aluno a){                  // a - aluno 1     b - aluno 2
        if(a.nota > nota)
            System.out.println("O aluno (a) " + a.nome + " tem o melhor Índice Acadêmico");
        else if(a.nota < nota)
            System.out.println("O aluno (a) " + nome + " tem o melhor IA");
        else
            System.out.println("Os índices acadêmicos são IGUAIS!!!");
    }
       
} // fim da classe Aluno