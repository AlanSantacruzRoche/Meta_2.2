/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

/**
 *
 * @author Asus TUF
 */
public class PanelLED implements EventListener<Object> {
    @Override
    public void onEvent(Object event) {
        if (event instanceof BebidaServidaEvent bebidaEvent) {
            System.out.println("[PANEL LED]  Nueva bebida servida en la mesa " + bebidaEvent.getMesaId() + "!");
        } else if (event instanceof ComidaPreparadaEvent comidaEvent) {
            System.out.println("[PANEL LED]  Comida lista para el pedido " + comidaEvent.getPedidoId() + "!");
        } else if (event instanceof BandaTocandoEvent bandaEvent) {
            System.out.println("[PANEL LED]  Tocando ahora: " + bandaEvent.getNombreCancion());
        } else if (event instanceof PedidoRealizadoEvent pedidoEvent) {
            System.out.println("[PANEL LED]  Nuevo pedido recibido de " + pedidoEvent.getMesaId());
        }
    }
}
