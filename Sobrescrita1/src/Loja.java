/**
 * Classe criada para instanciar objetos do tipo Eletrodomestico
 * @author Alice Daurelio Dias
 * @since Classe criada em 07/04/2022
 */
public class Loja {
    public static void main(String[] args) {
            
        Eletrodomestico e,x;
        
        TV tv1, tv2;
        tv1 = new TV("LG", 110, "Full HD super LED", 65, true);
        tv2 = new TV("Sony", 220, " Super tela QLED", 85, false);
        
        tv1.exibirEletrodomestico();
        tv2.exibirEletrodomestico();
        
        tv1.testarVoltagem();
        tv2.testarVoltagem("www");
        
        Liquidificador l;
        
        l = new Liquidificador("Mondial", 110, "Plastico", 119);
        
        l.exibirLiquidificador();
        l.exibirLiquidificador(1.2);
        
        
        /*
        e = new Eletrodomestico("Eletrolux", 110);      // e - variavel de referencia
        x = new Eletrodomestico("Walita", 220);      // x - variavel de referencia
        
        e.exibirEletrodomestico();
        x.exibirEletrodomestico();
        */
        
    }// fim do main    
}// fim da classe Loja
