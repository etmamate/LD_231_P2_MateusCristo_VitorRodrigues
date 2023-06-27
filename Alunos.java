import java.util.ArrayList;
import java.util.List;

public class Alunos {
    public List<Alunos> lista = new ArrayList<>();

    public void Cadastrar(String nome) {
        lista.add(new Aluno(nome));
        System.out.println(nome + " foi cadastrado!");
    }

    public void ExibirAlunos() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nome);
        }
    }

    public void Reprovados() {
        for (int i = 0; i < lista.size(); i++) {
            var aluno = lista.get(i);
            System.out.println(lista.get(i).nome);
            if (aluno.media < 60) {
                System.out.println(aluno.nome + "- Média: " + aluno.media);
            }
        }
    }

    public void Aprovados() {
        for (int i = 0; i < lista.size(); i++) {
            var aluno = lista.get(i);
            if (aluno.media >= 60) {
                System.out.println(aluno.nome + "- Média: " + aluno.media);
            }

        }
    }

    public Alunos() {
        // blank line
    }
}
