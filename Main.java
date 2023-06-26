import java.util.Scanner;

public class Main 
{
    static String menu = """
            1 - Cadastrar/Alunos
            2 - Exibir Alunos
            3 - Cadastrar Notas
            4 - Alunos Reprovados
            5 - Alunos Aprovados
            6 - Menu
            0 - Sair
            """;
    static String lineBreak = "-".repeat(24);

    public static void main(String[] args) 
    {   
        Alunos alunos = new Alunos();
        int opcao;
        Scanner scn = new Scanner(System.in);
        System.out.println(menu);
        opcao = scn.nextInt();
            switch (opcao)
            {
                case 1:
                    System.out.println("Nome: ");
                    String nome = scn.next();
                    alunos.Cadastrar(nome);
                    break;
                case 2:
                    //exiAlunos();
                    break;
                default:
            }
        }while(opcao!=0);
}
