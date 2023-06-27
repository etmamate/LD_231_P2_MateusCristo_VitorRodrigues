public class Aluno 
{
    public String nome;
    public float media; 
    public Aluno(String nome)
    {
        this.nome = nome;
    }
    public void CadastrarNotas(float nota1, float nota2)
    {
        media = (nota1 + nota2) / 2;
    }
}