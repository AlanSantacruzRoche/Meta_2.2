/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

/**
 *
 * @author Asus TUF
 */
import java.util.*;

public final class PedidoRealizadoEvent {
    private final String mesaId;
    private final String pedidoId;
    private final List<String> items;

    public PedidoRealizadoEvent(String mesaId, String pedidoId, List<String> items) {
        this.mesaId = mesaId;
        this.pedidoId = pedidoId;
        this.items = Collections.unmodifiableList(new ArrayList<>(items));
    }

    public String getMesaId() { return mesaId; }
    public String getPedidoId() { return pedidoId; }
    public List<String> getItems() { return items; }
}