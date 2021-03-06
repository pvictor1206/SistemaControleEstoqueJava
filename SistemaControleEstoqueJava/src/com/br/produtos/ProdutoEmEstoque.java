/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.br.produtos;

import com.br.budega.Budega;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author paulo
 */
public class ProdutoEmEstoque extends javax.swing.JInternalFrame {

    private Budega budega;
    
    public ProdutoEmEstoque(Budega budega) {
        this.budega = budega;
        initComponents();
        
        if(budega.listarProduto() != null){
            
             int index = budega.listarProduto().length;
             System.out.println(index);

             String[] names = new String[index];
            
             for(int i = 0; i < budega.listarProduto().length ; i++){
                 names[i] = budega.listarProduto()[i].getNomeProduto();
             }
             
             listaProdutoEmEstoque.setModel(new DefaultComboBoxModel<>(names));
            
            
        }else{
            
            String[] names = {"Nenhum produto no estoque"};
            listaProdutoEmEstoque.setModel(new DefaultComboBoxModel<>(names));
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listaProdutoEmEstoque = new javax.swing.JList<>();

        setClosable(true);
        setTitle("Produto em Estoque");

        jScrollPane1.setViewportView(listaProdutoEmEstoque);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaProdutoEmEstoque;
    // End of variables declaration//GEN-END:variables
}
