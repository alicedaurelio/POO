
/**
 * Classe criada para implementar os métodos da Interface de Eletrodoméstico  
 * @author Andressa Cristina
 * @since Classe criada 12/05/2022
 */

public class TV implements Eletrodomestico{
    String marca;
    int polegada;
    boolean ligada;
    
    //Construtor da classe
    public TV(String marca, int polegada, boolean ligada) {
        this.marca = marca;
        this.polegada = polegada;
        this.ligada = ligada;
    }
   
    public void exibirTV (){
        System.out.println("Marca: "+marca);
        System.out.println("Polegada: "+polegada);
        System.out.println("Ligada: " +ligada);
    
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
        System.out.println("A TV será desligada em " +tempo+ " segundos");
        Thread.sleep(tempo*1000);
        desligar();        
    }
    
    
    
    
}//fim da classe TV
