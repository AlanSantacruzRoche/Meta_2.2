/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

/**
 *
 * @author Asus TUF
 */
public class SistemaDeSonido implements EventListener<BandaTocandoEvent> {
    @Override
    public void onEvent(BandaTocandoEvent event) {
        System.out.println("[SONIDO] Ajustando ecualizador para: " + event.getNombreCancion());
    }
}

