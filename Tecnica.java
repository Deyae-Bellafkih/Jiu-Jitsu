public class Tecnica {

    private String nome;
    private int difficolta;
    private String categoria;

    public Tecnica(String nome, int difficolta, String categoria) {
        this.nome = nome;
        this.difficolta = difficolta;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getDifficolta() {
        return difficolta;
    }

    public String getCategoria() {
        return categoria;
    }

    public String toString() {
        return "Tecnica[ nome: " + nome + ", difficoltà: " + difficolta + ", categoria: " + categoria +  " ]";
    }
}
