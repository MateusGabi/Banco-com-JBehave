Meta:

Narrative:
Como um Cliente do Banco
eu quero visualizar meu extrato da conta
para saber as informações dela (número da conta, saldo atual e o número de saques realizados no dia).

Scenario: CT-007 principal
Given a cliente mock
When digita 1
Then mostra seu extrato

Scenario: CT-008 entrada inválida (5)
Given a cliente mock
When digita 5
Then mostra erro

Scenario: CT-009 entrada inválida (a)
Given a cliente mock
When digita a
Then mostra erro