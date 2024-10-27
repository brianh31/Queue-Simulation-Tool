package com.queuesimulation;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    private final List<Customer> servedCustomers;
    private int totalServiceTime;

    public Statistics() {
        servedCustomers = new ArrayList<>();
        totalServiceTime = 0;
    }

    public void recordService(Customer customer) {
        servedCustomers.add(customer);
        totalServiceTime += customer.getServiceTime();
    }

    public void display() {
        int totalCustomers = servedCustomers.size();
        double averageServiceTime = totalCustomers == 0 ? 0 : (double) totalServiceTime / totalCustomers;

        System.out.println("\nQueue Simulation Statistics:");
        System.out.println("Total Customers Served: " + totalCustomers);
        System.out.println("Total Service Time: " + totalServiceTime + " mins");
        System.out.println("Average Service Time: " + String.format("%.2f", averageServiceTime) + " mins");
    }
}
