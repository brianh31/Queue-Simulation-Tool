package com.queuesimulation;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceQueue {
    private final Queue<Customer> queue;
    private final Statistics statistics;

    public ServiceQueue() {
        queue = new LinkedList<>();
        statistics = new Statistics();
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println("Customer " + customer.getId() + " added to the queue.");
    }

    public void processCustomers() {
        while (!queue.isEmpty()) {
            Customer current = queue.poll();
            System.out.println("Serving customer: " + current.getId() + " (Service Time: " + current.getServiceTime() + " mins)");
            try {
                Thread.sleep(current.getServiceTime() * 1000);  // Simulate processing time in seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Processing interrupted.");
            }
            statistics.recordService(current);
        }
    }

    public Statistics getStatistics() {
        return statistics;
    }
}
