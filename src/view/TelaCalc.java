package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
        setSize(360, 480);
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        jpDisplay = new JPanel();
        jpButtons = new JPanel(new BorderLayout(8, 8));
        jpNumbers = new JPanel(new GridLayout(4, 3, 8, 8));
        jpOperations = new JPanel(new GridLayout(5, 1, 8, 8));
        
        jtfDisplay = new JTextField();
        
        jbButton0 = new JButton("0");
        jbButton1 = new JButton("1");
        jbButton2 = new JButton("2");
        jbButton3 = new JButton("3");
        jbButton4 = new JButton("4");
        jbButton5 = new JButton("5");
        jbButton6 = new JButton("6");
        jbButton7 = new JButton("7");
        jbButton8 = new JButton("8");
        jbButton9 = new JButton("9");
        jbComma = new JButton(",");
        jbEquals = new JButton("=");
        
        jbClear = new JButton("C");
        jbAdd = new JButton("+");
        jbSub = new JButton("-");
        jbMult = new JButton("*");
        jbDiv = new JButton("/");
        
        jtfDisplay.setHorizontalAlignment(JTextField.RIGHT);
        jtfDisplay.setPreferredSize(new Dimension(320, 60));
        
        jpDisplay.add(jtfDisplay);
        jpButtons.add(jpNumbers, BorderLayout.WEST);
        jpButtons.add(jpOperations, BorderLayout.EAST);
        jpDisplay.add(jtfDisplay);
        
        jpNumbers.add(jbButton7);
        jpNumbers.add(jbButton8);
        jpNumbers.add(jbButton9);
        jpNumbers.add(jbButton4);
        jpNumbers.add(jbButton5);
        jpNumbers.add(jbButton6);
        jpNumbers.add(jbButton1);
        jpNumbers.add(jbButton2);
        jpNumbers.add(jbButton3);
        jpNumbers.add(jbButton0);
        jpNumbers.add(jbComma);
        jpNumbers.add(jbEquals);
        
        jpOperations.add(jbClear);
        jpOperations.add(jbAdd);
        jpOperations.add(jbSub);
        jpOperations.add(jbMult);
        jpOperations.add(jbDiv);
        
        add(jpDisplay, BorderLayout.NORTH);
        add(jpButtons, BorderLayout.CENTER);
    }
    
    private void actions() {
        
    }
}
