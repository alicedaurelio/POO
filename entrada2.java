//Sess�o de impota��o 
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
	        
	        //Convers�o de String para Int
	        
	        a = Integer.parseInt(numA);  //utiliza��o do parser para a
	        b = Integer.parseInt(numB); //Convers�o de String para Inteiro
	        soma = a + b;
	        multi = a * b;
	        sub = a - b;
	        divi = (float)a / b; //casting para real(float)
	        pot = (int) Math.pow(a,b);
	        raiz = (int) Math.sqrt(a);      
	        

	        /**
	        Configura��o dos par�metros para a caixa de di�logo
	        JOptionPane.showMessageDialog(1,2,3,4);
	        1 - null/this
	        2 - Texto que aparece dentro da caixa de di�logo
	        3 - Texto da barra de t�tulo da caixa
	        4 - �cone(Faixa -1 � 3)
	        **/
	        
	        String msg;
	        msg = "A soma �: " + soma;
	        msg = msg + "\nA multiplica��o � : " + multi ;
	        msg = msg + "\nA subtra��o � : " + sub;
	        msg = msg + "\nA Divis�o � : " + divi;
	        msg = msg + "\nA Pot�ncia de " + a + " elevado a " + b + " � : " + pot;
	        msg = msg + "\nA Raiz Quadrada de " + a + " � : " + raiz ;
	        
	        JOptionPane.showMessageDialog(null, msg ,"Resultado das opra��es", 1);
	       
	        

	    } //fim do main 
	} //fim da classe
