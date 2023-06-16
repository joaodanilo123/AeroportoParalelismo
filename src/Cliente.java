public class Cliente extends Thread{

    public String nome;
    public String assentoReservado;

    public Voo voo;
    public Cliente(String nome, Voo voo) {
        this.nome = nome;
        this.voo = voo;
    }

    @Override
    public void run() {
        assentoReservado = voo.reservarAssento();
        if(assentoReservado == "0") {
            System.out.println(nome + " ficou sem assento :(");
            return;
        }
        System.out.println(nome + " reservou o assento " + assentoReservado);
    }
}
