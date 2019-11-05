Feature: Realizar Cadastro com cnpj
	Sendo um usuário autorizado,
	Posso efetuar o cadastro no website Tilix
	Para que possa realizar a gestão de boletos.

@important1	
Scenario: Realizar o cadastro de todas as etapas Tilix informando um cnpj
	Given User navigates to tilix website pj
	And   User enters a valid email pj
	When User clicks on the experimentar gratis button pj
	Then User should be taken to the successful to etapa pj 02 
	And user enters a valid cnpj
    And user enters a valid State pj
    When User clicks on the continuar cadastro button pj
	Then User should be taken to the successful to etapa pj 03 
	And User enters  your first name   
	And User enters last name
	And User enters cellphone
	And User enters telephone house
	And User enters passowrd
    And User enters passowrd confirmation
    And User clicks on terms of use check-box
    And User clicks on finalizar cadastro button
    Then User should be taken to the successful to nex page
    