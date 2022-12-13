import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    double fNum;
    double sNum;
    char action;
    private JPanel contentPanel;
    private JButton a1Button;
    private JButton a4Button;
    private JButton button5;
    private JButton CEButton;
    private JButton a7Button;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton xButton1;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button16;
    private JButton xButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JTextField textField1;

    public Calculator() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField1.getText().equals("0")){
                    setNum("0");
                }
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNum("9");
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fNum = Double.parseDouble(textField1.getText());
                textField1.setText("");
                action = '+';
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sNum = Double.parseDouble(textField1.getText());
                if(action == '+'){
                    fNum+=sNum;
                    textField1.setText(String.valueOf(fNum));
                } else if (action == '-') {
                    fNum-=sNum;
                    textField1.setText(String.valueOf(fNum));
                }else if (action == '*') {
                    fNum*=sNum;
                    textField1.setText(String.valueOf(fNum));
                }else if (action == '/') {
                    fNum/=sNum;
                    textField1.setText(String.valueOf(fNum));
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fNum = Double.parseDouble(textField1.getText());
                textField1.setText("");
                action = '-';
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fNum = Double.parseDouble(textField1.getText());
                textField1.setText("");
                action = '*';
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fNum = Double.parseDouble(textField1.getText());
                textField1.setText("");
                action = '/';
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = '.';
                fNum = 0;
                sNum = 0;
                textField1.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(textField1.getText());
                textField1.setText(String.valueOf(x*x));
            }
        });
        xButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(textField1.getText());
                textField1.setText(String.valueOf(Math.sqrt(x)));
            }
        });
    }
    public void setNum(String number){
        if(textField1.getText().equals("0")){
            textField1.setText(number);
        }
        else{
            textField1.setText(textField1.getText()+number);
        }
    }

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Calculator");
        mainFrame.setContentPane(new Calculator().contentPanel);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
