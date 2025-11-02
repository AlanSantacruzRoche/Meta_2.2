/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

/**
 *
 * @author Asus TUF
 */
public class Barra implements EventListener<PedidoRealizadoEvent> {
    private final EventBus eventBus;

    public Barra(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void onEvent(PedidoRealizadoEvent event) {
        for (String item : event.getItems()) {
            if (item.toLowerCase().contains("cerveza") || item.toLowerCase().contains("vino")) {
                System.out.println("[BARRA] Preparando " + item + " para " + event.getMesaId());
                new Thread(() -> {
                    try {
                        Thread.sleep(2000);
                        eventBus.publicar(new BebidaServidaEvent(event.getMesaId(), item));
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }).start();
            }
        }
    }
}