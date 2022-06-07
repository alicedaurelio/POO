
/**
 * interface para determinar um padrão de fabricação de objeto do tipo pizza
 * @author Jonatas de sousa
 * @since interface criada em 19/05/2022
 */

public interface Pizza {
    //método para montar um pizza com seus ingredientes
    public void montar();
    //Método para o tempo que a pizza ficará no forno
    public void assar();
    //Método para realizar a cobrança da pizza
    public void cobrar();
    
}// Fim da interface
