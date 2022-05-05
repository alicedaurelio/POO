
/**
 * Classe criada para instanciar os objetos do tipo Conta
 * @author Alice
 * @since Classe criada em 05/05/2022
 */
public class Banco {
    public static void main(String[] args) {
        Conta c1 = new Conta("Alice", 998844, 300f, 1234);
        c1.exibirDadosConta();
        c1.modificarSaldo();
        c1.exibirDadosConta();
    }// fim do main
}// fim da classe banco
