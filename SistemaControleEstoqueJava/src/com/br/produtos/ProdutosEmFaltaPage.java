/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.br.produtos;

import com.br.budega.Budega;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class ProdutosEmFaltaPage extends javax.swing.JInternalFrame {

    private Budega budega;
    
    
    public ProdutosEmFaltaPage(Budega budega) {
        this.budega = budega;
        initComponents();
        
        if(budega.produtosEmFalta() != null){
            
             int index = budega.produtosEmFalta().length;
             System.out.println(index);

             String[] names = new String[index];
            
             for(int i = 0; i < budega.produtosEmFalta().length ; i++){
                 names[i] = budega.produtosEmFalta()[i].getNomeProduto();
             }
             
             listaProdutosEmFalta.setModel(new DefaultComboBoxModel<>(names));
            
            
        }else{
            
            String[] names = {"Nenhum produto em falta no estoque"};
            listaProdutosEmFalta.setModel(new DefaultComboBoxModel<>(names));
            
        }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        listaProdutosEmFalta = new javax.swing.JList<>();

        setClosable(true);
        setTitle("Produtos em Falta");

        jScrollPane2.setViewportView(listaProdutosEmFalta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaProdutosEmFalta;
    // End of variables declaration//GEN-END:variables
}