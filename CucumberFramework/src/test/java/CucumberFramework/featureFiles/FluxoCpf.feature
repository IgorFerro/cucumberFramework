Feature: Realizar Cadastro
	Permitir o usuário a realizar o cadastro na Tilix
	
@important2	
Scenario: Realizar o cadastro de todas as etapas Tilix
	Given User navigates to tilix website 
	And User enters a valid email
	When User clicks on the experimentar gratis button 
	Then User should be taken to the successful to etapa 02 
	And user enters a valid CPF
    And user enters a valid State
    And user enters a valid birthday
    When User clicks on the continuar cadastro button 
	Then User should be taken to the successful to etapa 03 
    And User enters  your first name 
	And User enters last name
	And User enters cellphone
	And User enters telephone house
	And User enters passowrd
    And User enters passowrd confirmation
    And User clicks on terms of use check-box
    And User clicks on finalizar cadastro button
		
	
	