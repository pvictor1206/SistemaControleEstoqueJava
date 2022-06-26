/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.home;

import com.br.budega.Budega;
import com.br.estoque.EstoqueVector;
import com.br.produtos.CadastrarProduto;
import com.br.produtos.EditarProduto;
import com.br.produtos.EstocarProdutoPage;
import com.br.produtos.Produto;
import com.br.produtos.ProdutoEmEstoque;
import com.br.produtos.ProdutosEmFaltaPage;
import com.br.produtos.VenderProduto;
import java.awt.CardLayout;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class HomePage extends javax.swing.JFrame {
    
    private DefaultTableModel dtmProdutos;
    private int selecaoTabela;
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnProdutos = new javax.swing.JMenu();
        btnCadastrarProduto = new javax.swing.JMenuItem();
        btnExcluirProduto = new javax.swing.JMenuItem();
        btnEstoque = new javax.swing.JMenu();
        btnVenderProduto = new javax.swing.JMenuItem();
        btnEstocarProduto = new javax.swing.JMenuItem();
        btnListarProduto = new javax.swing.JMenuItem();
        btnProdutosEmFalta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("TABELA DE PRODUTOS");

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

        jHomeProduto.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jHomeProduto.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jHomeProdutoLayout = new javax.swing.GroupLayout(jHomeProduto);
        jHomeProduto.setLayout(jHomeProdutoLayout);
        jHomeProdutoLayout.setHorizontalGroup(
            jHomeProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHomeProdutoLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(jHomeProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jHomeProdutoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jHomeProdutoLayout.setVerticalGroup(
            jHomeProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jHomeProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(573, 573, 573))
            .addGroup(jHomeProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jHomeProdutoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

        btnExcluirProduto.setText("Excluir Produto");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });
        btnProdutos.add(btnExcluirProduto);

        jMenuBar1.add(btnProdutos);

        btnEstoque.setText("Estoque Budega");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnVenderProduto.setText("Vender Produto");
        btnVenderProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderProdutoActionPerformed(evt);
            }
        });
        btnEstoque.add(btnVenderProduto);

        btnEstocarProduto.setText("Estocar Produto");
        btnEstocarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstocarProdutoActionPerformed(evt);
            }
        });
        btnEstoque.add(btnEstocarProduto);

        btnListarProduto.setText("Listar Produto");
        btnListarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProdutoActionPerformed(evt);
            }
        });
        btnEstoque.add(btnListarProduto);

        btnProdutosEmFalta.setText("Listar Produtos em Falta");
        btnProdutosEmFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosEmFaltaActionPerformed(evt);
            }
        });
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jHomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        if(tableProdutos.getSelectedRow() != -1){
            
            DefaultTableModel dtnProdutos = (DefaultTableModel) tableProdutos.getModel();
            
            // Pega o código do produto clicado
            
            String codigo = String.valueOf(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 0));
 
            //Remove produto da Budega
            budega.removerProduto(budega.consultarProduto(codigo));
            
            
            dtnProdutos.removeRow(tableProdutos.getSelectedRow());
        }else{
            
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
            
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnProdutosEmFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosEmFaltaActionPerformed
        ProdutosEmFaltaPage produtosEmFalta = new ProdutosEmFaltaPage(budega);
        jHomeProduto.add(produtosEmFalta);
        produtosEmFalta.setVisible(true);
    }//GEN-LAST:event_btnProdutosEmFaltaActionPerformed

    private void btnVenderProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderProdutoActionPerformed
        if(tableProdutos.getSelectedRow() != -1){
            
            DefaultTableModel dtmProdutos = (DefaultTableModel) tableProdutos.getModel();
            String codigo = String.valueOf(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 0));
            
            VenderProduto venderProduto = new VenderProduto(budega,codigo,tableProdutos.getSelectedRow(),dtmProdutos);
            jHomeProduto.add(venderProduto);
            venderProduto.setVisible(true);
            
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para venda");
        }
    }//GEN-LAST:event_btnVenderProdutoActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnEstocarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstocarProdutoActionPerformed
        if(tableProdutos.getSelectedRow() != -1){
            
            DefaultTableModel dtmProdutos = (DefaultTableModel) tableProdutos.getModel();
            String codigo = String.valueOf(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 0));
            
            EstocarProdutoPage estocarProduto = new EstocarProdutoPage(budega,codigo,tableProdutos.getSelectedRow(),dtmProdutos);
            jHomeProduto.add(estocarProduto);
            estocarProduto.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para estocar");
        }
    }//GEN-LAST:event_btnEstocarProdutoActionPerformed

    private void btnListarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProdutoActionPerformed
        ProdutoEmEstoque produtosEmEstoque = new ProdutoEmEstoque(budega);
        jHomeProduto.add(produtosEmEstoque);
        produtosEmEstoque.setVisible(true);
    }//GEN-LAST:event_btnListarProdutoActionPerformed

    private void tableProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProdutosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tableProdutosKeyReleased

    private void tableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableProdutosMouseClicked

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
