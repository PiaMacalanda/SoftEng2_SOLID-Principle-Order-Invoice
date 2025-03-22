# Order System Using SOLID

A simple order processing system implemented with Java following SOLID principles.

## Overview

This project demonstrates a clean, maintainable order processing system that adheres to SOLID design principles. The system handles order calculations, order processing, invoice generation, and email notifications through a modular, extensible architecture.

## SOLID Principles Implementation

### Single Responsibility Principle (SRP)
Each class and interface has exactly one responsibility:
- `OrderCalculator` - Handles price calculations
- `OrderProcessor` - Manages order placement
- `InvoiceGenerator` - Creates invoices
- `EmailService` - Sends notifications

### Open/Closed Principle (OCP)
The system is open for extension but closed for modification. New implementations (like a new invoice format) can be added without changing existing code.

### Liskov Substitution Principle (LSP)
Any implementation of our interfaces can be substituted without affecting the behavior of the system. All implementations fulfill their interface contracts.

### Interface Segregation Principle (ISP)
We use small, focused interfaces instead of one large interface. This prevents classes from depending on methods they don't use.

### Dependency Inversion Principle (DIP)
High-level modules (like `Order`) depend on abstractions (interfaces) rather than concrete implementations. Dependencies are injected through the constructor.

## Project Structure

```
src/
├── interfaces/
│   ├── OrderCalculator.java
│   ├── OrderProcessor.java
│   ├── InvoiceGenerator.java
│   └── EmailService.java
├── implementations/
│   ├── StandardOrderCalculator.java
│   ├── StandardOrderProcessor.java
│   ├── PDFInvoiceGenerator.java
│   └── EmailNotificationService.java
└── core/
    ├── Order.java
    └── OrderTest.java
```

## UML Diagram

![Order System UML Diagram](https://github.com/user-attachments/assets/e6582731-15b8-470b-9f1d-9f41a62093c7)