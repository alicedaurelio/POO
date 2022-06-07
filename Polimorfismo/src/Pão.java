/**
 *
 * classe concreta para implementar os metodos da interface pizza
 * @author Jonatas
 * @since interface criada em 19/05/2022
 */
public class Pão implements Pizza {

    @Override
    public void montar() {
        System.out.println("Pão caseiro");
        System.out.println("Ingredientes: Farinha, fermento, ovos, leite e sal");       
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 60 min");        
    }

    @Override
    public void cobrar() {
        System.out.println("Valor a cobrar: R$ 10,00 ");        
    }
    
}// fim da classe Pão