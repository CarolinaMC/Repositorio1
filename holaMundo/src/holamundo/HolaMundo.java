package holamundo;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * Elaborado por: Carolina Mora Cordero
 * Fecha de creación: 11-02-2016
 */
public class HolaMundo extends JFrame {

   
    public HolaMundo(){
        super();
        
    }
    
    public void mostrar(){
        this.setVisible(true);
    }

    public void ajustarConfiguracionInicial(){
        this.setSize(70, 80);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void iniciar(){
        mostrar();
        ajustarConfiguracionInicial();
        agregarComponentes(this.getContentPane());
    }
    
    public void agregarComponentes(Container c){
        this.setLayout(new BorderLayout());
       
        panel1 = new JPanel();
        mensaje = new JLabel("¡Hola mundo!");
        
        panel1.add(mensaje);
        c.add(panel1, BorderLayout.CENTER);
       
    }
    
    public static void main(String[] args) {
        HolaMundo ventana= new HolaMundo();
       ventana.iniciar();
    }


    //Atritbutos
    private JPanel panel1;
    private JLabel mensaje;
    
}
