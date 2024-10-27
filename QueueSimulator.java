package com.queuesimulation;

import java.util.Random;

public class QueueSimulator {
    public static void main(String[] args) {
        ServiceQueue queue = new ServiceQueue();
        Random random = new Random();

        // Simulate arrival of customers
        for (int i = 1; i <= 10; i++) {
            int serviceTime = random.nextInt(5) + 1;  // Random service time between 1 and 5
            Customer customer = new Customer(i, serviceTime);
            queue.addCustomer(customer);
        }

        // Serve the customers
        queue.processCustomers();

        // Display statistics
        queue.getStatistics().display();
    }
}
