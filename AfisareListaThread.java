public class AfisareListaThread extends Thread{
    private final String[] lista;

    public AfisareListaThread(String[] lista) {
        this.lista = lista;
    }
    public void run(){
        for(String element: lista){
            System.out.println(element);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
