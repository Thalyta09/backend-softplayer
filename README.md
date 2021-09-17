# backend-softplayer
Resolvendo o desafio softplayer

Deverá ser criada uma aplicação de cadastro de pessoas:

1) Back-end
A aplicação, a ser desenvolvida em Java, deverá expor uma API de cadastro, alteração, remoção e consulta de pessoas com as seguintes informações:

 - Nome - obrigatório
 - Sexo
 - E-mail - não obrigatório, deve ser validado caso preenchido
 - Data de Nascimento - obrigatório, deve ser validada
 - Naturalidade
 - Nacionalidade
 - CPF - obrigatório, deve ser validado (formato e não pode haver dois cadastros com mesmo cpf)
 
Obs: a data de cadastro e atualização dos dados devem ser armazenados.

2) Front-end
A aplicação deverá ser acessível via navegador e possuir uma tela com formulário. Não há restrição em relação à tecnologia para o desenvolvimento do frontend - (https://github.com/Thalyta09/frontend-softplayer)

3) Segurança
O acesso à aplicação só poderá ser realizado por um usuário pré-existente via autenticação basic.

4) Instalação
A aplicação deverá estar disponível em uma imagem docker a partir do docker-hub e não deve exigir configurações/parâmetros. Ou seja, ao rodar a imagem, deve levantar a aplicação e funcionar.

5) Código fonte
A aplicação deverá possuir um endpoint /source acessível sem autenticação via HTTP GET que deverá retornar o link do projeto no github com o código fonte do projeto desenvolvido.

Extras:

1) A aplicação rodando em algum ambiente em nuvem.
2) A API desenvolvida em REST, seguindo o modelo de maturidade de Richardson ou utilizando GraphQL.
3) A API deverá conter documentação executável que poderá ser utilizada durante seu desenvolvimento. (Utilizar swagger).
