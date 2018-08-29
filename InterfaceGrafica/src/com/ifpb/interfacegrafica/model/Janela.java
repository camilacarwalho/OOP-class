package com.ifpb.interfacegrafica.model;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    private JLabel label;

    public Janela(String titulo){
        super (titulo);
        setSize(400,400);
        setLocation(100,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("google.png").getImage());

        Container container = getContentPane();
        container.setBackground(new Color(255,255,255));
        //Layout : Null:
        //container.setLayout(null);

        //FlowLayout:
        //container.setLayout(new FlowLayout(FlowLayout.TRAILING));

        //GridLayout:
        container.setLayout(new GridLayout(2,3));
        adicionarComponentes(container);
    }
    private void adicionarComponentes(Container container){
//        label = new JLabel("Oi");
//        label.setBounds(100,0,200,50);
//        label.setForeground(Color.RED);
//        label.setFont(new Font("Arial",Font.BOLD,20));
//        container.add(label);
        JButton botao = new JButton("1");
        JButton botao2 =new JButton("2");
        JButton botao3 = new JButton("3");
        JButton botao4 =new JButton("4");
        JButton botao5 = new JButton("5");
        container.add(botao);
        container.add(botao2);
        container.add(botao3);
        container.add(botao4);
        container.add(botao5);

    }

    public static void main(String[] args) {
        Janela janela = new Janela("Espaço de apliicação");
        janela.setVisible(true);
    }
}
