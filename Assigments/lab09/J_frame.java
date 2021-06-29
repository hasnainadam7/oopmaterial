
import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//maam i have tried to make body by code not by drag and drop my pc have some issue IN using netbeans
public class J_frame extends JFrame implements ActionListener {
    private JButton btnAdd, btnSub, btnMul, btnDiv, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnClear, btnEqual;
    private JTextField txtInput;

    public J_frame()// Constructor
    {
        // Screen Size,title,layout
        setTitle("Swing Calculator");
        setBounds(10, 10, 210, 200);

        setLayout(new FlowLayout(FlowLayout.RIGHT));
        // end
        // ---------------------Buttons & TextField---------------------------

        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnAdd = new JButton("+");
        btnSub = new JButton("-");
        btnDiv = new JButton("/");
        btnMul = new JButton("*");
        btnClear = new JButton("C");
        btnEqual = new JButton("=");
        txtInput = new JTextField(15);
        // ----------------------------------------------------//
        add(txtInput);
        add(btn9);
        add(btn8);
        add(btn7);
        add(btnMul);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btnDiv);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btnSub);
        add(btnClear);
        add(btn0);
        add(btnEqual);
        add(btnAdd);
        setResizable(false);
        setVisible(true);
        // Operatins System (Window 10) will listen button click.
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnDiv.addActionListener(this);
        btnMul.addActionListener(this);
        btnClear.addActionListener(this);
        btnEqual.addActionListener(this);
    }

    String digits = "0";//this is string for showing it in textfeild  i dont know how to show integer driectly in text field so i use string
    int sign = 0;//by using this int programe will decide which action perform add sub multiply or diveide
    int  value1, value2;//here we store values for calculating
    public void actionPerformed(ActionEvent ae) {
//--------Listining ,storing,  caclulation and showing value by buttons in strings integers tex field etc  
        if (ae.getSource() == btn9) {
            String no;
            no = ae.getActionCommand();
            digits += no;
        }
        if (ae.getSource() == btn8) {
            String no;
            no = ae.getActionCommand();
            this.digits += no;
        }
        if (ae.getSource() == btn7) {
            String no;
            no = ae.getActionCommand();
            this.digits += no;
        }
        if (ae.getSource() == btn0) {
            String no;
            no = ae.getActionCommand();
            this.digits += no;
        }
        if (ae.getSource() == btn6) {
            String no;
            no = ae.getActionCommand();
            this.digits += no;
        }
        if (ae.getSource() == btn5) {
            String no;
            no = ae.getActionCommand();
            this.digits += no;
        }
        if (ae.getSource() == btn4) {
            String no;
            no = ae.getActionCommand();
            this.digits += no;
        }
        if (ae.getSource() == btn3) {
            String no;
            no = ae.getActionCommand();
            this.digits += no;
        }
        if (ae.getSource() == btn2) {
            String no;
            no = ae.getActionCommand();
            this.digits += no;
        }
        if (ae.getSource() == btn1) {
            String no;
            no = ae.getActionCommand();
            this.digits += no;
        }
        
        if(ae.getSource()==btnClear){
            digits="0";
            sign=0;
            value1=0;
            value2=0;
        }
      
        if (ae.getSource() == btnMul) {
            sign = 1;
            digits = "0";
        } else if (ae.getSource() == btnDiv) {
            sign = 2;
            digits = "0";
        } else if (ae.getSource() == btnAdd) {
            sign = 3;
            digits = "0";
        } else if (ae.getSource() == btnSub) {
            sign = 4;
            digits = "0";
        }
        txtInput.setText(digits);
        //here i implment an logic for storing values 
        if (sign == 0) {
             value1 = Integer.parseInt(digits);
        }
        if (sign == 1 || sign == 2 || sign == 3 || sign == 4) {
            value2 = Integer.parseInt(digits);
        }
        txtInput.setText(digits);
        if (ae.getSource() == btnEqual) {
            //condition by using int name sign when 
            //sign equals to 1 do multiply with value one and two
            //sign equals to 2 do divide with value one and two
            //sign equals to 3 do addition with value one and two
            //sign equals to 4 do subtraction with value one and two
            //sign equals to 0 some thing missing value 2 or value 1 or pressing sign
            if (sign == 1) {
                txtInput.setText(Integer.toString(value1*value2));
            } else if (sign == 2) {
                txtInput.setText(Integer.toString(value1/value2));
            } else if (sign == 3) {
                txtInput.setText(Integer.toString(value1+value2));
            } else if (sign == 4) {
                txtInput.setText(Integer.toString(value1-value2));
            } else {
                System.out.print("Sign is null OR 2ND VALUE ARE MISSING");
            }
            //FOR MY CHECKING ANSWERS IS RIGHT OR WORNG
            System.out.println("value 1:" + value1);
            System.out.println("value 2:" + value2);
            System.out.println("for + :" + (value1+value2));
            System.out.println("for - :" + (value1-value2));
            System.out.println("for / :" + (value1/value2));
            System.out.println("for * :" + (value1*value2));
        }
    }

    public static void main(String[] args) {    
        J_frame e = new J_frame();
    }
}
