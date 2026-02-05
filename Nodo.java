public class Nodo {
    private Tecnica tecnica;
    private Nodo next;

    public Nodo(Tecnica tecnica) {
        this.tecnica = tecnica;
        this.next = null;
    }

    public Tecnica getTecnica() {
        return tecnica;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public String toString() {
        return "Nodo[ tecnica: " + tecnica + "next: " + next + " ]";
    }
}
