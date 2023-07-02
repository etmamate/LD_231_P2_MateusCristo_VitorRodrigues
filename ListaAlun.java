import java.util.ArrayList;

public class ListaAlun {
    ArrayList<Aluno> listaAlunos;
    int maximoaluno = 5;

    public ListaAlun() {
        this.listaAlunos = new ArrayList<>(5);
    }

    void recebeAluno(Aluno nAluno) {
        if (listaAlunos.size() != 5) {
            listaAlunos.add(nAluno);
        }
        else
        {
            System.out.println("MAXIMO ATINGIDO");
        }

    }

    void listarAlunos() {
        System.out.println("\nLista de Alunos: ");
        for (Aluno alunoLista : listaAlunos) {
            alunoLista.listar();
        }
    }

    void listarAlunosAprovados() {
        System.out.println("\nLista de Alunos Aprovados: ");
        for (Aluno alunoLista : listaAlunos) {
            alunoLista.Aprovados();
        }
    }

    void listarAlunosReprovados() {
        System.out.println("\nLista de Alunos Reprovados: ");
        for (Aluno alunoLisAluno : listaAlunos) {
            alunoLisAluno.Reprovados();
        }
    }
}
