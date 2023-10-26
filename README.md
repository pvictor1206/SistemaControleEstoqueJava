# Sistema de Controle de Estoque em Java

## Objetivo

O objetivo deste trabalho é desenvolver um sistema para controle de estoque de produtos de uma “bodega” (“Aplicação Bodega”) empregando os conceitos de POO & Java.

## Entidades

Neste sistema, identificamos duas entidades principais: “estoque” e “produto”. A entidade “estoque” manipula instâncias da entidade “produto”.

### Classe Produto

![Diagrama Produtos](https://github.com/pvictor1206/SistemaControleEstoqueJava/blob/main/diagramaProduto.png)

A classe Produto possui os seguintes atributos (privados): código, nome, preço e quantidade em estoque. Além de Métodos (públicos) na classe Produto que permitam recuperar e atribuir valores a esses atributos.

### Classe ProdutoPerecivel

Classe chamada ProdutoPerecivel, como subclasse de Produto, possui como atributo um prazo de validade e seus respectivos métodos de acesso, além de um construtor que recebe como argumento o código do produto e o repassa à superclasse Produto através do comando super.

## Entidade Estoque

A entidade “estoque” possui as operações (métodos) de adicionar, recuperar e remover um Produto, além disso, foi criado um método para verificar a quantidade total de produtos (o somatório das quantidades de cada produto em estoque), outro para listar todos os produtos em estoque e outro para listar os produtos que precisam ser repostos, ou seja, aqueles que possuem a quantidade em estoque igual a zero.

## Exceções

O método adicionar da entidade “estoque” lança uma exceção de “Produto Já Cadastrado” caso o produto já tenha sido cadastrado (classe de exceção PJCException). Além disso, os métodos buscar e apagar da entidade “estoque” levantam uma exceção de “Produto Não Encontrado” caso o produto não tenha sido encontrado no estoque (classe de exceção PNEException).

## Interface IEstoque

![Diagrama Estoque](https://github.com/pvictor1206/SistemaControleEstoqueJava/blob/main/diagramaEstoque.png)

Interface IEstoque, com a assinatura dos métodos citados (métodos buscar e apagar devem levantar a exceção PNEException, método adicionar deve lançar a exceção PJCException), implementações: EstoqueArray e EstoqueVector.

## Classe Bodega

![Diagrama Bodega](https://github.com/pvictor1206/SistemaControleEstoqueJava/blob/main/diagramaBodega.png)

Classe chamada Bodega, possui um atributo estoque do tipo IEstoque e um construtor que recebe como argumento uma implementação da interface IEstoque a qual deve ser atribuída ao atributo estoque. Os produtos devem ser armazenados no estoque. Além disso, a classe Bodega deve possuir métodos para adicionar produtos ao estoque, remover produtos do estoque, vender (que diminui a quantidade de um determinado produto em estoque), estocar (aumentar a quantidade do produto estocado), consultar produto e listar produtos em estoque e em falta.

## Interface Gráfica

Interface gráfica que permita fazer a manipulação da Bodega, ou seja, adicionar produtos em estoque, remover produtos, vender produtos, estocar produtos, consultar um determinado produto e listar todos os produtos (em estoque e em falta) da Bodega.
