package Faculdade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema acadêmico!");

        System.out.println("Você é um aluno ou professor? Digite 'aluno' ou 'professor':");
        String tipoUsuario = scanner.nextLine();

        if (tipoUsuario.equalsIgnoreCase("aluno")) {
            System.out.println("Você é aluno de graduação ou pós-graduação? Digite 'graduacao' ou 'posgraduacao':");
            String tipoAluno = scanner.nextLine();

            Aluno aluno;

            if (tipoAluno.equalsIgnoreCase("graduacao")) {
                aluno = new AlunoGraduacao();
            } else if (tipoAluno.equalsIgnoreCase("posgraduacao")) {
                aluno = new AlunoPosGraduacao();
            } else {
                System.out.println("Opção inválida.");
                return;
            }

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite o CPF do aluno: ");
        String cpfAluno = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matriculaAluno = scanner.nextLine();

        Aluno aluno1 = new AlunoGraduacao();
        aluno.setNome(nomeAluno);
        aluno.setCpf(cpfAluno);
        aluno.setMatricula(matriculaAluno);

        Aluno aluno2 = new AlunoPosGraduacao();
            aluno.setNome(nomeAluno);
            aluno.setCpf(cpfAluno);
            aluno.setMatricula(matriculaAluno);

        System.out.println("Bem-vindo, " + aluno.getNome() + "!");

        // Exemplo de inscrição em disciplina
        System.out.println("Lista de disciplinas disponíveis:");
        Disciplina disciplina1 = new Disciplina("Matemática");
        Disciplina disciplina2 = new Disciplina("Programação");
        Disciplina disciplina3 = new Disciplina("Segurança");
        Disciplina disciplina4 = new Disciplina("Sistema Operacional");
        Disciplina disciplina5 = new Disciplina("Métrica");
        Disciplina disciplina6 = new Disciplina("Programação Web");
        System.out.println("1. " + disciplina1.getNome());
        System.out.println("2. " + disciplina2.getNome());
        System.out.println("3. " + disciplina3.getNome());
        System.out.println("4. " + disciplina4.getNome());
        System.out.println("5. " + disciplina5.getNome());
        System.out.println("6. " + disciplina6.getNome());

        System.out.print("Digite o número da disciplina que deseja se inscrever: ");
        int escolhaDisciplina = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (escolhaDisciplina == 1) {
            aluno.inscreverDisciplina(disciplina1);
        } else if (escolhaDisciplina == 2) {
            aluno.inscreverDisciplina(disciplina2);
        } else if (escolhaDisciplina == 3) {
            aluno.inscreverDisciplina(disciplina3);
        } else if (escolhaDisciplina == 4) {
            aluno.inscreverDisciplina(disciplina4);
        } else if (escolhaDisciplina == 5) {
            aluno.inscreverDisciplina(disciplina5);
        } else if (escolhaDisciplina == 6) {
            aluno.inscreverDisciplina(disciplina6);
        } else {
            System.out.println("Opção inválida.");
        }

            System.out.print("Deseja solicitar boleto? (1 - Sim, 2 - Não): ");
            int solicitarBoleto = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (solicitarBoleto == 1) {
                aluno.solicitarBoleto();
            } else if (solicitarBoleto != 2) {
                System.out.println("Opção inválida.");
            }

            System.out.print("Deseja solicitar histórico? (1 - Sim, 2 - Não): ");
            int solicitarHistorico = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (solicitarHistorico == 1) {
                aluno.solicitarHistorico();
            } else if (solicitarHistorico != 2) {
                System.out.println("Opção inválida.");
            }


        scanner.close();
    }
        if (tipoUsuario.equalsIgnoreCase("professor")) {

            System.out.print("Digite o nome do professor: ");
            String nomeProfessor = scanner.nextLine();

            System.out.print("Digite o CPF do professor: ");
            String cpfProfessor = scanner.nextLine();

            System.out.print("Digite a matrícula do professor: ");
            String matriculaProfessor = scanner.nextLine();

            Professor professor = new Professor();
            professor.setNome(nomeProfessor);
            professor.setCpf(cpfProfessor);
            professor.setMatricula(matriculaProfessor);

            System.out.println("Bem-vindo, " + professor.getNome() + "!");

            // Exemplo de inscrição em disciplina
            System.out.println("Lista de disciplinas disponíveis:");
            Disciplina disciplina1 = new Disciplina("Matemática");
            Disciplina disciplina2 = new Disciplina("Programação");
            Disciplina disciplina3 = new Disciplina("Segurança");
            Disciplina disciplina4 = new Disciplina("Sistema Operacional");
            Disciplina disciplina5 = new Disciplina("Métrica");
            Disciplina disciplina6 = new Disciplina("Programação Web");
            System.out.println("1. " + disciplina1.getNome());
            System.out.println("2. " + disciplina2.getNome());
            System.out.println("3. " + disciplina3.getNome());
            System.out.println("4. " + disciplina4.getNome());
            System.out.println("5. " + disciplina5.getNome());
            System.out.println("6. " + disciplina6.getNome());

            System.out.print("Digite o número da disciplina que ministra: ");
            int escolhaDisciplina = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (escolhaDisciplina == 1) {
                professor.ministrarDisciplina(disciplina1);
            } else if (escolhaDisciplina == 2) {
                professor.ministrarDisciplina(disciplina2);
            } else if (escolhaDisciplina == 3) {
                professor.ministrarDisciplina(disciplina3);
            } else if (escolhaDisciplina == 4) {
                professor.ministrarDisciplina(disciplina4);
            } else if (escolhaDisciplina == 5) {
                professor.ministrarDisciplina(disciplina5);
            } else if (escolhaDisciplina == 6) {
                professor.ministrarDisciplina(disciplina6);
            } else {
                System.out.println("Opção inválida.");
            }

            Aluno aluno1 = new Aluno("Thiago");
            Aluno aluno2 = new Aluno("João");
            Avaliacao avaliacao1 = new Avaliacao("Prova 1");
            Avaliacao avaliacao2 = new Avaliacao("Prova 2");
            System.out.println("Digite a nota do aluno " + aluno1.getNome() + " para a avaliação " + avaliacao1.getNome() + ": ");
            double nota = scanner.nextDouble();
            professor.lancarNota(aluno1, avaliacao1, nota);

            System.out.println("Digite a frequência do aluno " + aluno1.getNome() +" (true para presente, false para ausente): ");
            boolean presenca = scanner.nextBoolean();
            professor.lancarFrequencia(aluno1, presenca);
        }
        scanner.close();


        }
}



