public class Recarga {

    public void recarregar(Cliente cliente, int recarga) {

        if (recarga <= cliente.getConta().getSaldo()) {
            cliente.getConta().setRecarga(recarga);

            cliente.getConta().setSaldo(cliente.getConta().getSaldo() - cliente.getConta().getRecarga());
            System.out.println("Saldo da conta: " + cliente.getConta().getSaldo());

            cliente.getTelefone().setSaldo(cliente.getTelefone().getSaldo() + cliente.getConta().getRecarga());
            System.out.println("Saldo da linha do telefone: " + cliente.getTelefone().getSaldo());
        } else {
            System.out.println("Saldo insuficiente em conta, não é possível realizar a recarga");
        }
    }

}