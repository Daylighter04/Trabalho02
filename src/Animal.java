public class Animal {
    private String nome;
    private final int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String toString() {
        return "Animal: " + nome + ", Idade: " + idade + ", Raça: " + raca;
    }
}

class Mamifero extends Animal {
    public Mamifero(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }
}

class Cachorro extends Mamifero {
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    public void alimentar() {
        System.out.println(getNome() + " está sendo alimentado.");
    }

    public void passear() {
        System.out.println(getNome() + " está passeando.");
    }
}

class Gato extends Mamifero {
    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    public void alimentar() {
        System.out.println(getNome() + " está sendo alimentado.");
    }

    public void brincar() {
        System.out.println(getNome() + " está brincando.");
    }
}

