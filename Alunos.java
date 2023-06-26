import java.util.ArrayList;
import java.util.List;

public class Alunos 
{
    public List<Alunos> lista = new ArrayList<>();
    public void Cadastrar(String nome)
    {
        lista.add(new Aluno(nome));
        System.out.println(nome+" foi cadastrado!");
    }

}
