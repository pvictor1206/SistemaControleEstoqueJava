/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.exception;

import com.br.produtos.Produto;

/**
 *
 * @author paulo
 */
public class PNEException extends Exception{
    //Produto não encontrado
    private String codigo;
    
    public PNEException(String codigo){  
        super("Produto Nao Encontrado");
        this.codigo = codigo;
    }
    
    public String produtoConta(){
        return codigo;
    }
    
}
