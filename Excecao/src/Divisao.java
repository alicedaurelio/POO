
import javax.swing.JOptionPane;

/**
 * Classe criada para demonstrar a utilização dos blocos Try...cath...throws
 * para o tratamento de exceção
 * @author Alice Dias
 * @since 28 de abril de 2022
 * 
 */
public class Divisao {
    public static void main(String[] args) {
        int a, b, result = 0;
        String numA, numB;
        
        numA = JOptionPane.showInputDialog("Digite o valor de A: ");
        numB = JOptionPane.showInputDialog("Digite o valor de B: ");
       
        try{
            a = Integer.parseInt(numA);
            b = Integer.parseInt(numB);
            result = dividir(a,b);
            JOptionPane.showMessageDialog(null, "Resultado: " + result);
        }
        catch(ArithmeticException erro){
            JOptionPane.showMessageDialog(null, "Não aceita divisão por ZERO!!");
        }
        catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite apenas números!!");
        }
        catch(RegrasDivisao erro){
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro do tipo: " + erro);
        }
    }//fim do main
    
    //Método para executar a divisão de dois números interios
    public static int dividir(int a, int b) throws RegrasDivisao{
        if(a < b)
            throw new RegrasDivisao();
        if(b < 0)
            throw new RegrasDivisao(1);
        if(a > 100)
            throw new RegrasDivisao(true);
        
        return a/b;
    }
    
} // fim da classe Divisao
