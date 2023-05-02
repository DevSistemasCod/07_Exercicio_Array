# Exercícios sobre Arrays

1) Faça um programa em Java que leia um conjunto de 10  números inteiros do usuário e calcule a soma desses números. Armazenar os números em um array.

2) Crie um programa em Java capaz de armazenar 10 nomes em uma lista de convidados para um evento. Use um array para armazenar os nomes dos convidados (dica crie  um array do tipo String e no Scanner utilize .next()).

3) Crie um programa em Java que permita ao usuário inserir as notas de 10 alunos em um vetor, em seguida, calcular a média das notas (para cada aluno podem ser inseridas 3 notas). O programa deve exibir a média de cada aluno em tela.

4) Faça um programa em Java para armazenar as temperaturas registradas em um dia (período: manhã, tarde e noite). O programa deve permitir que o usuário insira as temperaturas em um array, e depois exibir a temperatura mais alta e a mais baixa (utilize o método sort() da classe Arrays para efetuar a ordenação).

5) Faça um programa em Java capaz de armazenar os nomes de uma lista de convidados para um evento. Use um array para armazenar os nomes dos convidados (o tamanho do array deve ser passado durante a execução do código). Feito isso ordene os nomes por ordem alfabética (dica crie  um array do tipo String e no Scanner utilize .next(), para ordenar utilize o método sort() da classe Arrays).

6)  Faça um código java que ordena um array de 7 posições utilizando uma variável auxiliar (dica estude o método de ordenação bubble sort).

----
# Exercícios de Array com Orientação a Objetos
---
1) Faça um código java para o cadastro de alunos de uma escola, a classe Aluno deve armazenar informações sobre cada estudante, esta classe possui os atributos nome, número e notas (array de tipo primitivo "float"). O atributo notas representa as notas do aluno em uma determinada disciplina.
  A classe deve possuir o método  calcularMedia, que calcula a média das notas do aluno. 
  O método toString é utilizado para retornar uma representação em forma de String do objeto Aluno.
  Os métodos getNome, setNome, getNumero, setNumero, getNotas e setNotas são utilizados para acessar e alterar os atributos da classe.
Crie uma classe para testar a classe feita.

2) Faça um programa em Java para gerenciar vendas de carros, cada venda deve conter informações como o número da venda, o modelo do carro vendido, o valor da venda e o nome do vendedor responsável.
  Para isso, crie a classe Venda com os seguintes atributos: número da venda, modelo do carro vendido, valor da venda, nome do vendedor, array (de inteiros) para representar as parcelas da venda.
  A classe Venda também deve conter um método para calcular o valor das parcelas. Este método deve receber como parâmetro o número de parcelas desejado e retornar um array de inteiros com o valor de cada parcela.
Ao fim crie uma classe para testar a classe feita.

3) Faça um sistema de gerenciamento de estoque de uma loja, crie uma classe chamada Produto que armazene informações sobre os produtos disponíveis na loja. Os atributos são nome, preco, quantidade e codigos ( deve ser um array de inteiros).
  A classe possui os métodos adicionarProduto e removerProduto, que adicionam e removem unidades do produto da quantidade em estoque. O método verificarCodigo é utilizado para verificar se um código fornecido corresponde ao produto. 
  O método toString é utilizado para retornar uma representação em forma de String do objeto Produto.
  Os métodos getNome, setNome, getPreco, setPreco, getQuantidade e setQuantidade são utilizados para acessar e alterar os atributos da classe. O método getCodigos e setCodigos são utilizados para acessar e alterar o atributo codigos.
Ao fim crie uma classe para testar a classe feita.

4) Faça uma classe chamada "Venda" que irá representar uma venda de uma banca de Jornal. Essa classe terá como atributos um identificador da venda, uma data da venda, um valor total da venda, e um array de inteiros que irá armazenar a quantidade de cada jornal vendido naquela venda (quantidades).
  Além disso, criaremos uma classe "BancaDeJornal" que irá representar a banca em si. Essa classe terá como atributos um nome da banca (nome), um endereço (endereco) e um array de vendas (vendas) que irá armazenar todas as vendas realizadas na banca. 
Ao fim crie uma classe para testar a classe feita.

5) Faça um programa Java para um sistema de controle de pedidos de uma lanchonete, para isso codifique uma classe chamada Pedido que representa um pedido feito na lanchonete. Essa classe deve ter os seguintes atributos: codigo (tipo int), itens (tipo String[]): um array com os itens pedidos; valores (tipo double[]): um array com os valores de cada item.
Crie também uma classe chamada Lanchonete que representa a lanchonete. Essa classe deve ter os seguintes atributos: pedidos (tipo Pedido[]): um array com os pedidos feitos na lanchonete.
  A classe Lanchonete deve ter os seguintes métodos:
  fazerPedido: faz um novo pedido na lanchonete, adicionando-o ao array de pedidos;
  buscarPedido: busca um pedido na lanchonete, dado seu código;
  listarPedidos: lista todos os pedidos da lanchonete, mostrando seu código, itens e valores. 
Teste suas classes por meio de uma classe principal.

6) Faça um programa em java para um sistema de gerenciamento de vendas de uma loja de produtos esportivos. Codifique uma classe chamada Venda que representa uma venda realizada na loja. Essa classe deve ter os seguintes atributos: id (tipo int); data (tipo String); valorTotal (tipo double); e itens (tipo ItemVenda[]): um array com os itens vendidos na venda.
Crie também uma classe chamada ItemVenda que representa um item vendido na loja. Essa classe deve ter os seguintes atributos: produto (tipo String); quantidade (tipo int); e valorUnitario (tipo double);
  Crie uma classe chamada Loja que representa a loja de produtos esportivos. Essa classe deve ter os seguintes atributos: vendas (tipo Venda[]): um array com as vendas realizadas na loja.
  A classe Loja deve ter os seguintes métodos:
buscarVenda: recebe o identificador de uma venda e retorna a referência para o objeto Venda correspondente, ou null se a venda não existir na loja; adicionarVenda: recebe uma referência para um objeto Venda e adiciona a venda ao array vendas.

