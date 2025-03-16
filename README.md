# Visitor Design Pattern

You are a software developer working on an e-commerce platform that sells various
types of furniture (chairs, tables, sofas, etc.). You want to implement a
functionality that calculates the shipping cost based on the furniture type
and size.

Each furniture type might have its own unique shipping cost calculation logic.
For example, chairs might be lightweight and have a flat shipping rate, while
sofas might be bulky and require a distance-based shipping cost calculation.
Implementing separate shipping logic within each furniture class would lead to
tight coupling and difficulty adding new furniture types in the future.

Implement a visitor design pattern approach. You must show the different elements
of visitor design in your solution.  DO NOT USE ABSTRACT CLASSES. You are free to
name your interfaces and concrete classes. Have a client code that will test your
program.

# UML Diagram

[Paste the code here](https://mermaid.live)

```mermaid
classDiagram
    class Furniture {
        + void accept(ShippingCostVisitor visitor)
    }

    class Chair {
        <<record>>
        - double weight
        - Size size
        + void accept(ShippingCostVisitor visitor)
    }
    
    class Size {
        <<enumeration>>
        SMALL
        MEDIUM
        LARGE
    }

    class Sofa {
        <<record>>
        - double length
        - double width
        + void accept(ShippingCostVisitor visitor)
    }

    class ShippingCostVisitor {
        + void visit(Chair chair)
        + void visit(Sofa sofa)
    }

    class ConcreteShippingVisitor {
        - double totalShippingCost
        - static double BASE_CHAIR_PRICE
        - static double BASE_SOFA_RATE
        + void visit(Chair chair)
        + void visit(Sofa sofa)
        + double getTotalShippingCost()
    }

    class Client {
        + main(String[] args)
    }

    Furniture <|-- Chair
    Furniture <|-- Sofa
    Chair ..> ShippingCostVisitor
    Sofa ..> ShippingCostVisitor
    Chair --> Size
    ShippingCostVisitor <|.. ConcreteShippingVisitor
    Client ..> Furniture
    Client ..> ConcreteShippingVisitor
```
