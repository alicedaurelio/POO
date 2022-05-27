/**
 * Classe criada para implementar os métodos da Inteface Eletrodomestico.
 * @author Kevin Lima
 * @since Classe criada em 12/05/2022
 */
public class TV implements Eletrodomestico {
    String marca;
    int polegadas;
    boolean ligada;
    
    //Construtor da classe

    public TV(String marca, int polegadas, boolean ligada) {
        this.marca = marca;
        this.polegadas = polegadas;
        this.ligada = ligada;
    }
    
    public void exibirTV(){
        System.out.println("Marca: " + marca);
        System.out.println("Polegadas: " + polegadas);
        System.out.println("Ligada: " + ligada);
    }

    @Override
    public void ligar() {
       this.ligada = true;
        System.out.println("A TV foi ligada!!");
    
    }

    @Override
    public void desligar() {
        this.ligada = false;
        System.out.println("A TV foi desligada!!"); 
    }
    
    public void desligar(int tempo) throws InterruptedException{
        System.out.println("A TV será desligada em " + tempo + " minutos!");
        Thread.sleep(tempo*1000);
        desligar();
        
    }
}//Fim da classe TV
