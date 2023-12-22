# av3_paradigmas

### Desenvolvedor 👨‍💻
- Carlos César Grangeiro Adriano

### Avaliação 3 - Paradigmas de Linguagem de Programação

### Questão 1º) Crie um sistema de quiz (usando programação estruturada)

Regra 1: O quiz deve possuir no mínimo 3 alternativas para cada pergunta;
Regra 2: Cada acerto de questão deve valer 5 pontos;
Regra 3: Cada erro de questão deve perder 1 pontos;
Regra 4: Ao final deve ser exibido as respostas corretas e a pontuação do jogador;

Lista de perguntas:
- O que é programação estruturada?
- Quais as características da programação estruturada?
- O que é programação orientada a objetos (POO)?
- O que é Herança?
- O que é Interfaces?
- O que é Polimorfismo?

### Questão 2º) Crie um subsistema que gere etiquetas para o tipo de impressora de etiqueta “Zebra (ZPL)” usando a estória (resumida) abaixo.

História do Usuário: Emissão de Etiquetas com Facilidade

Como gerente de um pequeno armazém de bebidas,

Gostaria de um software eficiente e fácil de usar que permita a emissão de etiquetas para os produtos que temos em estoque,

Para que possamos etiquetar os produtos de forma rápida e precisa, facilitando o gerenciamento do estoque e garantindo que os produtos sejam identificados corretamente.

1) Introdução

O objetivo principal deste documento é descrever a estrutura que deve ser utilizada para criar um subsistema que faz a geração de etiquetas para produtos. Toda a arquitetura e desenvolvimento é baseado no paradigma orientação a objetos e boas práticas de programação.

![image](https://github.com/carloscz17/av3_paradigmas/assets/91580777/d5da8ba8-a435-4c81-916d-82dab5756f73)

![image](https://github.com/carloscz17/av3_paradigmas/assets/91580777/cf7db07d-b4b2-4bb0-bedf-9d85f03afc3d)


4) Implementação

Codifique usando as seguintes regras:

A descrição do produto deve ter no máximo 22 caracteres quando a etiqueta for gerada.

Os valores numéricos deve ter o formata da moeda real (R$)

A saída do método gerarEtiqueta deve possuir a seguinte estrutura (template):

![image](https://github.com/carloscz17/av3_paradigmas/assets/91580777/c4d07184-c44f-47ff-898d-2d182ef82c92)
onde tudo que estiver entre chaves {} deve ser substituído pelo valor do atributo do produto.

Use o site Labelary Online ZPL Viewer para validar se a geração está correta. Segue um exemplo da etiqueta correta:
![image](https://github.com/carloscz17/av3_paradigmas/assets/91580777/e0f7e9a9-a112-4837-b14f-ebbe26a29e20)


### Questão 3º) 
1) Introdução
O objetivo principal deste documento é descrever a estrutura que deve ser utilizada para criar um subsistema que faz o cálculo de impostos de produtos. Toda a arquitetura e desenvolvimento é baseado no paradigma orientação a objetos e boas práticas de programação.
![image](https://github.com/carloscz17/av3_paradigmas/assets/91580777/3e229b50-a8fe-42f5-958b-ef5c34088731)
![image](https://github.com/carloscz17/av3_paradigmas/assets/91580777/c6dde790-ca50-4ccc-8383-6e80848b75d3)
![image](https://github.com/carloscz17/av3_paradigmas/assets/91580777/9092016c-e3b4-42c0-9d6b-e2d586132681)
5) Implementação
Codifique as classes ICMS, PIS, IPI, ISS que implementam a interface Imposto para que o método calcular realize o cálculo de 18%, 0,65% e 12%, 22% respectivamente.

Exemplo: um produto de valor R$100,00 ao calcular o ICMS terá o imposto calculado de R$18,00 e seu total será R$118,00.

Regra de negócio 1: Para o imposto ISS deve ser considerado que o Item seja do tipo Servico (Use polimorfismo) e os demais tipos de impostos o Item deve ser do tipo Produto. 

Regra de negócio 2: Para o imposto IPI deve ser considerado que o produto seja industrial, caso o atributo industrial do produto seja false então o valor do imposto IPI é igual a 0;

6) Calculando os impostos

Crie no main uma lista de itens com pelo menos 1 item para cada imposto incluindo um produto que seja industrial e outro que não seja e com pelo menos 1 serviço.

7) Resultado final
Faça a impressão de todos os itens da lista, apresente o valor total dos itens e apresente o valor total dos impostos separado por produto e serviços.





### Tecnologia Utilizadas no Backend 📟
- Java
- Zebra (ZPL)

> Status: Finalizado ⚠️
