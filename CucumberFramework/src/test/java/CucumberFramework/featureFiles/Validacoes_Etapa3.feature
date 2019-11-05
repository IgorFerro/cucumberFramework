Feature: Validar Etapa 3
	Sendo um tester,
	Posso validar os campos referente a etapa 03,
	Para que possa assegurar que o usuário não informará um nehum dado inválido.
	
	Background:
	Given User navigates to tilix website for validate second step 
	And   User enters a valid email for validate second step
	When User clicks on the experimentar gratis button for validate second step
	Given o usuário um CNPJ válido na receita federal
	And seleciona a UF da empresa
	And aciona o botão CONTINUAR CADASTRO 
	Then a próxima etapa é apresentada
	
	
	
	Scenario: Verificar se os campos Nome e Sobrenome aceitam no mínimo 3 caracteres.
	Given o usuario informa no minimo tres caracteres para o campo nome
	And o usuario informa no  minimo tres caracteres para o campo sobrenome 
    Then o sistema recebe os valor com sucesso
	
	
	Scenario: Verificar se os campos Nome e Sobrenome  não aceitam menos 2 caracteres.
	Given o usuario informa menos que tres caracteres para o campo nome
	Then a mensagem de alerta para o campo nome e apresentada
	When o usuario informa menos que tres caracteres para o campo sobrenome   
	Then a mensagem de alerta para o campo sobrenome e apresentada
	
	Scenario: Validar Campo Obrigatórios
	When o usuario aciona o botao Finalizar Cadastro
	Then o sistema apresenta os alertas referente aos campo obrigatorios
	
	Scenario: Validar senha invalida
	When o usuário informa uma senha invalida
	Then a mensagem de alerta é apresentada
	
	Scenario: Visualizar a senha
	When o usuario aciona o botao para vizualizar a senha 
	Then a senha a exibida para o usuario
	And o usuario aciona o botao para esconder a senha
	Then o sistema não exibe a senha
	
	Scenario: Verificar os níveis de força
	When o usuario digita uma senha com o nivel de forca fraco
	Then a mensagem MUITO FRACA e apresentada
	And o usuario digita uma senha com o nivel de forca medio  
	Then a mensagem MEDIA e apresentada
	And o usuario digita uma senha com o nivel de forca forte
	Then a mensagem FORTE e apresentada
	And o usuario digita uma senha com o nivel de forca muito forte
	Then a mensagem MUITO FORTE e apresentada
	
	Scenario: Verificar se o usuário aceitou os termos de uso.
	When o usuario aciona a checkbox referente aos termos de uso
	Then o sistema seleciona com sucesso
	
	