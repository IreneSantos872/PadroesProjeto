# Padroes de Projeto
Padrões de Projeto em Kotlin

1 - Singleton

    Descrição
    O Singleton é uma abordagem de design de software que visa assegurar a existência de apenas uma instância de uma classe e fornecer     um ponto centralizado para acessá-la. Isso é especialmente benéfico em contextos nos quais é desejável manter uma única ocorrência     de uma classe responsável pelo controle de um recurso compartilhado, como configurações, conexões de banco de dados ou caches.
    
    Neste desafio, você deve criar um sistema de gerenciamento de usuários que permita adicionar e listar usuários. Você tem a opção       de implementar o padrão Singleton para garantir que haja apenas uma instância do gerenciador de usuários em toda a aplicação. 
    
    Especificações do Desafio:
    
    Crie uma classe User com os seguintes atributos: id (inteiro) e name (string).
    Implemente uma classe UserManager que siga o padrão Singleton. Esta classe deve possuir as seguintes funcionalidades:
    a. Adicionar um novo usuário ao sistema, recebendo o nome como entrada.
    b. Listar todos os usuários cadastrados.
    No programa principal (main), siga as etapas abaixo:
    a. Solicite ao usuário a quantidade de usuários que deseja cadastrar.
    b. Peça ao usuário para informar os nomes dos usuários, um por linha.
    c. Após receber os nomes e cadastrar os usuários, liste os usuários cadastrados.
    
    - Entrada
    Um número inteiro representando a quantidade de usuários que o usuário deseja cadastrar.
    
    Para cada usuário a ser cadastrado, uma string contendo o nome do usuário.
    
    - Saída
    Uma lista com os nomes dos usuários cadastrados.


2 - Builder

    Descrição
    O Design Pattern "Builder" é uma técnica utilizada para criar objetos complexos passo a passo, separando o processo de construção      da representação final do objeto. Isso ajuda a melhorar a legibilidade e a flexibilidade do código, especialmente quando você          precisa criar objetos com muitos parâmetros ou configurações diferentes.
    
    Neste desafio, buscando soluções para um problema de negócios em uma plataforma de e-commerce, é necessário melhorar a forma como      os pedidos personalizados são tratados. Você tem a opção de implementar a solução utilizando o padrão Builder para criar pedidos       de forma mais eficiente e organizada.
    
    Detalhamento da tarefa:
    
    - Capture o nome do cliente.
    - Solicite ao usuário a quantidade de produtos que deseja adicionar ao pedido.
    - Para cada produto, capture o nome, preço e quantidade.
    - Capture o endereço de entrega.
    - Calcule o total do pedido somando o preço de cada produto multiplicado pela quantidade.
    - Imprima os detalhes do pedido, incluindo os produtos, seus preços, quantidades, total a pagar e endereço de entrega.
    
    
    * Entrada
       O programa deve receber as seguintes informações do usuário:
        Nome do cliente (string);
        Lista de produtos a serem incluídos no pedido (cada produto possui nome, preço e quantidade);
        Endereço de entrega (string).
    
    * Saída
       Após receber todas as informações do usuário, o programa deve criar um objeto de pedido personalizado usando o padrão Builder e        imprimir os detalhes do pedido construído, incluindo o total a pagar.


3 - ADAPTER

    Desafio Implementar um adaptador para conversão de Moedas

    Descrição
    O padrão de projeto Adapter é um padrão de projeto estrutural que permite      que objetos com interfaces incompatíveis trabalhem juntos. Ele atua como       um intermediário, adaptando a interface de uma classe para outra interface     esperada pelo cliente.
    
    Neste desafio, foi implementado um conversor de moedas que permitirá que       valores monetários sejam convertidos de dólares americanos (USD) para          euros (EUR). Embora exista uma taxa de conversão direta de 1 USD = 0.85        EUR, o nosso sistema inicialmente só suportava a conversão de USD para         libras esterlinas (GBP). Utilizando o padrão Adapter, foi adaptado o          sistema antigo para fornecer a nova funcionalidade de conversão direta         para EUR, usando a conversão intermediária para GBP.
    
    Entrada
    Um valor em dólares americanos USD (Double).
    
    Saída
    O valor convertido para euros EUR (Double) usando o adaptador.
    
    Taxa de conversão direta (para referência):
    1 USD = 0.85 EUR
    
    Taxas de conversão para a adaptação:
    1 USD para GBP = 0.80
    1 GBP para EUR = 1.0625
