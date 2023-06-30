import java.util.ArrayList;

public class ListaAlun {
    ArrayList<Aluno> listaAlunos;

    public ListaAlun() {
        this.listaAlunos = new ArrayList<>();
    }

    void recebeAluno(Aluno nAluno) {
        listaAlunos.add(nAluno);
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
