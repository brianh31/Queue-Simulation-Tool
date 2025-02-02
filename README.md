# Queue Simulation Tool

## Overview
The **Queue Simulation Tool** is a Java-based application that simulates a service queue with multiple customers. It allows users to add customers with varying service times, process them in a queue, and display key statistics such as total customers served and average service time.

## Features
- **Add Customers**: Create customers with different service times to simulate real-world queue dynamics.
- **Queue Processing**: Serve customers sequentially based on their arrival.
- **Statistics Display**: Calculate and display total customers served, total service time, and average service time.

## Project Structure
QueueSimulationTool/ │ README.md │  └───src/ └───main/ └───java/ └───com/ └───queuesimulation/ │ QueueSimulator.java │ Customer.java │ ServiceQueue.java │ Statistics.java

## Getting Started
### Prerequisites
- Java JDK 8 or higher installed on your machine.

### Steps to Run
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/QueueSimulationTool.git
Navigate to the project directory:

cd QueueSimulationTool/src/main/java

Compile the project:

javac com/queuesimulation/*.java

Run the simulation:

java com.queuesimulation.QueueSimulator
