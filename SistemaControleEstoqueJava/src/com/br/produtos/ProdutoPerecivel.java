/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.produtos;

/**
 *
 * @author paulo
 */
public class ProdutoPerecivel extends Produto{
    
    private String prazoValidade;
    
    public ProdutoPerecivel(String codProduto){
        super(codProduto);
    }

    public String getPrazoValidade() {
        return prazoValidade;
    }

    public void setPrazoValidade(String prazoValidade) {
        this.prazoValidade = prazoValidade;
    }


    
    
    
}
