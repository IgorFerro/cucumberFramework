Feature: Validar Etapa 1 outline
	Sendo um tester,
	Posso validar o e-mail referente a etapa 1,
	Para que possa assegurar que o usuário não informará um e-mail inválido.
	
Scenario Outline: Validar as formas referente ao formato do e-mail.
	Given o usuario acessa a "<url>" 
	And não informa "<valor>"
	When o usuário aciona o botão EXPERIMENTAR GRATIS 
	Then a mensagem de alerta e apresentada 
	
	Examples: 
	|url                                         | valor              |
	|https://qa-web.tilix.com.br/cadastro/etapa-1|testegmail.com.br   |
	|https://qa-web.tilix.com.br/cadastro/etapa-1|testegmail.         |
	|https://qa-web.tilix.com.br/cadastro/etapa-1|teste@u.org         |
	|https://qa-web.tilix.com.br/cadastro/etapa-1|$$$$$@uol.com.br    |
	|https://qa-web.tilix.com.br/cadastro/etapa-1|teste@%%%%.com.br   |
	|https://qa-web.tilix.com.br/cadastro/etapa-1|teste456@gmail.$$$  |
    |https://qa-web.tilix.com.br/cadastro/etapa-1|teste50@gmail.com   |
	
Scenario Outline: Validar e-mail não informado
     Given o usuario acessa a "<url>" 
   	When o usuário aciona o botão EXPERIMENTAR GRATIS 
	Then a mensagem de alerta e apresentada 
	
	Examples: 
	|url                                         |
	|https://qa-web.tilix.com.br/cadastro/etapa-1|
	
	
	
	
	
	
	 
	