/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

/**
 *
 * @author Asus TUF
 */
import java.util.List;

public class SistemaDePedidos {
    private final EventBus eventBus;

    public SistemaDePedidos(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void realizarPedido(String mesaId, String pedidoId, List<String> items) {
        System.out.println("[SISTEMA PEDIDOS] Pedido recibido de " + mesaId + ": " + items);
        eventBus.publicar(new PedidoRealizadoEvent(mesaId, pedidoId, items));
    }
}