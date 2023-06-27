import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
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
        Float media;
        String nome;
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
                    System.out.println("Alunos: ");
                    alunos.ExibirAlunos();
                    break;
                case 3:
                    System.out.println("Aluno: ");
                    String.nome = scn.nextLine();
                    Aluno aluno;
                    try{
                        aluno = alunos.lista.stream()
                        .filter(a-> a.nome.toLowerCase().equals(name.toLowerCase()))
                        .findAny().get();
                    }catch(NoSuchElementException e){
                        System.out.println("Não existe aluno com esse nome.");
                        break;
                    }
                    
                    System.out.println("Nota 1: ");
                    float nota1 = scn.nextFloat()
                    System.out.println("Nota 2: ");
                    float nota2 = scn.nextFloat()

                    aluno.CadastrarNotas(nota1, nota2);
                    break;

                    case 4:
                    System.out.println("Reprovados: ");
                    alunos.Aprovados();
                    break;
                    
                    case 5:
                    System.out.println("Aprovados");
                    alunos.Aprovados();
                    break;
                    
                    case 6: 
                    System.out.println(menu);
                    break;
                default:
            }
        }
        while(opcao!=0)
        {
            scn.close();
        }
        
}
