

/**
 * Classe criada para demonstrar o paralelimos entre Threads
 * @author Aluno02
 */
public class Processador {
    public static void main(String[] args) throws InterruptedException  {
        
        int cont = 0;
        
        while(cont < 5){
            Janela janela = new Janela();
            janela.start();
            Thread.sleep(500);
            cont++;
        }
        
    }// fim do main
} // fim da classe Processador

/*     
        Processo T1, T2, T3, T4;
        T1 = new Processo("Hoje amanheceu cheio de neblina!");
        T2 = new Processo("Alice Daurelio");
        T3 = new Processo("Banco de Dados");
        T4 = new Processo("Galinha pintadinha");
        
        T1.start();
        T2.start();
        T3.start();
        T4.start();
*/
