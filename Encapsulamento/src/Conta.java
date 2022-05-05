
import javax.swing.JOptionPane;


/**
 * Classe criada para demonstrar a utilização do princípio do Encapsulamento
 * @author Alice 
 * @since Classe ciada em 05/05/2022
 */
public class Conta {
    private String cliente;
    private int numeroConta;
    private float saldo;
    private int senha;
    
    //Construtor da classe

    public Conta(String cliente, int numeroConta, float saldo, int senha){
        
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    //Método para exibição dos dados da conta do Cliente
    public void exibirDadosConta(){
        System.out.println("Nome: " + cliente);
        System.out.println("Saldo: " + saldo);
    }
    
    //Método para modificar o saldo da conta
    public void modificarSaldo(){
        depositarValor();
    }
    
    private void depositarValor(){
        int numConta;
        numConta = Integer.parseInt(JOptionPane.showInputDialog("Conta: "));
        
        if(numConta == getNumeroConta()){
            float valorDeposito;
            valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Valor a depositar: "));
            // saldo = saldo + valorDeposito;
            setSaldo(getSaldo() + valorDeposito);
        }
        else
            JOptionPane.showMessageDialog(null, "Conta inválida!");
    }
    
    //Métodos assessores set & get
    private void setSaldo(float saldo){              // set guardar informações
        this.saldo = saldo;
    }
    
    private float getSaldo(){                        // get enviar informações
        return saldo;
    }

    private String getCliente() {
        return cliente;
    }

    private void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private int getNumeroConta() {
        return numeroConta;
    }

    private void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    private int getSenha() {
        return senha;
    }

    private void setSenha(int senha) {
        this.senha = senha;
    }
            
} // fim da classe Conta
