/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.home;

import com.br.budega.Budega;
import com.br.estoque.EstoqueVector;
import com.br.produtos.CadastrarProduto;
import com.br.produtos.EditarProduto;
import com.br.produtos.Produto;
import java.awt.CardLayout;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class HomePage extends javax.swing.JFrame {
    
    private DefaultTableModel dtmProdutos;
    private int selecaoTabela;
    private String codigo;
    // O Estoque irá ser inserido na Budega
    private EstoqueVector estoque = new EstoqueVector();
    private Budega budega = new Budega(estoque);
    

   
    public HomePage() {
        
        initComponents();
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jHomeProduto = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnProdutos = new javax.swing.JMenu();
        btnCadastrarProduto = new javax.swing.JMenuItem();
        btnEditarProduto = new javax.swing.JMenuItem();
        btnExcluirProduto = new javax.swing.JMenuItem();
        btnEstoque = new javax.swing.JMenu();
        btnVenderProduto = new javax.swing.JMenuItem();
        btnEstocarProduto = new javax.swing.JMenuItem();
        btnListarProduto = new javax.swing.JMenuItem();
        btnProdutosEmFalta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Quantidade", "Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutosMouseClicked(evt);
            }
        });
        tableProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableProdutosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableProdutos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("TABELA DE PRODUTOS");

        jHomeProduto.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jHomeProduto.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jHomeProdutoLayout = new javax.swing.GroupLayout(jHomeProduto);
        jHomeProduto.setLayout(jHomeProdutoLayout);
        jHomeProdutoLayout.setHorizontalGroup(
            jHomeProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
            .addGroup(jHomeProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jHomeProdutoLayout.setVerticalGroup(
            jHomeProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jHomeProdutoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnProdutos.setText("Produto");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnCadastrarProduto.setText("Cadastrar Produto");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        btnProdutos.add(btnCadastrarProduto);

        btnEditarProduto.setText("Editar Produto");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });
        btnProdutos.add(btnEditarProduto);

        btnExcluirProduto.setText("Excluir Produto");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });
        btnProdutos.add(btnExcluirProduto);

        jMenuBar1.add(btnProdutos);

        btnEstoque.setText("Estoque Budega");

        btnVenderProduto.setText("Vender Produto");
        btnEstoque.add(btnVenderProduto);

        btnEstocarProduto.setText("Estocar Produto");
        btnEstoque.add(btnEstocarProduto);

        btnListarProduto.setText("Listar Produto");
        btnEstoque.add(btnListarProduto);

        btnProdutosEmFalta.setText("Listar Produtos em Falta");
        btnEstoque.add(btnProdutosEmFalta);

        jMenuBar1.add(btnEstoque);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jHomeProduto, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jHomeProduto)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed

                DefaultTableModel dtmProdutos = (DefaultTableModel) tableProdutos.getModel();
                
                CadastrarProduto cadProdutos = new CadastrarProduto(dtmProdutos,budega);
                jHomeProduto.add(cadProdutos);
                cadProdutos.setVisible(true);

    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        
        if(tableProdutos.getSelectedRow() != -1){
            
            selecaoTabela = tableProdutos.getSelectedRow();
            DefaultTableModel dtmProdutos = (DefaultTableModel) tableProdutos.getModel();
            
            EditarProduto editProdutos = new EditarProduto(selecaoTabela,dtmProdutos);
            jHomeProduto.add(editProdutos);
            editProdutos.setVisible(true);
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Selecione um produto");
            
        }
        
        
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        if(tableProdutos.getSelectedRow() != -1){
            
            DefaultTableModel dtnProdutos = (DefaultTableModel) tableProdutos.getModel();
            
            // Pega o código do produto clicado
            //labelRemovido.setText(dtmProdutos.getValueAt(tableProdutos.getSelectedRow(), 0).toString());
            //System.out.println(labelRemovido.);
            //Remove produto da Budega
            //budega.removerProduto(budega.consultarProduto(labelRemovido.getText()));
            
            
            dtnProdutos.removeRow(tableProdutos.getSelectedRow());
        }else{
            
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
            
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void tableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableProdutosMouseClicked

    private void tableProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProdutosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tableProdutosKeyReleased

    public DefaultTableModel getDtmProdutos() {
        return dtmProdutos;
    }

    public void setDtmProdutos(DefaultTableModel dtmProdutos) {
        this.dtmProdutos = dtmProdutos;
    }


    
    

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCadastrarProduto;
    private javax.swing.JMenuItem btnEditarProduto;
    private javax.swing.JMenuItem btnEstocarProduto;
    private javax.swing.JMenu btnEstoque;
    private javax.swing.JMenuItem btnExcluirProduto;
    private javax.swing.JMenuItem btnListarProduto;
    private javax.swing.JMenu btnProdutos;
    private javax.swing.JMenuItem btnProdutosEmFalta;
    private javax.swing.JMenuItem btnVenderProduto;
    private javax.swing.JDesktopPane jHomeProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProdutos;
    // End of variables declaration//GEN-END:variables
}
