// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Voo voo = new Voo(4);

        Cliente c1 = new Cliente("joao", voo);
        Cliente c2 = new Cliente("pedro", voo);
        Cliente c3 = new Cliente("marcelo", voo);
        Cliente c4 = new Cliente("thiago", voo);
        Cliente c5 = new Cliente("Alberto", voo);
        Cliente c6 = new Cliente("Antonio", voo);
        Cliente c7 = new Cliente("Jaguncio", voo);
        Cliente c8 = new Cliente("Jesus", voo);
        Cliente c9 = new Cliente("Julio Cesar", voo);
        Cliente c10 = new Cliente("Luis Suarez", voo);
        Cliente c11 = new Cliente("Tiringa", voo);
        Cliente c12 = new Cliente("Ze da manga", voo);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
        c11.start();
        c12.start();

        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            c5.join();
            c6.join();
            c7.join();
            c8.join();
            c9.join();
            c10.join();
            c11.join();
            c12.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(voo.getAssentos().toString());

    }
}