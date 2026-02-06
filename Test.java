public class Test {
    public static void main(String[] args) {
        Lista lista = new Lista();

        Tecnica c1 = (new Tecnica("RNC", 2, Tecnica.Categoria.SOTTOMISSIONI));
        Tecnica c2 = (new Tecnica("Leva al braccio", 1, Tecnica.Categoria.SOTTOMISSIONI));
        Tecnica c3 = (new Tecnica("Americana", 3, Tecnica.Categoria.SOTTOMISSIONI));
        Tecnica c4 = (new Tecnica("Kimura", 4, Tecnica.Categoria.SOTTOMISSIONI));
        Tecnica c5 = (new Tecnica("Triangolo", 5, Tecnica.Categoria.SOTTOMISSIONI));

        lista.inserisciOrdinato(c1);
        lista.inserisciOrdinato(c2);
        lista.inserisciOrdinato(c3);
        lista.inserisciOrdinato(c4);
        lista.inserisciOrdinato(c5);

        lista.eliminazione(3);

        lista.stampaLista();
    }
}
