Feature: Validar Etapa 2
	Sendo um tester,
	Posso validar os campos referente a etapa 02,
	Para que possa assegurar que o usuário não informará um CPF/CNPJ inválidos.
	
    Background:
	Given User navigates to tilix website for validate second step 
	And   User enters a valid email for validate second step
	When User clicks on the experimentar gratis button for validate second step
	
	Scenario: Verificar se o CNPJ é válido.
	Given o usuário informa um cnpj invalido
	Then a mensagem CNPJ/CPF inválido e apresentada
	
	
	Scenario: Aceitar Somente CNPJ válidos na Receita Federal.
	Given o usuário um CNPJ válido na receita federal
	And seleciona a UF da empresa
	And aciona o botão CONTINUAR CADASTRO 
	Then a próxima etapa é apresentada
	
	Scenario: Verificar se o CPF é válido.
	Given o usuário informa um cpf invalido
	Then a mensagem CNPJ/CPF inválido e apresentada
	
	
	Scenario: Aceitar Somente CPF válido na Receita Federal.
	Given o usuário um cpf válido na receita federal
	And o usuario seleciona a UF da empresa
	Then o campo data de nascimento é apresentado
	And o usuario aciona o botão CONTINUAR CADASTRO 
	Then a proxima etapa é apresentada 
		
	Scenario: Não aceitar CNPJ de um usuário já cadastrado.
	Given o usuário informa um cnpj já cadastrado
	And o usuario seleciona a UF da empresa
	And o usuario aciona o botão CONTINUAR CADASTRO 
	Then a mensagem CNPJ/CPF ja cadastrado e apresentada
	
	
	Scenario: Validar Campo Obrigatórios
	When o usuário aciona o botão CONTINUAR CADASTRO
	Then a mensagem Campo obrigatório é apresentada
	
	
	