package org.example;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Cliente (String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void acompanharPedido(Pedido pedido) {
        pedido.addObserver(this);
    }

    @Override
    public void update(Observable pedido, Object arg) {
        if (pedido instanceof Pedido) {
            Pedido p = (Pedido) pedido;
            this.ultimaNotificacao = this.nome + ", o status do seu pedido foi atualizado para: " + p.getNomeEstado();
            System.out.println(this.ultimaNotificacao);
        }
    }
}