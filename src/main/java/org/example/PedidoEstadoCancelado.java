package org.example;

public class PedidoEstadoCancelado extends PedidoEstado {

    private PedidoEstadoCancelado() {};
    private static org.example.PedidoEstadoCancelado instance = new org.example.PedidoEstadoCancelado();
    public static org.example.PedidoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido cancelado.";
    }

}
