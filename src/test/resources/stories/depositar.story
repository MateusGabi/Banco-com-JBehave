Meta:

Narrative:
Como um Cliente do Banco
eu quero depositar dinheiro em minha conta
para que ele esteja seguro.

Scenario: CT-016 (Principal) Depósito
Given uma conta qualquer
When quer depositar 20.00 reais
Then depósito é realizado

Scenario: CT-017 Depósito de 0 reais
Given uma conta qualquer
When quer depositar 0.00 reais
Then depósito não é realizado

Scenario: CT-018 Depósito negativo
Given uma conta qualquer
When quer depositar -20.00 reais
Then depósito não é realizado

Scenario: CT-019 Depósito de letra
Given uma conta qualquer
When quer depositar a reais
Then depósito não é realizado