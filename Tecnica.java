public class Tecnica implements Comparable<Tecnica> {

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

    public int compareTo(Tecnica t) {
        if (this.difficolta < t.difficolta) {
            return -1;
        } else if (this.difficolta == t.difficolta) {
            return 0;
        } else {
            return 1;
        }
    }

    public String toString() {
        return "Tecnica[ nome: " + nome + ", difficoltà: " + difficolta + ", categoria: " + categoria +  " ]";
    }
}
