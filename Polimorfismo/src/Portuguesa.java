

/**
 * classe concreta para implementar os metodos da interface pizza
 * @author jonatas
 * @since interface criada em 19/05/2022
 */
public class Portuguesa implements Pizza {

    @Override
    //ingredientes para montar uma pizza portuguesa
    public void montar() {
        System.out.println("portuguesa");
        System.out.println("Ingredientes: Muçarela, Presunto, Tomate, Ovo cozido,"
                + " Cebola, Molho de tomate Cebola e azeitonas pretas");      
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 15 min");
        
    }

    @Override
    public void cobrar() {
        System.out.println("Valor a cobrar: R$ 45,00 ");        
    }
    
}//fim da classe Portuguesa
