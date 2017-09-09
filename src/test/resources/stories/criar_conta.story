Meta:

Narrative:
Como um Futuro Cliente do Banco
Eu devo criar uma conta
Para utilizar as facilidades que um banco me oferece

Scenario: CT-001 - criação de conta principal
Given a cliente chamado Mateus
When quero criar conta com saldo 150.0
Then cria conta com saldo 150.0

Scenario: CT-002 - criação de conta com nome invalido
Given a cliente chamado a,123%
When quero criar conta com saldo 150.0
Then não cria conta, pois nome invalido

Scenario: CT-003 - criação de conta com saldo inválido (menor que zero)
Given a cliente chamado Mateus
When quero criar conta com saldo -150.0
Then não cria conta, saldo inválido

Scenario: CT-004 - criação de conta com nome e saldo inválido (menor que zero)
Given a cliente chamado a,123%
When quero criar conta com saldo -150.0
Then não cria conta, nome e saldo inválido

Scenario: CT-005 - criação de conta com saldo inválido (letra)
Given a cliente chamado Mateus
When quero criar conta com saldo a
Then não cria conta, saldo inválido

Scenario: CT-006 - criação de conta com nome e saldo inválido (letra)
Given a cliente chamado a,123%
When quero criar conta com saldo a
Then não cria conta, nome e saldo inválido
