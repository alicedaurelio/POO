//sessão de importação
import javax.swing.JOptionPane;



/**
 * Classe criada para gerar um objeto do tipo menu, para mostrar o cardápio da
 * Pizzaria
 * @author Jonatas
 * @since interface criada em 19/05/2022
 */
public class Menu {
    Pizza pizza;
    Forno forno = new Forno();
    //construtor da classe menu
    
    public Menu(){
        
        while(true){
        String msg;
        int opc;
        msg = "1 - Portuguesa\n2 - Caipira\n3 - Prestigio\n4 - Pão\n5 - Sair";
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,msg));
        
        switch (opc){
            case 1: pizza = new Portuguesa();
            break;
            case 2: pizza = new Caipira();
            break;
            case 3: pizza = new Prestigio();
            break;
            case 4: pizza = new Pão();
            break;
            case 5: System.exit(0);
            default: JOptionPane.showMessageDialog(null,"walbão garoto de programa!!");
            
        }// fim do switch
        forno.preparar(pizza);
        }//fim do while
    }// fim do construtor
    
    
}// fim da classe menu
