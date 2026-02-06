public class Lista {

    private Nodo head;
    private int size;

    public Lista() {
        head = null;
        size = 0;
    }

    public boolean isVuota() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void inserisciOrdinato(Tecnica tecnica) {
        Nodo nuovo = new Nodo(tecnica);
        if (isVuota() || head.getTecnica().compareTo(tecnica) >= 0) {
            nuovo.setNext(head);
            head = nuovo;
            size++;
            return;
        }
        Nodo cursor = head;
        while (cursor.getNext() != null && cursor.getNext().getTecnica().compareTo(tecnica) < 0) {
            cursor = cursor.getNext();
        }
        nuovo.setNext(cursor.getNext());
        cursor.setNext(nuovo);
        size++;
    }

    public Tecnica rimuoviTesta() {
        if (isVuota()) {
            return null;
        }
        Nodo nodoDaRimuovere = head;
        head = head.getNext();
        size--;
        return nodoDaRimuovere.getTecnica();
    }

    public void eliminazione(int index) {
        if (isVuota() || index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        Nodo current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            size--;
        }
    }

    public void stampaLista() {
        Nodo cursor = head;
        while (cursor != null) {
            System.out.println(cursor.getTecnica());
            cursor = cursor.getNext();
        }
    }
}
