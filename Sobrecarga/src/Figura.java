
import javax.swing.JOptionPane;

/**
 * Classe criada para demonstrar o conceito da sobrecarga dos métodos
 * @author Alice Daurelio
 * @since CLasse criada em 31/03/2022
 */
public class Figura {
    Integer a, b, c, d;
    
    //Construtor genérico para qualquer tipo de figura
    // com a quantidade de parâmetros passado na instanciação
    
    public Figura(){
        int opc = 0;                        // opc = opção
        String msg;
        msg =     "\n1 - Ponto\n"
                + "2 - Linha\n"
                + "3 - Triângulo\n"
                + "4 - Retângulo\n"
                + "5 - Sair...";
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tipo de figura que você deseja construir: " + "construir" + msg, "Desenhar uma figura", -1));
        
        switch(opc){
            case 1: a = Integer.parseInt(JOptionPane.showInputDialog("A"));
                    break;
            case 2: a = Integer.parseInt(JOptionPane.showInputDialog("A"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("B"));
                    break;        
            case 3: a = Integer.parseInt(JOptionPane.showInputDialog("A"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("B"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("C"));
                    break;
            case 4: a = Integer.parseInt(JOptionPane.showInputDialog("A"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("B"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("C"));
                    d = Integer.parseInt(JOptionPane.showInputDialog("D"));
                    break;
            case 5: System.exit(0);
            
            default: JOptionPane.showMessageDialog(null, "Esta opção não exite");
        }
    }
    
    //Construtor para gerar um ponto
    public Figura(int a){                                         // um ponto
        this.a = a;
    }
        
    public Figura(int a, int b){                               // dois pontos
        this.a = a; 
        this.b = b;
    }
    
    //Construtor para gerar um objeto do tipo linha
    public Figura(int a, int b, int c){                        // 3 pontos - triangulo
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Figura(int a, int b, int c, int d){               // 4 pontos - retangulo
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    /*
    * O que diferencia a chamada de metodos (construtores ou comuns) é a sua assinatura
      ou seja: tipo, quantidade e ordem dos parâmetros
    */
    
    //Método para identificar o tipo de Figura
    public void exibirFigura(){
        if (a != null && b == null && c == null && d == null)                   // passando um valor
            exibirFigura(1);
        else if (a != null && b != null && c == null && d == null)              // passando dois valores
            exibirFigura("www");        
        else if (a != null && b != null && c != null && d == null)              // passando três valores
            exibirFigura(true);
        else if (a != null && b != null && c != null && d != null)              // passando quatro valores
            exibirFigura(1.5f);
    }
    
    //Método para exibir um valor de um ponto
    
    // Construtor para gerar um objeto Ponto
    public void exibirFigura(int x){
        System.out.println("É um ponto de valor: " + a);
    }
    
    //Construtor para gerar um objeto do tipo Linha (Dois pontos)
    public void exibirFigura(String s){        
        
        System.out.println("Linha de coordenadas de " + a + " e " + b);
    }
    
    // Construtor para gerar um objeto do tipo Triângulo
    public void exibirFigura(boolean x){
        System.out.println("É um triângulo com os ponto de valor: " + a + "," + b + " e " + c);
    }
     
    // Construtor para gerar um objeto do tipo Retângulo
     public void exibirFigura(float x){
        System.out.println("É um retângulo com os ponto de valor: " + a + "," + b + "," + c + "," + d);
    }
} // fim da classe Figura
