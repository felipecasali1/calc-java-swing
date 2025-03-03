package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCalc extends JFrame {
    private JPanel jpDisplay;
    private JTextField jtfDisplay;
    
    private JPanel jpButtons;
    
    private JPanel jpNumbers;
    private JButton jbButton0;
    private JButton jbButton1;
    private JButton jbButton2;
    private JButton jbButton3;
    private JButton jbButton4;
    private JButton jbButton5;
    private JButton jbButton6;
    private JButton jbButton7;
    private JButton jbButton8;
    private JButton jbButton9;
    private JButton jbComma;
    private JButton jbEquals;
    
    private JPanel jpOperations;
    private JButton jbClear;
    private JButton jbAdd;
    private JButton jbSub;
    private JButton jbMult;
    private JButton jbDiv;
    
    public TelaCalc() {
        init();
        actions();
    }
    
    private void init() {
        setVisible(true);
        setSize(360, 480);
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        
    }
    
    private void actions() {
        
    }
}
