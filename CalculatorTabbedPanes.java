package lab3_jtabbedpane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class CalculatorTabbedPane extends JFrame implements ActionListener {

    JTabbedPane CRWHTabbedPane;
    
    JPanel CRWHAddPanel;
    JPanel CRWHSubPanel;
    JPanel CRWHMulPanel;
    JPanel CRWHDivPanel;
    
    JTextField CRWHTextField1;
    JTextField CRWHTextField2;
    JTextField CRWHTextField3;
    JTextField CRWHTextField4;
    JTextField CRWHTextField5;
    JTextField CRWHTextField6;
    JTextField CRWHTextField7;
    JTextField CRWHTextField8;
    
    JLabel CRWHResultsLabel1;
    JLabel CRWHResultsLabel2;
    JLabel CRWHResultsLabel3;
    JLabel CRWHResultsLabel4;
    
    JButton addButton;
    JButton subButton;
    JButton mulButton;
    JButton divButton;

    public CalculatorTabbedPane() {
        CRWHTabbedPane = new JTabbedPane();
        CRWHAddPanel = new JPanel();
        CRWHSubPanel = new JPanel();
        CRWHMulPanel = new JPanel();
        CRWHDivPanel = new JPanel();

        CRWHTextField1 = new JTextField("0");
        CRWHTextField2 = new JTextField("0");
        CRWHTextField3 = new JTextField("0");
        CRWHTextField4 = new JTextField("0");
        CRWHTextField5 = new JTextField("0");
        CRWHTextField6 = new JTextField("0");
        CRWHTextField7 = new JTextField("0");
        CRWHTextField8 = new JTextField("0");
        
        CRWHResultsLabel1 = new JLabel("Answer");
        CRWHResultsLabel2 = new JLabel("Answer");
        CRWHResultsLabel3 = new JLabel("Answer");
        CRWHResultsLabel4 = new JLabel("Answer");
        
        addButton = new JButton("ADD");
        subButton = new JButton("SUB");
        mulButton = new JButton("MUL");
        divButton = new JButton("DIV");

        //Listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        
        //[ADD Layout]
        CRWHAddPanel.setLayout(new GridLayout(2, 2));
        CRWHAddPanel.add(CRWHTextField1);
        CRWHAddPanel.add(CRWHTextField2);
        CRWHAddPanel.add(CRWHResultsLabel1);
        CRWHAddPanel.add(addButton);

        //[SUB Layout]
        CRWHSubPanel.setLayout(new GridLayout(2, 2));
        CRWHSubPanel.add(CRWHTextField3);
        CRWHSubPanel.add(CRWHTextField4);
        CRWHSubPanel.add(CRWHResultsLabel2);
        CRWHSubPanel.add(subButton);
        
        //[MUL Layout]
        CRWHMulPanel.setLayout(new GridLayout(2, 2));
        CRWHMulPanel.add(CRWHTextField5);
        CRWHMulPanel.add(CRWHTextField6);
        CRWHMulPanel.add(CRWHResultsLabel3);
        CRWHMulPanel.add(mulButton);
        
        //[DIV Layout]
        CRWHDivPanel.setLayout(new GridLayout(2, 2));
        CRWHDivPanel.add(CRWHTextField7);
        CRWHDivPanel.add(CRWHTextField8);
        CRWHDivPanel.add(CRWHResultsLabel4);
        CRWHDivPanel.add(divButton);

        ImageIcon addPic = new ImageIcon("images/plus.png");
        ImageIcon subPic = new ImageIcon("images/subtract.png");
        ImageIcon mulPic = new ImageIcon("images/multiply.png");
        ImageIcon divPic = new ImageIcon("images/divide.png");

        //TABS & MNEMONICS
        CRWHTabbedPane.addTab("ADD", addPic, CRWHAddPanel, "Click to add numbers");
        CRWHTabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        CRWHTabbedPane.addTab("SUB", subPic, CRWHSubPanel, "Click to subtract numbers");
        CRWHTabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        CRWHTabbedPane.addTab("MUL", mulPic, CRWHMulPanel, "Click to multiply numbers");
        CRWHTabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        CRWHTabbedPane.addTab("DIV", divPic, CRWHDivPanel, "Click to divide numbers");
        CRWHTabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        //The Framework
        this.getContentPane().add(CRWHTabbedPane);
        this.setPreferredSize(new Dimension(450, 250));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String trigger = ae.getSource().toString();
        if (trigger.contains("ADD")) {
            int num1 = Integer.parseInt(CRWHTextField1.getText());
            int num2 = Integer.parseInt(CRWHTextField2.getText());
            CRWHResultsLabel1.setText("The Answer is: " + (num1 + num2));   
        }
        if (trigger.contains("SUB")) {
            int num1 = Integer.parseInt(CRWHTextField3.getText());
            int num2 = Integer.parseInt(CRWHTextField4.getText());
            CRWHResultsLabel2.setText("The Answer is: " + (num1 - num2));
        }
        if (trigger.contains("MUL")) {
            int num1 = Integer.parseInt(CRWHTextField5.getText());
            int num2 = Integer.parseInt(CRWHTextField6.getText());
            CRWHResultsLabel3.setText("The Answer is: " + (num1 * num2));
        }
        if (trigger.contains("DIV")) {
            int num1 = Integer.parseInt(CRWHTextField7.getText());
            int num2 = Integer.parseInt(CRWHTextField8.getText());
            CRWHResultsLabel4.setText("The Answer is: " + (num1 / num2));
            }
    }
}
//END
