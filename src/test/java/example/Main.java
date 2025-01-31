package example;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(); // Estado inicial: Recebido (já notifica os observadores)
        Cliente cliente = new Cliente("João");

        cliente.acompanharPedido(pedido);

        pedido.setDescricao("Pizza de Calabresa");
        pedido.setIten("Pizza");

        pedido.receber();
        pedido.preparar();
        pedido.entregar();
    }
}