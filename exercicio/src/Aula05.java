public class Aula05 {
   public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(111);
        p1.setDono("Gabriel");
        p1.criarConta("CC");

        Conta p2 = new Conta();
        p2.setNumConta(222);
        p2.setDono("Duda");
        p2.criarConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
