
/**
 * Classe criada para implementar os métodos da interface Eletrodoméstico.
 * @author Kevin Lima
 * @since Classe criada em 12/05/2022
 */
public class Microondas implements Eletrodomestico {
    String marca;
    int volume;
    boolean ligado;
    
    //Construtor da classe 

    public Microondas(String marca, int volume, boolean ligado) {
        this.marca = marca;
        this.volume = volume;
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        System.out.println("O microondas foi ligado!");
        this.ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("Piiiiiiiiiii - o microondas foi desligado");
        this.ligado = false;
    }
    
    //Ligar o microondas com o botão mais 30 segundos
    public void ligarMais30Segundos() throws InterruptedException{
        ligar();
        System.out.println("O microondas funcionará por 30 segundos");
        Thread.sleep(30*1000);
        desligar();
    }
    //Ligar o microondas com o tempo escolhido pelo usuário
    public void ligarTempoUsuario(int tempo) throws InterruptedException {
        ligar();
        System.out.println("O microondas funcionará por " + tempo + " segundos.");
        while(tempo > 0) {
            System.out.println(tempo);
            Thread.sleep(1000);
            tempo--;
        }
        
        desligar();
        
    }
    //Ligar o microondas com  a tecla pipoca
    public void ligarPipoca() throws InterruptedException{
        ligar();
        System.out.println("O microondas em 1 minuto e 30 segundos!");
        Thread.sleep(130*1000);
        desligar();
    }
        
        
}//Fim da classe Microondas
