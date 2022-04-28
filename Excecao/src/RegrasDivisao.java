
/**
 * Classe criada para tratar as excecões específicas da classe Divisão
 * @author Alice Dias
 * @since Classe criada em 28/04/2022
 */
class RegrasDivisao extends Exception {
    
    public RegrasDivisao(){
        super("O número A tem que ser maior que o número B");
    }
    
    public RegrasDivisao(int x){
        super("O número B NÃO pode ser NEGATIVO!!!");
    }
    
     public RegrasDivisao(boolean x){
        super("O número A NÃO pode ser MAIOR que ");
    }
}

