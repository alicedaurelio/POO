
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Classe criada para gerar um frame na tela
 * @author Alice daurelio dias
 * @since Classe criada em 02/06/2022
 */
    public class Janela extends Thread {
    JFrame frame = new JFrame();
    JPanel painel = new JPanel();
    JLabel label = new JLabel();
    
    public Janela(){
        frame.setTitle("Você se ferrou");
        label.setText("BANCO DE DADOS");
        painel.add(label);
        painel.setBackground(Color.getHSBColor((float)Math.random(),(float)Math.random(),(float)Math.random()));
        frame.add(painel);
        frame.setSize(400, 300);
        frame.setLocation((int)(1600*Math.random()), (int)(800*Math.random()));
        frame.setVisible(true);
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println("Houve uma interrupção");
        }
        frame.setVisible(false);
        frame.dispose();
    }
}
