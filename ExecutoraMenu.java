import java.util.Scanner;

public class ExecutoraMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cachorro[] cachorros = new Cachorro[5];
        Gato[] gatos = new Gato[5];
        Professor[] professores = new Professor[3];
        Aluno[] alunos = new Aluno[3];
        Gerente[] gerentes = new Gerente[1];
        Secretaria[] secretarias = new Secretaria[1];
        Diretor[] diretores = new Diretor[1];

        int opcao;
        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            executarOpcao(opcao, cachorros, gatos, professores, alunos, gerentes, secretarias, diretores);
        } while (opcao != 10);

        scanner.close();
    }
    public static void mostrarMenu() {
        System.out.println("\n---- MENU ----");
        System.out.println("1. Cadastrar Cachorro");
        System.out.println("2. Cadastrar Gato");
        System.out.println("3. Cadastrar Professor");
        System.out.println("4. Cadastrar Aluno");
        System.out.println("5. Cadastrar Gerente");
        System.out.println("6. Cadastrar Secretaria");
        System.out.println("7. Cadastrar Diretor");
        System.out.println("8. Realizar ação no animal");
        System.out.println("9. Listar Membros e Animais");
        System.out.println("10. Sair");
        System.out.print("Escolha uma opção: ");
    }
    public static void executarOpcao(int opcao, Cachorro[] cachorros, Gato[] gatos,
                                     Professor[] professores, Aluno[] alunos,
                                     Gerente[] gerentes, Secretaria[] secretarias, Diretor[] diretores) {
        switch (opcao) {
            case 1 -> cadastrarCachorro(cachorros);
            case 2 -> cadastrarGato(gatos);
            case 3 -> cadastrarProfessor(professores, cachorros, gatos);
            case 4 -> cadastrarAluno(alunos, cachorros, gatos);
            case 5 -> cadastrarGerente(gerentes);
            case 6 -> cadastrarSecretaria(secretarias);
            case 7 -> cadastrarDiretor(diretores);
            case 8 -> realizarAcaoNoAnimal(cachorros, gatos);
            case 9 -> listarMembros(professores, alunos, gerentes, secretarias, diretores);
            case 10 -> System.out.println("Sistema encerrado.");
            default -> System.out.println("Opção inválida. Tente novamente.");
        }
        }

    public static void cadastrarCachorro(Cachorro[] cachorros) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do cachorro: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do cachorro: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Raça do cachorro: ");
        String raca = scanner.nextLine();


        for (int i = 0; i < cachorros.length; i++) {
            if (cachorros[i] == null) {
                cachorros[i] = new Cachorro(nome, idade, raca);
                System.out.println("Cachorro cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possível cadastrar o cachorro. Limite excedido.");
    }
    public static void cadastrarGato(Gato[] gatos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do gato: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do gato: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do teclado
        System.out.print("Raça do gato: ");
        String raca = scanner.nextLine();

        for (int i = 0; i < gatos.length; i++) {
            if (gatos[i] == null) {
                gatos[i] = new Gato(nome, idade, raca);
                System.out.println("Gato cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possível cadastrar o gato. Limite excedido.");
    }
    public static void cadastrarProfessor(Professor[] professores, Cachorro[] cachorros, Gato[] gatos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do professor: ");
        String nome = scanner.nextLine();
        System.out.println("\nAnimais disponíveis:");
        listarAnimais(cachorros, gatos);
        System.out.print("Escolha um animal pelo número: ");
        int escolha = scanner.nextInt();
        Animal animalEscolhido = (escolha >= 0 && escolha < cachorros.length) ? cachorros[escolha] : gatos[escolha - cachorros.length];

        for (int i = 0; i < professores.length; i++) {
            if (professores[i] == null) {
                professores[i] = new Professor(nome, animalEscolhido);
                System.out.println("Professor cadastrado com sucesso!");
                return;
            }
        }

        System.out.println("Não foi possível cadastrar o professor. Limite excedido.");
    }

    public static void cadastrarAluno(Aluno[] alunos, Cachorro[] cachorros, Gato[] gatos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("\nAnimais disponíveis:");
        listarAnimais(cachorros, gatos);
        System.out.print("Escolha um animal pelo número: ");
        int escolha = scanner.nextInt();
        Animal animalEscolhido = (escolha >= 0 && escolha < cachorros.length) ? cachorros[escolha] : gatos[escolha - cachorros.length];

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = new Aluno(nome, animalEscolhido);
                System.out.println("Aluno cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possível cadastrar o aluno. Limite excedido.");
    }
    public static void cadastrarGerente(Gerente[] gerentes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do gerente: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < gerentes.length; i++) {
            if (gerentes[i] == null) {
                gerentes[i] = new Gerente(nome);
                System.out.println("Gerente cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possível cadastrar o gerente. Limite excedido.");
    }
    public static void cadastrarSecretaria(Secretaria[] secretarias) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome da secretaria: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < secretarias.length; i++) {
            if (secretarias[i] == null) {
                secretarias[i] = new Secretaria(nome);
                System.out.println("Secretaria cadastrada com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possível cadastrar a secretaria. Limite excedido.");
    }
    public static void cadastrarDiretor(Diretor[] diretores) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do diretor: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < diretores.length; i++) {
            if (diretores[i] == null) {
                diretores[i] = new Diretor(nome);
                System.out.println("Diretor cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possível cadastrar o diretor. Limite excedido.");
    }
    public static void listarAnimais(Cachorro[] cachorros, Gato[] gatos) {
        for (int i = 0; i < cachorros.length; i++) {
            if (cachorros[i] != null) {
                System.out.println(i + ". Cachorro: " + cachorros[i].getNome());
            }
        }

        for (int i = 0; i < gatos.length; i++) {
            if (gatos[i] != null) {
                System.out.println((i + cachorros.length) + ". Gato: " + gatos[i].getNome());
            }
        }
    }
    public static void realizarAcaoNoAnimal(Cachorro[] cachorros, Gato[] gatos) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEscolha um animal para realizar a ação:");
            listarAnimais(cachorros, gatos);
            System.out.print("Escolha um animal pelo número: ");
            int escolha = scanner.nextInt();

            if (escolha >= 0 && escolha < cachorros.length && cachorros[escolha] != null) {
                Cachorro cachorro = cachorros[escolha];
                System.out.println("\nAções disponíveis:");
                System.out.println("1. Alimentar");
                System.out.println("2. Passear");
                int acao = scanner.nextInt();

                switch (acao) {
                    case 1 -> cachorro.alimentar();
                    case 2 -> cachorro.passear();
                    default -> System.out.println("Ação inválida.");
                }
            } else if (escolha >= cachorros.length && escolha < (cachorros.length + gatos.length) && gatos[escolha - cachorros.length] != null) {
                Gato gato = gatos[escolha - cachorros.length];
                System.out.println("\nAções disponíveis:");
                System.out.println("1. Alimentar");
                System.out.println("2. Brincar");
                int acao = scanner.nextInt();

                switch (acao) {
                    case 1 -> gato.alimentar();
                    case 2 -> gato.brincar();
                    default -> System.out.println("Ação inválida.");
                }
            } else {
                System.out.println("Animal não encontrado.");
            }
        }

    public static void listarMembros(Professor[] professores, Aluno[] alunos, Gerente[] gerentes, Secretaria[] secretarias, Diretor[] diretores) {
        System.out.println("\n---- Lista de Membros e Seus Animais ----");

        for (Professor professor : professores) {
            if (professor != null) {
                System.out.println(professor);
            }
        }

        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println(aluno);
            }
        }

        for (Gerente gerente : gerentes) {
            if (gerente != null) {
                System.out.println(gerente);
            }
        }

        for (Secretaria secretaria : secretarias) {
            if (secretaria != null) {
                System.out.println(secretaria);
            }
        }

        for (Diretor diretor : diretores) {
            if (diretor != null) {
                System.out.println(diretor);
            }
        }
    }
}