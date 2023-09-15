# Trabalho02
![Boa Leitura!!](gatinho.jpg)

<span style="font-size:larger;">**Boa Leitura!!**</span>

![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+) **Classe Executora**

Modificadores:
No código, os modificadores de acesso public são usados para declarar classes e métodos, o que significa que eles podem ser acessados de qualquer lugar.

Encapsulamento:
No código, os atributos das classes (como nome, idade e raça dos animais) são privados e acessados através de métodos públicos, como getNome().

Herança:
Não há evidência direta de herança neste código. A herança ocorre quando uma classe herda os membros (atributos e métodos) de outra classe. Isso não é visível aqui.

Polimorfismo:
No código, existem as classes (Cachorro, Gato, Professor, Aluno, Gerente, Secretaria e Diretor) que compartilham um tipo comum chamado "Animal". Isso permite que esses objetos sejam tratados de maneira polimórfica, como quando são passados para métodos que aceitam objetos do tipo "Animal".

![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+)**Classe Animal**

Modificadores:
Os modificadores de acesso (public e private) estão sendo utilizados para controlar a visibilidade dos atributos e métodos. Private é usado para os atributos nome e raça na classe Animal, o que significa que eles só podem ser acessados dentro da própria classe. Public é usado para os métodos getNome(), setNome(), getIdade(), getRaca(), setRaca() e toString() na classe Animal, permitindo que eles sejam acessados por outras classes.

Encapsulamento:
O encapsulamento é evidente na classe Animal. Os atributos nome, idade e raça são privados (private) e acessados através de métodos públicos (getNome(), setNome(), getIdade(), getRaca() e setRaca()). Isso significa que o acesso e a manipulação desses atributos são controlados pela classe.

Herança:
Herança é utilizada na relação entre as classes Animal, Mamifero, Cachorro e Gato. A classe Mamífero herda de Animal usando a palavra-chave extends. Isso significa que Mamífero possui todos os atributos e métodos de Animal, além dos próprios definidos em Mamífero. As classes Cachorro e Gato herdam de Mamífero. Portanto, elas têm todos os atributos e métodos de Mamífero e Animal, além dos próprios definidos em cada uma delas.

Polimorfismo:
O polimorfismo não está explicitamente demonstrado nesta classe. 

![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+)**Classe Funcionário**

Modificadores:
Os modificadores de acesso não estão explicitamente definidos neste código. No entanto, os membros da classe Funcionário têm acesso padrão, o que significa que eles são visíveis dentro do mesmo pacote. Portanto, os membros da classe Funcionário são acessíveis apenas dentro do mesmo pacote.

Encapsulamento:
O encapsulamento está presente na classe Funcionário. O atributo nome é privado (private) e acessado através do método público getNome(). Isso garante que o acesso ao atributo nome seja controlado pela classe e que outros objetos só possam obtê-lo através do método getNome().

Herança:
A Herança é usada nas classes Gerente, Secretária e Diretor, que estendem a classe Funcionário. Isso é feito usando a palavra-chave extends. Como resultado, as classes derivadas (Gerente, Secretária e Diretor) herdam o atributo nome e o construtor de Funcionário. Isso demonstra uma relação de herança entre as classes.

Polimorfismo:
O polimorfismo não é explicitamente demonstrado neste código. 

![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+)**Classe Pessoa**

Modificadores:
Os modificadores de acesso não estão explicitamente definidos neste código. No entanto, a classe Pessoa e seus membros têm acesso padrão, o que significa que eles são visíveis dentro do mesmo pacote. Portanto, os membros da classe Pessoa são acessíveis apenas dentro do mesmo pacote.

Encapsulamento:
O encapsulamento está presente na classe Pessoa. Os atributos nome e animal são privados (private) e acessados através dos métodos públicos getNome(), setNome(), toString(), getAnimal() e setAnimal(). Isso garante que o acesso aos atributos seja controlado pela classe e que outros objetos só possam obtê-los ou modificá-los através dos métodos públicos.

Herança:
O conceito de herança é usado nas classes Professor e Aluno, que estendem a classe Pessoa. Isso é feito usando a palavra-chave extends. Como resultado, as classes derivadas (Professor e Aluno) herdam os atributos e métodos de Pessoa. Isso demonstra uma relação de herança entre as classes.

Polimorfismo:
O polimorfismo não é explicitamente demonstrado neste código.
</div>
