package listaduplamenteencadeada;

public class Main {

    public static void main(String[] args) {

        ListaDuplaEncadeada<String> minhaListaEncadeada = new ListaDuplaEncadeada<>();

        minhaListaEncadeada.add("C1");
        minhaListaEncadeada.add("C2");
        minhaListaEncadeada.add("C3");
        minhaListaEncadeada.add("C4");
        minhaListaEncadeada.add("C5");
        minhaListaEncadeada.add("C6");
        minhaListaEncadeada.add("C7");

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.add(3,"99");

        System.out.println(minhaListaEncadeada);

    }

}
