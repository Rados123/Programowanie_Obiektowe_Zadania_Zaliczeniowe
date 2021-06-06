package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Liczydlo extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private final JButton Plus;
    private final JButton Minus;
    private final JButton Razy;
    private final JButton Przez;
    private final JButton Reszta;
    private final JButton Czysc;
    private final JTextField LiczA;
    private final JTextField LiczB;
    private final JTextField Wynik;

    public Liczydlo() {
        super("Liczydlo");
        Plus = new JButton("+");
        Plus.addActionListener(this);
        Minus = new JButton("-");
        Minus.addActionListener(this);
        Razy = new JButton("*");
        Razy.addActionListener(this);
        Przez = new JButton("/");
        Przez.addActionListener(this);
        Reszta = new JButton("%");
        Reszta.addActionListener(this);
        Czysc = new  JButton("Czysc");
        Czysc.addActionListener(this);
        LiczA = new JTextField("");
        LiczB = new JTextField("");
        Wynik = new JTextField("");
        Wynik.setEditable(false);

        JPanel p2 = new JPanel(new GridLayout(3,1));
        p2.add(new JLabel("Liczba A:"));
        p2.add(new JLabel("Liczba B:"));
        p2.add(new JLabel("Wynik:"));

        JPanel p3 = new JPanel(new GridLayout(3,1));
        p3.add(LiczA);
        p3.add(LiczB);
        p3.add(Wynik);

        JPanel p1 = new JPanel(new GridLayout(4,2,20,5));
        p1.add(Plus);
        p1.add(Minus);
        p1.add(Razy);
        p1.add(Przez);
        p1.add(Reszta);
        p1.add(Czysc);
        p1.add(p2);
        p1.add(p3);

        setContentPane(p1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Plus) {
            double WynikP = Double.parseDouble(LiczA.getText()) + Double.parseDouble(LiczB.getText());
            Wynik.setText(Double.toString(WynikP));
        }

        if (e.getSource() == Minus) {
            double WynikM = Double.parseDouble(LiczA.getText()) - Double.parseDouble(LiczB.getText());
            Wynik.setText(Double.toString(WynikM));
        }

        if (e.getSource() == Razy) {
            double WynikR = Double.parseDouble(LiczA.getText()) * Double.parseDouble(LiczB.getText());
            Wynik.setText(Double.toString(WynikR));
        }

        if (e.getSource() == Przez) {
            double WynikPr = Double.parseDouble(LiczA.getText()) / Double.parseDouble(LiczB.getText());
            Wynik.setText(Double.toString(WynikPr));

            if (Double.parseDouble(LiczB.getText()) == 0) {
                JOptionPane.showMessageDialog(this,"Nie można dzielić przez 0",
                        "Dzielenie przez zero", JOptionPane.WARNING_MESSAGE);
            }
        }

        if (e.getSource() == Reszta) {
            double WynikRe = Double.parseDouble(LiczA.getText()) % Double.parseDouble(LiczB.getText());
            Wynik.setText(Double.toString(WynikRe));

            if (Double.parseDouble(LiczB.getText()) == 0) {
                JOptionPane.showMessageDialog(this,"Nie można resztować przez 0",
                        "Resztowanie przez zero", JOptionPane.WARNING_MESSAGE);
            }
        }

        if (e.getSource() == Czysc) {
            LiczA.setText("");
            LiczB.setText("");
            Wynik.setText("");
        }
    }

    public  static void main(String[] args) {
        SwingUtilities.invokeLater(Liczydlo::new);
    }
}

