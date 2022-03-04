import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecargaClienteTest {

    Cliente cliente = new Cliente();
    Conta conta = new Conta();
    Telefone telefone = new Telefone();
    Recarga recarga = new Recarga();

    @Test
    public void recarga() {
        telefone.setNumeroLinha("28495837549");
        telefone.setSaldo(20);

        conta.setSaldo(50);

        cliente.setNome("Joana");
        cliente.setConta(conta);
        cliente.setLinha(telefone);


        recarga.recarregar(cliente, 10);

        assertEquals("Validação do saldo da conta", cliente.getConta().getSaldo(), 40);
        assertEquals("Validação do saldo da linha do telefone", cliente.getTelefone().getSaldo(), 30);

    }
}