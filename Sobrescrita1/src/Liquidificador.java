/**
 * Classe criada para demonstrar a SOBRESCRITA de metodos dentro de uma estrutura de herança
 * @author Alice Daurelio Dias
 * @since Classe criada em 07/04/2022
 */

public class Liquidificador extends Eletrodomestico{
    String material;
    int preco;

    //Construtor da Classe
    public Liquidificador(String marca, int voltagem, String material, int preco){
        super(marca, voltagem);
        this.material = marca;
        this.preco = preco;
    }
    
    //Método comum para exibir os dados do Liquidificador
    public void exibirLiquidificador(){
        System.out.println("\nÉ um Liquidificador do material " + material + " e com valor de " + preco);
    }
    
    //Metodo sobrecarregado
    public void exibirLiquidificador(double t){
    System.out.println("Marca: " + super.marca);
    System.out.println("Material: " + material);
    System.out.println("Valor: " + preco);
    System.out.println("Voltagem: " + super.voltagem + "v"); 
    }
    
}
