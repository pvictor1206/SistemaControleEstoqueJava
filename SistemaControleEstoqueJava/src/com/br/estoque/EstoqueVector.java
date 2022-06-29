/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.estoque;

import com.br.exception.PJCException;
import com.br.exception.PNEException;
import com.br.produtos.Produto;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulo
 */
public class EstoqueVector implements IEstoque{
    
    private Vector<Produto> vectorDeProdutos = new Vector<Produto>(); //Vetor de produtos

    @Override
    public void adicionar(Produto produto) throws PJCException{
        
        for(int i = 0; i < vectorDeProdutos.size(); i++){
            //Pesquisar se existe um produto com esse código
            if(vectorDeProdutos.get(i).getCodProduto().equals(produto.getCodProduto())){
                throw new PJCException(produto);
            } 
        }
        
        vectorDeProdutos.add(produto);
        
       
 
    }

    @Override
    public Produto buscar(String codigo) throws PNEException{
        
        
        // Busca em uma laço o produto por meio de um código.
        for(int i = 0; i < vectorDeProdutos.size(); i++){
            
            if(vectorDeProdutos.get(i).getCodProduto().equals(codigo)){
                return vectorDeProdutos.get(i);
            }
            
        }
        
        // Se não encontrar nenhum produto com esse código
        throw new PNEException(codigo);
    }

    @Override
    public void apagar(Produto produto){
        for(int i = 0; i < vectorDeProdutos.size(); i++){
            //Verifica se o código do laço é o mesmo do produto, se for, será removido..
            if(vectorDeProdutos.get(i).getCodProduto().equals(produto.getCodProduto())){
                vectorDeProdutos.remove(i);
            }
            
        }
        
        // A pessoa clica no produto para deletar...
        //throw new PNEException(produto.getCodProduto());
        
        
    }

    @Override
    public int quantidade() {
        
        int quant = 0;
        
        for(int i = 0; i < vectorDeProdutos.size(); i++){        
            quant += vectorDeProdutos.get(i).getQuantidadeProduto();
           
            }
        
        
        return quant;
    }

    @Override
    public Produto[] produtosEmEstoque() {
        int cont = 0;
        int aux = 0;
        
        for(int i = 0; i < vectorDeProdutos.size(); i++){
            if(vectorDeProdutos.get(i).getQuantidadeProduto() != 0){
                cont += 1;
            }
            
        }
        
        Produto produto[] = new Produto[cont];
        
       
        
        for(int i = 0; i < vectorDeProdutos.size(); i++){
            //Verifica se o código do laço tem quantidade zero.
            if(vectorDeProdutos.get(i).getQuantidadeProduto() != 0){
                produto[aux] = vectorDeProdutos.get(i);
                aux++;
            }
            
        }
        
        
        
        if(cont != 0){
            return produto;
        }

        return null;
    }

    @Override
    public Produto[] produtoEmFalta() {
        
        
        int cont = 0;
        int aux = 0;
        
        for(int i = 0; i < vectorDeProdutos.size(); i++){
            if(vectorDeProdutos.get(i).getQuantidadeProduto() == 0){
                cont += 1;
            }
            
        }
        
        Produto produto[] = new Produto[cont];
        
       
        
        for(int i = 0; i < vectorDeProdutos.size(); i++){
            //Verifica se o código do laço tem quantidade zero.
            if(vectorDeProdutos.get(i).getQuantidadeProduto() == 0){
                produto[aux] = vectorDeProdutos.get(i);
                aux++;
            }
            
        }
        
        
        
        if(cont != 0){
            return produto;
        }

        return null;
    }

    public Vector<Produto> getVectorDeProdutos() {
        return vectorDeProdutos;
    }

    public void setVectorDeProdutos(Vector<Produto> vectorDeProdutos) {
        this.vectorDeProdutos = vectorDeProdutos;
    }
    
    
    
}
