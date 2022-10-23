package Programa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class calculadora {
    private JPanel Calculadora;
    private JTextField textdisplay;
    private JButton ACButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;
    private JButton fButton;
    private JButton button7;
    private JButton eButton;
    private JComboBox comboBox1;

    double a, b, result;
    String op;


    public calculadora() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a9Button.getText());

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a4Button.getText());

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a5Button.getText());

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a6Button.getText());

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a1Button.getText());

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a3Button.getText());

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a0Button.getText());

            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + a00Button.getText());

            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textdisplay.getText().contains(".")) {
                    double pn = Double.parseDouble(textdisplay.getText());
                    pn = pn * -1;
                    textdisplay.setText(String.valueOf(pn));
                } else {
                    long PM = Long.parseLong(textdisplay.getText());
                    PM = PM * 1;
                    textdisplay.setText(String.valueOf(PM));
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textdisplay.getText().contains(".")) {
                    textdisplay.setText(textdisplay.getText() + button20.getText());
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textdisplay.getText());
                op = "+";
                textdisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textdisplay.getText());
                op = "-";
                textdisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textdisplay.getText());
                op = "*";
                textdisplay.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textdisplay.getText());
                op = "/";
                textdisplay.setText("");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (textdisplay.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(textdisplay.getText());
                    strB.deleteCharAt(textdisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    textdisplay.setText(backspace);
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(textdisplay.getText());

                if (op == "+") {
                    result = a + b;
                    textdisplay.setText(String.valueOf(result));
                } else if (op == "-") {
                    result = a - b;
                    textdisplay.setText(String.valueOf(result));
                } else if (op == "*") {
                    result = a * b;
                    textdisplay.setText(String.valueOf(result));
                } else if (op == "/") {
                    result = a / b;
                    textdisplay.setText(String.valueOf(result));
                }
            }
        });

        fButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (defaultColor) {
                    defaultColor = false;
                    fButton.setBackground(Color.BLUE);
                } else {
                    defaultColor = true;
                    fButton.setBackground(Color.YELLOW);
                }
            }

                private static boolean defaultColor = true;

        });
        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (defaultColor) {
                    defaultColor = false;
                    eButton.setBackground(Color.GREEN);
                } else {
                    defaultColor = true;
                    eButton.setBackground(Color.GRAY);
                }
            }

            private static boolean defaultColor = true;


        });

       /* private void noletras(JTextField a) {
            a.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (!Character.isDigit(c) && c != '.') {
                        e.consume();
                    }
                    if (c == '.' && textdisplay.getText().contains(".")) {
                        e.consume();
                    }
                }
            });
        }*/

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora");
        frame.setContentPane(new calculadora().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    /*private void textdisplay(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (textdisplay.getText().trim().length() == 10) {
            evt.consume();
        }
    }*/
}





