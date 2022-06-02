
/**
 * Classe criada para implementar os métodos da interface Elotrodomestico
 * @author Aluno02
 * @since Classe criada dia 12/05/2022
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
        System.out.println("O Microondas foi ligado!!");
        this.ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("(barulhor desligando)O Microondas foi desligado");
        this.ligado = false;        
    }
    
    //ligar o microondas com o botão mais 30s
    public void ligarMais30s() throws InterruptedException{
        ligar();
        System.out.println("O Microondas fuincionará por 30 segundo!!!");
        Thread.sleep(30 * 1000);
        desligar();
    }
    
    //Ligar o microondas com um tempo escolhido pelo o usuário 
    public void ligarTempoUsuario(int tempo) throws InterruptedException{
        ligar();
        System.out.println("O Microondas funcionará por " +tempo+ " segundos");
        
        while(tempo > 0){
            System.out.println(tempo);
            Thread.sleep(500);
            tempo--;            
        }
        desligar();
    }
    //Ligar o microondas com a tecla pipoca
    public void ligarPipoca(){
        
    
        
    }
}
