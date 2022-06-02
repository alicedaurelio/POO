
/**
 * Classe ciada para instanciar objetos do tipo Eletrodomestico 
 * @author Andressa Cristina 
 * @since Classe criada dia 12/05/2022
 */
public class Residencia {
    public static void main(String[] args) throws InterruptedException {
        //TV tv = new TV("LG", 65, false);
        //tv.ligar();
       // tv.desligar(10);        
        
        Microondas mc = new Microondas("Multir", 25, false);
       // mc.ligarMais30s();
       mc.ligarTempoUsuario(10);
        

    }//fim do main
    
    
}//fim da classe
