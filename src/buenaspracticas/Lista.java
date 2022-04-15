package buenaspracticas;

import java.util.ArrayList;

public class Lista {
    ArrayList<Integer> listaNumeros = new ArrayList<>();

    public Lista() {}

    public  void añadirNumero(Integer numero) {
        if (!numeroExiste(numero)) {
            listaNumeros.add(numero);
        }
    }

    public boolean numeroExiste(Integer numero) {
        if (listaNumeros.contains(numero)) {
            return true;
        }
        return false;
    }

    public ArrayList mostrarLista(){
        return listaNumeros;
    }
}
