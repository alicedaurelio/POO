/**
 * Classe criada para gerar as instâncias de Aluno e Professor
 * @author Alice
 * @since Classe criada em 24/03/2022 
 */
public class Faculdade {
    public static void main(String[] args){      // atalho PSVM - public static void main
        
        Aluno aluno1, aluno2;
        aluno1 = new Aluno("Alice",20,1.60f,254445,"ADS",9.00f);  // 1.60f é porque a variavel é float. Porque em java tudo com casa decimal ele entende como double. Colocar f na frente ele entende que é float
        aluno2 = new Aluno("Eduardo",23,1.80f,361547,"Gestão Comercial",8.00f);
       
        aluno1.exibirAluno();                // exibir o que tem no metodo exibir Aluno - RA, curso e nota
        aluno2.exibirAluno();                // exibir o que tem no metodo exibir Aluno - RA, curso e nota
        
        aluno1.compararIndiceAcademicoDoisAlunos(aluno2);
        
        
        Professor professor = new Professor("Marcos", 40, 1.70f, 04, "Calculo","Mestre", 5.000f);
        
        professor.exibirProfessor();
        
    } // fim do main
    
} // fim da classe Faculdade
                                                                                                                                                                                                                                                                                                  