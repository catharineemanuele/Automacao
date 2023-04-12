#language: pt
Funcionalidade: Automacao
  Contexto:
    Dado usuario abrir site "http://demo.automationtesting.in/Register.html"

  @SmokeTest
  Cenário: Criação do Registro
    Quando que usuario esteja na tela de registro
    E preencha todos os campos
#    Quando clicar em submeter
#    Então deve ser direcionado para pagina

