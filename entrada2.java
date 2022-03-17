//Sessão de impotação 
	import javax.swing.JOptionPane;


	/**
	 *Classe para gerar o primeiro programa em Java - Hello World
	 * @author Andressa Cristina
	 * @since Classe criada em 17/03/2022
	 */
	
	public class entrada2 {
	 
	    public static void main(String fatec[]){
	    	
	        int a, b;
	        int soma, multi, sub, pot, raiz;
	        float divi;
	        String numA, numB;
	        
	        //Entrada de dados em formato String - SEMPRE!1
	        
	        numA = JOptionPane.showInputDialog(null,"Digite o valor de A", "Valor de A",3);
	        numB = JOptionPane.showInputDialog(null,"Digite o valor de B", "Valor de B",3);
	        
	        //Conversão de String para Int
	        
	        a = Integer.parseInt(numA);  //utilização do parser para a
	        b = Integer.parseInt(numB); //Conversão de String para Inteiro
	        soma = a + b;
	        multi = a * b;
	        sub = a - b;
	        divi = (float)a / b; //casting para real(float)
	        pot = (int) Math.pow(a,b);
	        raiz = (int) Math.sqrt(a);      
	        

	        /**
	        Configuração dos parâmetros para a caixa de diálogo
	        JOptionPane.showMessageDialog(1,2,3,4);
	        1 - null/this
	        2 - Texto que aparece dentro da caixa de diálogo
	        3 - Texto da barra de título da caixa
	        4 - Ícone(Faixa -1 á 3)
	        **/
	        
	        String msg;
	        msg = "A soma é: " + soma;
	        msg = msg + "\nA multiplicação é : " + multi ;
	        msg = msg + "\nA subtração é : " + sub;
	        msg = msg + "\nA Divisão é : " + divi;
	        msg = msg + "\nA Potência de " + a + " elevado a " + b + " é : " + pot;
	        msg = msg + "\nA Raiz Quadrada de " + a + " é : " + raiz ;
	        
	        JOptionPane.showMessageDialog(null, msg ,"Resultado das oprações", 1);
	       
	        

	    } //fim do main 
	} //fim da classe
