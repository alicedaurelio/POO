

/**
 *classe concreta para implementar os metodos da interface pizza
 * @author Jonatas
 * @since interface criada em 19/05/2022
 */
public class Prestigio implements Pizza {

    @Override
    public void montar() {
        System.out.println("Prestigio");
        System.out.println("Ingredientes: Chocolate e côco");        
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 7 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor a cobrar: R$ 57,50 ");
        
    }
    
}
