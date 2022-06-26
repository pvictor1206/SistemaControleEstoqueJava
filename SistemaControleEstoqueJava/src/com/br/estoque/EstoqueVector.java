/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.estoque;

import com.br.produtos.Produto;
import java.util.Vector;

/**
 *
 * @author paulo
 */
public class EstoqueVector implements IEstoque{
    
    private Vector<Produto> vectorDeProdutos = new Vector<Produto>(); //Vetor de produtos

    @Override
    public void adicionar(Produto produto) {
        vectorDeProdutos.add(produto);
        for(int i = 0; i < vectorDeProdutos.size(); i++){
                System.out.println(vectorDeProdutos.get(i).getNomeProduto());
           
            }
        
            System.out.println("-----------------------");
        
    }

    @Override
    public Produto buscar(String Codigo) {
        
        // Busca em uma laço o produto por meio de um código.
        for(int i = 0; i < vectorDeProdutos.size(); i++){
            
            if(vectorDeProdutos.get(i).getCodProduto().equals(Codigo)){
                return vectorDeProdutos.get(i);
            }
            
        }
        
        return null;
    }

    @Override
    public void apagar(Produto produto) {
        for(int i = 0; i < vectorDeProdutos.size(); i++){
            //Verifica se o código do laço é o mesmo do produto, se for, será removido..
            if(vectorDeProdutos.get(i).getCodProduto().equals(produto.getCodProduto())){
                vectorDeProdutos.remove(i);
            }
            
        }
        
        
    }

    @Override
    public int quantidade() {
        return 0;
    }

    @Override
    public Produto produtosEmEstoque() {
        return null;
    }

    @Override
    public Produto produtoEmFalta() {
        return null;
    }

    public Vector<Produto> getVectorDeProdutos() {
        return vectorDeProdutos;
    }

    public void setVectorDeProdutos(Vector<Produto> vectorDeProdutos) {
        this.vectorDeProdutos = vectorDeProdutos;
    }
    
    
    
}
