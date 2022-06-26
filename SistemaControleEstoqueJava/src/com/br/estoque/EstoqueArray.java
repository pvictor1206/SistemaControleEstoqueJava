/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.estoque;

import com.br.produtos.Produto;

/**
 *
 * @author paulo
 */
public class EstoqueArray implements IEstoque{

    @Override
    public void adicionar(Produto produto) {
    }

    @Override
    public Produto buscar(String Codigo) {
        return null;
    }

    @Override
    public void apagar(Produto produto) {
    }

    @Override
    public int quantidade() {
        return 0;
    }

    @Override
    public Produto[] produtosEmEstoque() {
        return null;
    }

    @Override
    public Produto[] produtoEmFalta() {
        return null;
    }
    
}
