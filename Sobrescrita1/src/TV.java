/**
 * Classe criada para demonstrar a SOBRESCRITA de metodos dentro de uma estrutura de herança
 * @author Alice Daurelio Dias
 * @since Classe criada em 07/04/2022
 */

//A classe TV é herdeira da Classe principal Eletrodomestico

public class TV extends Eletrodomestico{           // tv extends (herda) de Eletrodomestico
    String modelo;
    int polegadas;
    boolean smart;
    
    //Construtor da Classe

    public TV(String marca, int voltagem, String modelo, int polegadas, boolean smart) {
        super(marca, voltagem);
        this.modelo = modelo;
        this.polegadas = polegadas;
        this.smart = smart;
    }
    
    //Método comum para exibir os dados de uma TV
    
    @Override
    public void exibirEletrodomestico(){
        System.out.println("É uma TV da marca " + marca + " e de " + polegadas + " polegadas\"");
    }
    
    //Metodo sobrecarregado
    public void exibirEletrodomestico(int x){
        System.out.println("Marca: " + super.marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho: " + polegadas + "\"");
        System.out.println("É Smart TV: " + (smart?"Sim":"Não"));
        System.out.println("Voltagem: " + super.voltagem + "v"); 
    }
    
    //Método sobreescrito da super classe Eletrodoméstico
    
    @Override
    public void testarVoltagem(){
        System.out.println("\nÉ uma TV da marca " + super.marca);
        super.testarVoltagem();
    }
    
    //Método sobrecarregado
    
    public void testarVoltagem(String z){
      
        super.testarVoltagem();
        System.out.println("A TV" + modelo + " é Smart TV? " + (smart?"Sim":"Não"));
    }
   
    
    
}//fim da classe TV
