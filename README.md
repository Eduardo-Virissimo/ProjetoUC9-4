#Projeto Desenvolvimento de Sistemas - SA6

Iniciamos o nosso projeto através do SpringBoot Initializr (https://start.spring.io ),
uma ferramenta essencial para o desenvolvimento em Spring. Escolhemos a
linguagem Java (versão 17) como a base do nosso projeto Maven, optamos por
utilizar o Spring Boot na versão 3.1.3 e empacotar em Jar. Para garantir a
funcionalidade e eficiência do nosso aplicativo, adicionamos as seguintes
dependências: Spring Boot DevTools, Spring Web, MySQL Driver e Thymeleaf.
Em seguida começamos a criação do nosso projeto. Criamos a classe “Atividades”
para representar os dados das atividades em nosso sistema. Esta classe incluiu os
seguintes atributos: Id, atividade, responsável, início, fim e dependências. Além
disso, acrescentamos as anotações necessárias para que as tabelas
correspondentes fossem geradas automaticamente no banco de dados.
Logo após, criamos a classe de manipulação de objetos de dados ou
DataTransferObject, DTO, para “AtividadesDTO”.
Seguindo, criamos a classe “Controller”, onde mapeamos rotas e endereços para a
execução dos determinados métodos: listar, criar, editar e excluir atividades.
Em relação aos templates, criamos “atividades.html” e “edit-form.html” para que os
detalhes das atividades possam ser visualizados pelo usuário.
Escolhemos iniciar o projeto com o Spring Boot pois a integração de certas
dependências facilita a integração entre o frontend e o backend do nosso aplicativo.
Além disso, essas dependências se tornam fáceis de acessar durante a criação do
site.
A adição do MySQL connector permitiu a utilização do banco de dados MySQL, e
assim, possibilitou a criação automática das tabelas com base nas anotações que
incluímos em nossa classe. Resultando em uma implementação mais simples e
eficiente, economizando tempo e esforço.
No entanto, apesar dessas facilidades, a gestão das dependências pode ser um
desafio. As versões das dependências precisam ser constantemente verificadas
para que o programa sequer rode, e nem sempre essas dependências são
atualizadas com frequência, o que pode causar problemas de compatibilidades e
exigir um esforço adicional na resolução dos problemas.
