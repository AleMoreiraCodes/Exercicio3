package example;

public class PedidoEstadoPreparado extends PedidoEstado {

    private PedidoEstadoPreparado() {};
    private static PedidoEstadoPreparado instance = new PedidoEstadoPreparado();
    public static PedidoEstadoPreparado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido pronto.";
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
