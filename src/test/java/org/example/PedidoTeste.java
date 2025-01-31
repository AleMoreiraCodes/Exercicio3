package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTeste {

    @Test
    void testReceberPedido() {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("João");
        cliente.acompanharPedido(pedido);

        pedido.receber();
        assertEquals("Pedido recebido.", pedido.getNomeEstado());
        assertEquals("João, o status do seu pedido foi atualizado para: Pedido recebido.", cliente.getUltimaNotificacao());
    }

    @Test
    void testPrepararPedido() {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Maria");
        cliente.acompanharPedido(pedido);

        pedido.receber();
        pedido.preparar();
        assertEquals("Pedido pronto.", pedido.getNomeEstado());
        assertEquals("Maria, o status do seu pedido foi atualizado para: Pedido pronto.", cliente.getUltimaNotificacao());
    }

    @Test
    void testEntregarPedido() {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Carlos");
        cliente.acompanharPedido(pedido);

        pedido.receber();
        pedido.preparar();
        pedido.entregar();
        assertEquals("Pedido entregue.", pedido.getNomeEstado());
        assertEquals("Carlos, o status do seu pedido foi atualizado para: Pedido entregue.", cliente.getUltimaNotificacao());
    }

    @Test
    void testCancelarPedido() {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Ana");
        cliente.acompanharPedido(pedido);

        pedido.receber();
        pedido.cancelar();
        assertEquals("Pedido cancelado.", pedido.getNomeEstado());
        assertEquals("Ana, o status do seu pedido foi atualizado para: Pedido cancelado.", cliente.getUltimaNotificacao());
    }

    @Test
    void testNotificacaoMultiplosClientes() {
        Pedido pedido = new Pedido();
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");
        cliente1.acompanharPedido(pedido);
        cliente2.acompanharPedido(pedido);

        pedido.receber();
        assertEquals("João, o status do seu pedido foi atualizado para: Pedido recebido.", cliente1.getUltimaNotificacao());
        assertEquals("Maria, o status do seu pedido foi atualizado para: Pedido recebido.", cliente2.getUltimaNotificacao());
    }
}