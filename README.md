🧠 POO em Java — Conceitos Essenciais
📌 Abstract vs Interface
🧩 Classe Abstrata (abstract)

Uma classe abstrata representa uma base comum entre classes relacionadas, permitindo compartilhar:

Atributos
Métodos concretos (com implementação)
Métodos abstratos (sem implementação)

👉 Ou seja: não é só “o que têm em comum”
É também reutilização de código + estrutura base do sistema

🔌 Interface

Uma interface define um contrato de comportamento que pode ser implementado por qualquer classe, mesmo sem relação direta.

Não representa herança de estrutura
Representa capacidade/ação obrigatória

👉 Não é só “característica”
É um compromisso de implementação

⚡ Resumo rápido (nível entrevista)

Abstract define o que algo é.
Interface define o que algo pode fazer.

🔁 Polimorfismo

Polimorfismo é a capacidade de objetos diferentes responderem de formas distintas ao mesmo método.

💡 Na prática:

Você pode tratar objetos diferentes de forma genérica, mas cada um executa sua própria lógica.

🎯 Benefícios:
Flexibilidade
Reutilização de código
Baixo acoplamento
🚀 Exemplo conceitual
Animal animal = new Cachorro();
animal.emitirSom(); // Late

animal = new Gato();
animal.emitirSom(); // Mia

👉 Mesmo método (emitirSom()), comportamentos diferentes.