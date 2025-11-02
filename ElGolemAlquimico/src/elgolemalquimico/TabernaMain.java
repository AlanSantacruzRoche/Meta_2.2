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

public class TabernaMain {
    public static void main(String[] args) throws InterruptedException {
        EventBus eventBus = new EventBus();

        SistemaDePedidos pedidos = new SistemaDePedidos(eventBus);
        Barra barra = new Barra(eventBus);
        Cocina cocina = new Cocina(eventBus);
        Banda banda = new Banda(eventBus);
        SistemaDeSonido sonido = new SistemaDeSonido();
        PanelLED panel = new PanelLED();


        eventBus.suscribir(PedidoRealizadoEvent.class, barra);
        eventBus.suscribir(PedidoRealizadoEvent.class, cocina);
        eventBus.suscribir(BandaTocandoEvent.class, sonido);


        eventBus.suscribir(PedidoRealizadoEvent.class, panel);
        eventBus.suscribir(BebidaServidaEvent.class, panel);
        eventBus.suscribir(ComidaPreparadaEvent.class, panel);
        eventBus.suscribir(BandaTocandoEvent.class, panel);

        pedidos.realizarPedido("Mesa 5", "P001", List.of("Cerveza", "Hamburguesa"));
        banda.tocarCancion("Los Seguidores de Dijkstra", "El Algoritmo del Amor", 180);

        Thread.sleep(7000);
        System.out.println("=== Fin de la simulacion ===");
    }
}
