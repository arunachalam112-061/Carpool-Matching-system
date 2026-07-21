# carpool-matching
# 🚗 Carpool Matching System

A Java-based console application that connects **Drivers** and **Riders** by matching ride requests based on available routes. The system uses **HashMap** for efficient data storage and retrieval and **Graph** for representing road connectivity and route matching.

---

# 📌 Project Information

| Field | Detail |
|--------|--------|
| Register Number | 711524BEE009 |
| Student Name | ARUNACHALAM A |
| Project Title | Carpool Matching System |
| Domain | Low-Level Design (LLD), built on DSA fundamentals |
| Language | Java |
| Core Concepts | HashMap, Graph, Object-Oriented Programming (OOP), Java Collections Framework |

---

# 📖 Overview

The Carpool Matching System is designed to efficiently connect drivers and riders travelling in the same direction. It minimizes transportation costs, reduces traffic congestion, and promotes ride sharing.

The project is implemented using Java and demonstrates Low-Level Design (LLD) principles with Data Structures and Algorithms.

This project includes:

- Driver Registration
- Rider Registration
- Ride Booking
- Route Management
- Ride Matching
- Seat Availability Tracking
- Graph-based Route Representation
- HashMap-based Data Storage

The system follows Object-Oriented Programming concepts such as:

- Encapsulation
- Inheritance
- Abstraction
- Polymorphism
- Composition

---

# 🎯 Objectives

- Register Drivers and Riders.
- Store ride information efficiently.
- Match riders with suitable drivers.
- Maintain available seats.
- Represent city routes using Graph.
- Demonstrate Java Collection Framework usage.
- Apply Low-Level Design principles.

---

# 🏗️ System Design

## Class Diagram

```
                          Person
                             ▲
              ┌──────────────┴──────────────┐
              │                             │
           Driver                       Rider
              │                             │
              └──────────────┬──────────────┘
                             │
                           Ride
                             │
                      CarpoolSystem
                             │
                           Graph
                             │
                            Main
```

---

# 📚 Class Responsibilities

## Person

Stores common details.

### Attributes

- name
- location

### Methods

- getName()
- getLocation()

---

## Driver

Stores Driver information.

### Attributes

- vehicleNumber
- availableSeats

### Methods

- displayDriver()

---

## Rider

Stores Rider information.

### Attributes

- destination

### Methods

- displayRider()

---

## Ride

Stores ride information.

### Attributes

- Driver
- Rider
- Source
- Destination

---

## Graph

Represents city connectivity.

### Functions

- addLocation()
- addRoute()
- displayRoutes()

Uses:

Adjacency List

Example

```
Coimbatore
    |
Gandhipuram
    |
Singanallur
```

---

## CarpoolSystem

Main business logic.

Uses

- HashMap<String, Driver>
- HashMap<String, Rider>

Functions

- registerDriver()
- registerRider()
- matchRide()
- displayRide()

---

# ⚙️ Algorithm

## Driver Registration

1. Read Driver Details.
2. Create Driver Object.
3. Store Driver inside HashMap.
4. Display Success Message.

Time Complexity

O(1)

---

## Rider Registration

1. Read Rider Details.
2. Create Rider Object.
3. Store Rider using HashMap.

Time Complexity

O(1)

---

## Route Creation

1. Create Graph.
2. Add Locations.
3. Add Routes.
4. Display Route Map.

Time Complexity

O(1)

---

## Ride Matching

1. Read Rider Source.
2. Read Destination.
3. Search Drivers.
4. Verify Route.
5. Check Seat Availability.
6. Allocate Driver.
7. Update Seats.
8. Display Ride Details.

Time Complexity

O(V + E)

---

# 🧠 Data Structures Used

## HashMap

Purpose

- Driver Storage
- Rider Storage
- Fast Searching
- Ride Information

Operations

Insert

O(1)

Search

O(1)

Delete

O(1)

---

## Graph

Purpose

- Road Network
- City Connectivity
- Route Matching

Representation

Adjacency List

Traversal

DFS

Time Complexity

O(V + E)

---

# 💻 Technologies Used

- Java
- Java Collections Framework
- HashMap
- Graph
- OOP
- VS Code
- Git
- GitHub

---

# 🚀 Build and Run

Compile

```bash
javac *.java
```

Run

```bash
java Main
```

---



# 📂 Project Structure

```
Carpool-Matching-System




├── docs

│   ├── ClassDiagram.png

│   ├── Output.png

└── README.md
```

---

# 🏆 Features

- Driver Registration
- Rider Registration
- Route Mapping
- Ride Booking
- Seat Tracking
- Graph Representation
- HashMap Storage
- Java OOP Design
- Low-Level Design

---

# 📈 Future Enhancements

- GUI using Java Swing
- GPS Integration
- Database (MySQL)
- Login Authentication
- Payment Gateway
- Mobile Application
- Live Location Tracking
- Rating System

---

# 🧠 Key Concepts Demonstrated

- Object-Oriented Programming
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Composition
- HashMap
- Graph
- DFS Traversal
- Java Collections Framework
- Low-Level Design

---

# 🙋 Author

**ARUNACHALAM A**

**Register Number:** 711524BEE009

**Department:** B.E. Electrical and Electronics Engineering (EEE)

**College:** KIT – Kalaignarkarunanidhi Institute of Technology

---

#📄 License

This project was developed as part of the **Low-Level Design (LLD) Mini Project** coursework. It demonstrates the implementation of **HashMap** and **Graph** data structures using **Java Object-Oriented Programming** principles to build an efficient **Carpool Matching System**.
