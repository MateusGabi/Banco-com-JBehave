Meta:

Narrative:
Como um Cliente do Banco
eu quero sacar dinheiro
para que eu utilize da forma que eu quiser

Scenario: CT-010 Principal - Sacar
Given um cliente com saldo 150.00
When quer realizar saque de 30.00
Then sistema realiza saque

Scenario: CT-011 Sacar $0
Given um cliente com saldo 150.00
When quer realizar saque de 0.00
Then sistema não realiza saque

Scenario: CT-012 Sacar $-10.00
Given um cliente com saldo 150.00
When quer realizar saque de -10.00
Then sistema não realiza saque

Scenario: CT-013 Sacar letra
Given um cliente com saldo 150.00
When quer realizar saque de a
Then sistema não realiza saque

Scenario: CT-014 Sacar maior que saldo
Given um cliente com saldo 150.00
When quer realizar saque de 200.00
Then sistema não realiza saque

Scenario: CT-015 Sacar com limite atingido
Given um cliente com saldo 150.00
When quer realizar saque de 200.00
And limite atingido? yes
Then sistema não realiza saque