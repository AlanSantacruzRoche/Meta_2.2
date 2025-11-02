/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

/**
 *
 * @author Asus TUF
 */
public class Banda {
    private final EventBus eventBus;

    public Banda(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void tocarCancion(String nombreBanda, String nombreCancion, int duracion) {
        System.out.println("[BANDA] Tocando \"" + nombreCancion + "\" por " + nombreBanda);
        eventBus.publicar(new BandaTocandoEvent(nombreBanda, nombreCancion, duracion));
    }
}
