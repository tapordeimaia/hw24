public class Main {
    public static void main(String[] args) {
        String[] lista = {"C", "B", "A"};
        AfisareListaThread threadLista = new AfisareListaThread(lista);
        threadLista.start();
        try{
            threadLista.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Lista a fost afisata");
    }
}