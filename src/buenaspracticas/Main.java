package buenaspracticas;

public class Main {


    public static void main(String[] args) {
        Lista lista =new Lista();

        lista.añadirNumero(1);
        lista.añadirNumero(2);
        lista.añadirNumero(3);
        lista.añadirNumero(4);
        lista.añadirNumero(2);

        System.out.println(lista.mostrarLista());


    }
}
