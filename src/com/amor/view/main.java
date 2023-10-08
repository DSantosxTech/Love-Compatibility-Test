package com.amor.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Juliano Santos
 */
public class main {

    /**
     * =
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");

        if ("Rafaela".equals(nome)) {
            TelaCalculadora tela = new TelaCalculadora();
            tela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Sai daí FEIA, só meu neném pode entrar!");
        }

        // TODO code application logic here
    }

}
