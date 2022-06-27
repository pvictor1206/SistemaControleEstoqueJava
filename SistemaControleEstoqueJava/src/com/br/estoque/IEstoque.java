/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.br.estoque;

import com.br.exception.PJCException;
import com.br.exception.PNEException;
import com.br.produtos.Produto;

/**
 *
 * @author paulo
 */
public interface IEstoque {
    
    public void adicionar(Produto produto)  throws PJCException;
    public Produto buscar(String codigo) throws PNEException;
    public void apagar(Produto produto);
    public int quantidade();
    public Produto[] produtosEmEstoque();
    public Produto[] produtoEmFalta();
}
