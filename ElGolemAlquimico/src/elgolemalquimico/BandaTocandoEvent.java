/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

/**
 *
 * @author Asus TUF
 */
public final class BandaTocandoEvent {
    private final String nombreBanda;
    private final String nombreCancion;
    private final int duracion;

    public BandaTocandoEvent(String nombreBanda, String nombreCancion, int duracion) {
        this.nombreBanda = nombreBanda;
        this.nombreCancion = nombreCancion;
        this.duracion = duracion;
    }

    public String getNombreBanda() { return nombreBanda; }
    public String getNombreCancion() { return nombreCancion; }
    public int getDuracion() { return duracion; }
}
