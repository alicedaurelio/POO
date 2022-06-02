
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Classe criada para demonstrar a concorrência entre processos por meio da execução
 * de múltiplas Threads
 * @author Alice Daurelio Dias
 * @since Classe criada em 02/06/2022
 */
public class Processo extends Thread{
    
    String nome;
    int sleepTime;              // sleep time - dormência da thread
    
    //Construtor da classe processo
    
    public Processo(String nome)
    {
        super(nome);
        this.nome = nome;
        sleepTime = (int)(10000 * Math.random());
        System.out.println("A Thread " + nome + " foi dormir por " + sleepTime + "ms");
    }
    
    public void run()
    {
        try {
            Thread.sleep(sleepTime);
            
        } catch (InterruptedException ex) {
            System.out.println("A Thread " + nome + " foi interrompida!! ");
        }
        System.err.println("A Thread " + nome + " despertou ...");
    }
}// fim da classe Processo
