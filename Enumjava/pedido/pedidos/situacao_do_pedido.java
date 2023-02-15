package pedido.pedidos;
import java.time.LocalDateTime;

import pedido.pedidos.ordem_de_pagamento.pagamento;

public class situacao_do_pedido{

    String nome;
    LocalDateTime momento;
    pagamento situacao;
    
    public situacao_do_pedido(String nome, LocalDateTime momento, pagamento situacao) {
        this.nome = nome;
        this.momento = momento;
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDateTime getMomento() {
        return momento;
    }
    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }
    public pagamento getSituacao() {
        return situacao;
    }
    public void setSituacao(pagamento situacao) {
        this.situacao = situacao;
    }

}