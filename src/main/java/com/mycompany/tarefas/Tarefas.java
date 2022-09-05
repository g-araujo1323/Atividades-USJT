/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarefas;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Tarefas {

    public static void main(String[] args) {
        
        //Ler a cotação do dolar e quantidade de dólares. Coverter pra real e mostrar o resultado

        double valorCotacao;
        valorCotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de cotação do dólar: "));
        
        double valorQuantidade;
        valorQuantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólares"));
        
        double valorFinal = valorCotacao * valorQuantidade;
        JOptionPane.showMessageDialog(null, "O valor final em reais é: R$ " + valorFinal);
        
    }
}
