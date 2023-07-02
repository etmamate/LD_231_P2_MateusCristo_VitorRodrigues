public class Aluno {
    String nome;
    float media;

    public Aluno() {
        // blankline
    }

    public Aluno(String nome, float media, int maximoAluno) {
        setNome(nome);// Setando o Nome do Aluno
        setMedia(media);// Setando a Media do Aluno
    }

    public String getNome() { // recebendo o Nome do aluno
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(Float media) // Recebendo a Media do aluno
    {
        this.media = media;
    }

    void listar() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Media: \n" + this.media);
    }

    void Aprovados() {
        if (media >= 6) {
            System.out.println("\nNome: " + this.nome + " APROVADO!\n");
        }
    }

    void Reprovados() {
        if (media < 6) {
            System.out.println("\nNome: " + this.nome + " REPROVADO!\n");
        }
    }
}