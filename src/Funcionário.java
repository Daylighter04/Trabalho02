public class Funcionário {
    private final String nome;

    public Funcionário(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Gerente extends Funcionário {
    public Gerente(String nome) {
        super(nome);
    }
}

class Secretaria extends Funcionário {
    public Secretaria(String nome) {
        super(nome);
    }
}

class Diretor extends Funcionário {
    public Diretor(String nome) {
        super(nome);
    }
}

