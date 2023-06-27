// import java.util.Scanner;

// public class CadAlunos
// {
//     //Alunos
//     private static int maximoAlunos = 5;
//     private static int totalAlunos = 0; 
//     private static int opcao = 0;
//     private static String[] alunos = new String[maximoAlunos];
//     //Notas
//     private static int maximoNotas = 5;
//     private static int totalNotas = 0;
//     private static Float[] notas = new Float[maximoNotas];

//     public static void main (String[] args)
//     {
//         Scanner scn = new Scanner(System.in);
//         do 
//         {
//             System.out.println("Menu");
//             System.out.println("-----------------------");
//             System.out.println("1- Cadastro/Alunos");
//             System.out.println("2- Exibir Alunos");
//             System.out.println("3- Cadastrar Notas");
//             System.out.println("4- Alunos Reprovados");
//             System.out.println("5- Alunos Aprovados");
//             System.out.println("0- Sair");
//             System.out.println("------------------------");
//             System.out.println("Digite a opção: ");
//             opcao = scn.nextInt();
//             switch(opcao)
//             {
//                 case 1:
//                 cadAlunos();
//                 break;
//                 case 2:
//                 exiAlunos();
//                 break;
//                 default:
//             }
//         } while (opcao != 0);
//     }

// private static void cadAlunos()
// {
//     System.out.println("---------------------------------------------");
//     Scanner scn = new Scanner(System.in);
//     if (totalAlunos < maximoAlunos)
//     {
//         System.out.println("Cadastre um Aluno:");
//         String aluno = scn.nextLine();
//         alunos[totalAlunos] = aluno;
//         totalAlunos++;

//         if (totalNotas < maximoNotas)
//         {
//             System.out.println("Coloque as duas notas do aluno;");
//             Float nota = scn.nextFloat();
//             notas[totalNotas] = nota;
//             totalNotas++;
//         }
//     } 
//     else
//     {
//         System.err.println("Maximo de Alunos Cadastrados atigindo");
//     }
//     System.out.println("---------------------------------------------");   
// }
//     private static void exiAlunos()
//     {
//         System.out.println("---------------------------------------------");
//         System.out.println("Alunos");
//         System.out.println("---------------------------------------------");
//         for (int i = 0; i < totalAlunos; i++)
//         {
//             System.out.println("Alunos " + alunos+notas[i]);
//         }
//         System.out.println("---------------------------------------------");
//     }

// }
