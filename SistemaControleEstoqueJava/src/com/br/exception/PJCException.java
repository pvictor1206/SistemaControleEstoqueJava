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
public class PJCException extends Exception{
    
    //Produto já cadastrado
    private Produto produto;
    
    public PJCException(Produto produto){  
        super("Produto Ja Cadastrado");
        this.produto = produto;
    }
    
    public Produto produtoConta(){
        return produto;
    }
    
}
