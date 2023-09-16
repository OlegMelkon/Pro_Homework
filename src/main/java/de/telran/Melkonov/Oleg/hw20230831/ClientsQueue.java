package de.telran.Melkonov.Oleg.hw20230831;

import java.util.PriorityQueue;
import java.util.Queue;

public class ClientsQueue {
    public static void main(String[] args) {
        Queue<Client> clients = new PriorityQueue<>(new ClientQueueComparator());
        clients.add(new Client(true));
        clients.add(new Client(false));
        clients.add(new Client(true));
        clients.add(new Client(false));
        clients.add(new Client(true));
        clients.add(new Client(false));
        clients.add(new Client(false));
        clients.add(new Client(true));
        clients.add(new Client(false));
        clients.add(new Client(false));
        System.out.println(clients);
    }
}
