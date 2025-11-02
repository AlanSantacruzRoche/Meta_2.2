/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

/**
 *
 * @author Asus TUF
 */
public final class BebidaServidaEvent {
    private final String mesaId;
    private final String bebida;

    public BebidaServidaEvent(String mesaId, String bebida) {
        this.mesaId = mesaId;
        this.bebida = bebida;
    }

    public String getMesaId() { return mesaId; }
    public String getBebida() { return bebida; }
}