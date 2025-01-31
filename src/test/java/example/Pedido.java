package example;

import java.util.Observable;

public class Pedido extends Observable {

    private String descricao;
    private String iten;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoRecebido.getInstance();
        setChanged();
        notifyObservers();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers();
    }

    public boolean receber() {
        return estado.receber(this);
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setIten(String iten) {
        this.iten = iten;
    }

    public String getIten() {
        return iten;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}

