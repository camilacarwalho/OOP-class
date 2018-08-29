package com.ifpb.interfacegrafica.model;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class Formulario extends JFrame {
    private JLabel label1, label2, label3, label4, label5, label6;
    private JTextField tfNome;
    private JPasswordField pfSenha;
    private JFormattedTextField cpf;

    public Formulario(String titulo){
        super (titulo);
        setSize(400,350);
        setLocationRelativeTo(null);
        Color fundo = new Color(52,61,70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);
        adicionarLabels(container);
        addTextFields(container);
        container.setBackground(fundo);

    }
    private void adicionarLabels(Container container){
        label1 = new JLabel("CPF");
        label2 = new JLabel("Nome");
        label3 = new JLabel("Nascimento");
        label4 = new JLabel("Sexo");
        label5 = new JLabel("Senha");
        label6 = new JLabel("Cargo");

        label1.setBounds(10,30,100,10);
        label2.setBounds(10,60,100,15);
        label3.setBounds(10,90,100,15);
        label4.setBounds(10,120,100,15);
        label5.setBounds(10,150,100,15);
        label6.setBounds(10,180,100,15);

        label1.setForeground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label3.setForeground(Color.WHITE);
        label4.setForeground(Color.WHITE);
        label5.setForeground(Color.WHITE);
        label6.setForeground(Color.WHITE);



        //Fazer com for each
        container.add(label1);
        container.add(label2);
        container.add(label3);
        container.add(label4);
        container.add(label5);
        container.add(label6);



    }
    private void addTextFields(Container container){
        tfNome = new JTextField();
        tfNome.setBounds(120,60,200,20);
        tfNome.setFont(new Font("Arial", Font.BOLD, 14));
        Color color = new Color(99,95,98);
        tfNome.setForeground(color);

        container.add(tfNome);

        pfSenha = new JPasswordField();
        pfSenha.setBounds(120,150,200,20);
        container.add(pfSenha);
        MaskFormatter formatter = null;
        try {
          formatter = new MaskFormatter("###.###.###=##");
        }catch (ParseException ex){
            ex.printStackTrace();
        }
        cpf = new JFormattedTextField();
        if (formatter!=null) {
            formatter.install(cpf);
        }
        cpf.setBounds(120,30,200,20);

    }

    public static void main(String[] args) {
        Formulario form = new Formulario("Home");
        form.setVisible(true);
    }
}
