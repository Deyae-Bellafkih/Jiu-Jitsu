public class Tecnica {

     public enum Categoria {
        GUARDIA,
        PASSAGGI,
        SOTTOMISSIONI,
        CONTROLLO
    }

    private String nome;
    private int difficolta;
    private Categoria categoria;

    public Tecnica(String nome, int difficolta,  Categoria categoria) {
        this.nome = nome;
        this.difficolta = difficolta;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getDifficolta() {
        return difficolta;
    }

    public String toString() {
        return "Tecnica[ nome: " + nome + ", difficoltà: " + difficolta + ", categoria: " + categoria +  " ]";
    }
}
