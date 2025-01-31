package example;

public class PedidoEstadoRecebido extends PedidoEstado {

    private PedidoEstadoRecebido() {};
    private static PedidoEstadoRecebido instance = new PedidoEstadoRecebido();

    public static PedidoEstadoRecebido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido recebido.";
    }

    @Override
    public boolean receber(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        return true;
    }

    public boolean preparar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        return true;
    }

    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

}
