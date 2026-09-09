package br.com.fiap.logitech.pedidos.dominio;

import br.com.fiap.logitech.pedidos.dominio.Pedido;

public interface PedidoRepository {
    Pedido salvar(Pedido pedido);

    Pedido porId(Long id);

    List<Pedido> todos();

}
