/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

/**
 *
 * @author Asus TUF
 */
public class Cocina implements EventListener<PedidoRealizadoEvent> {
    private final EventBus eventBus;

    public Cocina(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void onEvent(PedidoRealizadoEvent event) {
        for (String item : event.getItems()) {
            if (!item.toLowerCase().contains("cerveza") && !item.toLowerCase().contains("vino")) {
                System.out.println("[COCINA] Preparando " + item + " del pedido " + event.getPedidoId());
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);
                        eventBus.publicar(new ComidaPreparadaEvent(event.getPedidoId(), item));
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }).start();
            }
        }
    }
}

