/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.br.estoque;

import com.br.produtos.Produto;

/**
 *
 * @author paulo
 */
public interface IEstoque {
    
    public void adicionar(Produto produto);
    public Produto buscar(String Codigo);
    public void apagar(Produto produto);
    public int quantidade();
    public Produto[] produtosEmEstoque();
    public Produto[] produtoEmFalta();
}
