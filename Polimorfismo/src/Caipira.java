

/**
 *classe concreta para implementar os metodos da interface pizza
 * @author Jonatas
 * @since interface criada em 19/05/2022
 */
public class Caipira implements Pizza {

    @Override
    public void montar() {
        System.out.println("caipira");
        System.out.println("Ingredientes: Frango, Milho, Catupiry e molho de tomate");        
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 10 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor a cobrar: R$ 40,00");        
    }
    
    
}
