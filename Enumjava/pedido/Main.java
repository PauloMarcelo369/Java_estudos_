package pedido;
import java.time.LocalDateTime;
import pedido.pedidos.ordem_de_pagamento.pagamento;
import pedido.pedidos.situacao_do_pedido;

public class Main {
    public static void main(String[] args){
        situacao_do_pedido user1 = new situacao_do_pedido("Paulo", LocalDateTime.now(), pagamento.FASE_DE_ENTREGA);
        System.out.println("---------------NOTA=FISCAL-----------------\n");
        System.out.println("NOME: " + user1.getNome());
        System.out.println("MOMENTO DO PEDIDO: " + user1.getMomento());
        System.out.println("SITUAÇÃO DO PEDIDO: " + user1.getSituacao());
    }
    
}
