import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float media;
        String nome;
        Aluno nAluno = new Aluno();
        ListaAlun nLista = new ListaAlun();
        int opcao;
        String menu = """
                1-Cadastrar Aluno/e Nota
                2-Listar Alunos
                3-Aprovados
                4-Reprovados
                5-Menu
                0-Sair
                """;
        String breakline = "-".repeat(24);

        do {
            System.out.println("Menu");
            System.out.println(breakline);
            System.out.println(menu);
            System.out.println(breakline);
            opcao = scn.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o nome do Aluno: ");
                    nome = scn.next();
                    System.out.println("\nInsira as duas notas do Aluno: ");
                    System.out.println("Primeira Nota: ");
                    float n1 = scn.nextFloat();
                    System.out.println("Segunda Nota: ");
                    float n2 = scn.nextFloat();

                    media = (n1 + n2) / 2;

                    nAluno = new Aluno(nome, media, opcao);
                    nLista.recebeAluno(nAluno);

                    break;

                case 2:
                    nLista.listarAlunos();
                    break;
                case 3:
                    nLista.listarAlunosAprovados();
                    break;
                case 4:
                    nLista.listarAlunosReprovados();
                    break;
                case 5:
                    System.out.println(menu);
                    break;
                default:
            }
        } while (opcao != 0);
        scn.close();
    }
}
