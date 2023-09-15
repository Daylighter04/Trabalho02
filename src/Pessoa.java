public class Pessoa {
    private String nome;
    private Animal animal;

    public Pessoa(String nome, Animal animal) {
        this.nome = nome;
        this.animal = animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome + " tem um " + animal.toString();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
class Professor extends Pessoa {
    public Professor(String nome, Animal animal) {
        super(nome, animal);
    }
}

class Aluno extends Pessoa {
    public Aluno(String nome, Animal animal) {
        super(nome, animal);
    }
}

