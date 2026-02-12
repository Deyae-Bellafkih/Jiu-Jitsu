public class Iteratore {

    private Nodo corrente;

    public Iteratore(Nodo head) {
        this.corrente = head;
    }

    public boolean hasNext() {
        return corrente != null;
    }

    public Tecnica next() {
        if (corrente == null) {
            return null;
        }

        Tecnica valore = corrente.getTecnica();
        corrente = corrente.getNext();
        return valore;
    }
}