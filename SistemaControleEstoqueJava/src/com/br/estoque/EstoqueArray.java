/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.estoque;

import com.br.exception.PJCException;
import com.br.exception.PNEException;
import com.br.produtos.Produto;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class EstoqueArray implements IEstoque{
    
    private ArrayList<Produto> ArrayDeproduto = new ArrayList<>();

    @Override
    public void adicionar(Produto produto)  throws PJCException{
        ArrayDeproduto.add(produto);
        
                
    }

    @Override
    public Produto buscar(String Codigo) throws PNEException{
         // Busca em uma laço o produto por meio de um código.
        for(int i = 0; i < ArrayDeproduto.size(); i++){
            
            if(ArrayDeproduto.get(i).getCodProduto().equals(Codigo)){
                return ArrayDeproduto.get(i);
            }
            
        }
        
        return null;
    }

    @Override
    public void apagar(Produto produto){
        for(int i = 0; i < ArrayDeproduto.size(); i++){
            //Verifica se o código do laço é o mesmo do produto, se for, será removido..
            if(ArrayDeproduto.get(i).getCodProduto().equals(produto.getCodProduto())){
                ArrayDeproduto.remove(i);
            }
            
        }
    }

    @Override
    public int quantidade() {
        int quant = 0;
        
        for(int i = 0; i < ArrayDeproduto.size(); i++){        
            quant += ArrayDeproduto.get(i).getQuantidadeProduto();
           
            }
        
        
        return quant;
    }

    @Override
    public Produto[] produtosEmEstoque() {
        int cont = 0;
        int aux = 0;
        
        for(int i = 0; i < ArrayDeproduto.size(); i++){
            if(ArrayDeproduto.get(i).getQuantidadeProduto() != 0){
                cont += 1;
            }
            
        }
        
        Produto produto[] = new Produto[cont];
        
       
        
        for(int i = 0; i < ArrayDeproduto.size(); i++){
            //Verifica se o código do laço tem quantidade zero.
            if(ArrayDeproduto.get(i).getQuantidadeProduto() != 0){
                produto[aux] = ArrayDeproduto.get(i);
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
        
        for(int i = 0; i < ArrayDeproduto.size(); i++){
            if(ArrayDeproduto.get(i).getQuantidadeProduto() == 0){
                cont += 1;
            }
            
        }
        
        Produto produto[] = new Produto[cont];
        
       
        
        for(int i = 0; i < ArrayDeproduto.size(); i++){
            //Verifica se o código do laço tem quantidade zero.
            if(ArrayDeproduto.get(i).getQuantidadeProduto() == 0){
                produto[aux] = ArrayDeproduto.get(i);
                aux++;
            }
            
        }
        
        
        
        if(cont != 0){
            return produto;
        }

        return null;
    }
    
}
