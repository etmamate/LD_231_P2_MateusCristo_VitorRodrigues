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

    void Aprovados() {
        System.out.println("\nAlunos Aprovados: ");
        if(media < 60)
    }
}
