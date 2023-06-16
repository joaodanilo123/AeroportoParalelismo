import java.util.ArrayList;
public class Voo {

    private ArrayList<String> assentos = new ArrayList<String>();

    public Voo(int numeroDeAcentos) {
        System.out.println("carregando assentos");
        for (int i = 0; i < numeroDeAcentos; i++) {
            String a = "A" + i;
            assentos.add(a);
            System.out.println(a);
        }

    }

    public synchronized String reservarAssento() {
        if (assentos.size() <= 0) {
            return "0";
        }
        return assentos.remove(assentos.size() - 1);
    }

    public ArrayList<String> getAssentos(){
        return assentos;
    }

}
