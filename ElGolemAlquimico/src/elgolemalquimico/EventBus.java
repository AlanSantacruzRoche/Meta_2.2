/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgolemalquimico;

import java.util.*;
import java.util.concurrent.*;

public class EventBus {
    private final Map<Class<?>, List<EventListener<?>>> listeners = new ConcurrentHashMap<>();

    public <T> void suscribir(Class<T> tipoEvento, EventListener<? super T> listener) {
        listeners.computeIfAbsent(tipoEvento, k -> new CopyOnWriteArrayList<>()).add(listener);
    }

    public <T> void desuscribir(Class<T> tipoEvento, EventListener<? super T> listener) {
        List<EventListener<?>> list = listeners.get(tipoEvento);
        if (list != null) list.remove(listener);
    }

    @SuppressWarnings("unchecked")
    public <T> void publicar(T evento) {
        List<EventListener<?>> list = listeners.get(evento.getClass());
        if (list != null) {
            for (EventListener<?> listener : list) {
                ((EventListener<T>) listener).onEvent(evento);
            }
        }
    }
}
