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


4 - EXTENSION FUNCTION

    Gerando Slugs de Livros

    Descrição
    As Extension Functions, ou Funções de Extensão, são recursos poderosos           disponíveis em linguagens de programação que permitem adicionar métodos a         classes existentes sem a necessidade de modificar o código-fonte original         dessas classes. Isso facilita a criação de novas funcionalidades ou               comportamentos para tipos de dados já existentes, mesmo quando você não tem       acesso ao código fonte original desses tipos.
    
   Neste desafio, com foco em um sistema de gerenciamento de livros para uma         biblioteca digital, foi implementado uma solução que permita gerar um 
   "slug" único para representar os dados de um livro. Um "slug" é uma versão  
   simplificada e amigável para URLs de um texto, com espaços substituídos por 
   traços (-) e caracteres especiais removidos. A solução requer que você crie 
   uma função de extensão generateSlug() para a classe String que fará essa 
    transformação.
    
    Funcionalidade a ser implementada:
    
    generateSlug(): Crie uma função de extensão chamada generateSlug() para a          classe String. A função deve gerar um "slug" para a string fornecida, 
    removendo espaços e caracteres especiais, substituindo-os por traços.
    
    Entrada
    A entrada consistirá em duas strings: o título e o autor de um livro.
    
    Saída
    Imprima o "slug" gerado para o livro, no seguinte padrão:
    Slug gerado para o livro:
    nome-livro-separado-por-ifens_nome-autor-separado-por-ifens
    

        
5 - PROCESSAMENTO PARALELO/ASSINCRONO

    Tempo de Download Paralelo

    Descrição
No mundo da programação, frequentemente enfrentamos situações onde múltiplas tarefas precisam ser executadas simultaneamente para otimizar o tempo de resposta ou processamento. Um exemplo comum é o download de múltiplos arquivos da internet.

Para este desafio, suponha que você tenha uma lista de URLs que deseja "baixar". Seu objetivo é simular o download desses arquivos de forma paralela e imprimir o tamanho de cada URL após seu "download" ter sido disparado. Para simplificar, cada URL leva exatamente 1 segundo para ser "baixado".

Requisitos:

Defina uma lista de URLs que você deseja "baixar".
Crie uma função para simular o "download" de uma URL. Essa função deve aceitar uma URL como entrada e retornar o tamanho da URL.
Implementado uma lógica que permita iniciar o "download" de várias URLs em paralelo.
Imprime o tamanho de cada URL na ordem em que foram inseridas.

Entrada
A entrada consiste em uma lista de URLs, uma em cada linha. Uma linha vazia indica o fim da lista.

Saída
A saída deve mostrar o tamanho de cada URL na ordem em que foram inseridas, seguido pelo "Tempo total", que é simplesmente a contagem de URLs (por mais conta-intuitivo que pareça 😁):
Iniciando downloads...
Arq1: $tamanhoUrl1
Arq2: $tamanhoUrl2
Tempo total: $quantidadeDeUrls

