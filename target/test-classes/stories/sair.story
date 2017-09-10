Meta:

Narrative:
Como um Cliente do Banco
eu quero sair da minha conta em um terminal
para outras pessoas não possam acessá-la sem autorização.

Scenario: CT-020 (Principal) Sair
Given uma conta qualquer
When quer sair clicando em 4
Then sistema encerrado

Scenario: CT-021 Sair colocando valor inválido
Given uma conta qualquer
When quer sair clicando em 5
Then sistema nao encerra