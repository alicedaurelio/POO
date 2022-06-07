

/**
 * Classe criada para executar as tarefas de preparo de pizza
 * @author Jonatas
 * @since interface criada em 19/05/2022
 */
public class Forno {
    //método para preparar todo e qualquer tipo de pizza
    public void preparar(Pizza pizza){
        pizza.montar();
        pizza.assar();
        pizza.cobrar();
        
    }// fim do metodo preparar
    
}// fim da classe forno
