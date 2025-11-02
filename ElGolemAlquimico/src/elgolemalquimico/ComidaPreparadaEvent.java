/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

/**
 *
 * @author Asus TUF
 */
public final class ComidaPreparadaEvent {
    private final String pedidoId;
    private final String plato;

    public ComidaPreparadaEvent(String pedidoId, String plato) {
        this.pedidoId = pedidoId;
        this.plato = plato;
    }

    public String getPedidoId() { return pedidoId; }
    public String getPlato() { return plato; }
}