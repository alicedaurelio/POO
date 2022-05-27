/** 
 * Classe criada para instanciar objetos do tipo eletrodomestico.
 * @author Kevin Lima
 * @since Classe criada em 12/05/2022
 */
public class Residencia {
    public static void main(String[] args) throws InterruptedException {
        TV tv = new TV("LG", 65, false);
        //tv.ligar();
        //tv.desligar(10);
        
        Microondas mc = new Microondas("Electrolux", 25, false);
        //mc.ligarTempoUsuario(50);
        mc.ligarPipoca();
    }//Fiim do main
}//Fim da classe Residencia
