
/**
 * Classe criada para demonstrar o recurso de SOBRESCRITA de metodos
 * @author Alice Daurelio Dias
 * @since Classe criada em 07/04/2022
 * 
 */
public class Eletrodomestico {
    String marca;
    int voltagem;
    
    //Metodo construtor de Eletrodomestico
    public Eletrodomestico(String marca, int voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
    }
    
    
    //Método para exibir os dados de um Eletrodomestico
    public void exibirEletrodomestico(){
        System.out.println("Este objeto é um Eletrodoméstico");
    }
    
    //Metodo para testar a vontagem do aparelho
    
    public void testarVoltagem(){
        if(voltagem == 110)
            System.out.println("Eletrodoméstico de 110 volts");
        else if(voltagem == 220)
            System.err.println("CUIDADO, eletrodoméstico de 220 volts ");
        else
            System.out.println("Aparelho de baixa voltagem...");
    }
    
    
     //Método para exibir os dados de um Liquidificador
    public void exibirLiquidificador(){
         System.out.println("Este objeto é um Liquidificador");
    }
    
}// fim da classe Eletrodomestico
