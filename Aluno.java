public class Aluno {
    String nome;
    float media;

    public Aluno() {

    }

    public Aluno(String nome, float media) {
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
        System.out.println("\nMedia: " + this.media);
    }

}