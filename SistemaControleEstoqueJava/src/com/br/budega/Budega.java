/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.budega;

import com.br.estoque.IEstoque;
import com.br.produtos.Produto;

/**
 *
 * @author paulo
 */
public class Budega {
    private IEstoque estoque;
    
    public Budega(IEstoque estoque) {
        this.estoque = estoque;
        
    }

    public IEstoque getEstoque() {
        return estoque;
    }

    public void setEstoque(IEstoque estoque) {
        this.estoque = estoque;
    }
    
    
    
    public void adicionarProduto(Produto produto){
        
        
        
    }
    
    public void removerProduto(Produto produto){
        
    }
    
    public void venderProduto(String codigo, int quantidade){
        
    }
    
    public void estocarProduto(String codigo, int quantidade){
        
    }
    
    public Produto consultarProduto(String codigo){
        return null;
        
    }
    
    public Produto listarProduto(){
        return null;
    }
    
    public Produto produtosEmFalta(){
        return null;
    }
    
    
    
    
    
    
    
    
    
    
    
}
