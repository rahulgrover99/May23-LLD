# Introduction to Object oriented programming
## Agenda
- [Introduction to Object oriented programming](#introduction-to-object-oriented-programming)
  - [Agenda](#agenda)
  - [Key terms](#key-terms)
    - [LLD](#lld)
    - [Procedural programming](#procedural-programming)
    - [Object-oriented programming](#object-oriented-programming)
    - [Abstraction](#abstraction)
    - [Encapsulation](#encapsulation)
    - [Classes](#classes)
    - [Object](#object)
  - [Why LLD](#why-lld)
    - [What is a good software?](#what-is-a-good-software)
      - [Maintainability](#maintainability)
      - [Scalability](#scalability)
      - [Extensibility](#extensibility)
      - [Extensibility vs Reusability](#extensibility-vs-reusability)
  - [Programming paradigms](#programming-paradigms)
    - [Imperative](#Imperative)
    - [Declarative](#Declarative)
    - [Procedural programming](#procedural-programming-1)
    - [Object-oriented programming](#object-oriented-programming-1)
  - [Abstraction](#abstraction-1)
  - [Encapsulation](#encapsulation-1)
  - [Classes](#classes-1)
  - [Reading List](#reading-list)
  - [TODOs](#TODOs)

## Key terms
### LLD
> Low-level design (LLD) is a component-level design process that follows a step-by-step refinement process. This process can be used for designing data structures, required software architecture, source code and ultimately, performance algorithms. Overall, the data organization may be defined during requirement analysis and then refined during data design work. Post-build, each component is specified in detail

### Procedural programming
> Procedural programming is a programming paradigm that uses a sequence of steps to solve a problem.

### Object-oriented programming
> Object-oriented programming (OOP) is a programming paradigm that uses objects to model real-world things and aims to implement state and behavior using objects.

### Abstraction
> Abstraction is the process of hiding the implementation details of a program from the user.

### Encapsulation
> Encapsulation is used to hide the values or state of a structured data object inside a class, preventing direct access to them by clients in a way that could expose hidden implementation details or violate state invariance maintained by the methods.

### Classes
> A class is a blueprint which you use to create objects.

### Object
> An object is an instance of a class.

## Why LLD

The goal of LLD or a low-level design (LLD) is to give the internal logical design of the actual program code. Low-level design is created based on the high-level design. LLD describes the class diagrams with the methods and relations between classes and program specs. It describes the modules so that the programmer can directly code the program from the document.

A good low-level design document makes the program easy to develop when proper analysis is utilized to create a low-level design document. The code can then be developed directly from the low-level design document with minimal debugging and testing. Other advantages include lower cost and easier maintenance

Ultimately, LLD has the following goals:
  * Low level implementation details of a system
  * organization of code
  * write good software

### What is a good software?

A good software is a software that is
* easy to maintain
* easy to scale.
* easy to extend


#### Maintainability
Software is not static. If you build a valuable product that works perfectly but is difficult to modify and adapt to new requirements, it will not survive in today’s market. Maintainability is a long-term aspect that describes how easily software can evolve and change, which is especially important in today’s agile environment.

The ease with which a software system or component can be modified to correct faults, improve performance or other attributes, or adapt to a changed environment

[ISO 25010](https://iso25000.com/index.php/en/iso-25000-standards/iso-25010?limit=3&start=6) states that a highly maintainable software system must possess the following qualities:

* `Modularity` - The product is composed of discrete components such that a change to one component has minimal impact on other components.
* `Reusability` - The product makes use of assets that can be re-used in building other assets or in other systems.
* `Analyzability` - The impact of an intended change on the product, diagnosis of deficiencies, causes of failures or identification of the components that need to be changed can be analyzed effectively and efficiently.
* `Modifiability` - The product can be effectively and efficiently modified without introducing defects or degrading existing product quality.
* `Testability` - The test criteria can be established effectively and efficiently, and the product can be tested to determine whether those criteria have been met.

Scenarios -
* How easy it is for a new developer to contribute to the product?
* Can I add a new feature to the product without impacting existing functionality?
* Can I get an insight into the product’s performance?


#### Scalability

Software scalability is an attribute of a tool or a system to increase its capacity and functionalities based on its users’ demand. Scalable software can remain stable while adapting to changes, upgrades, overhauls, and resource reduction.

Scenarios -
* You just expanded your business to North America and Europe. Will your software be able to handle the users?
* How will your application perform when it has multiple users using it at the same time?
* Does your application provide a good user experience?

#### Extensibility

> Extensibility is a software engineering and systems design principle that provides for future growth. Extensibility is a measure of the ability to extend a system and the level of effort required to implement the extension. Extensions can be through the addition of new functionality or through modification of existing functionality. The principle provides for enhancements without impairing existing system functions.

Scenarios - 
1. Your application uses PayTM for payment, and you want to add a new payment method. It can be a very simple task based on how your software is structured. 
2. You use AWS for deployment and now a client wants to use your application on their own server. Again, will your code be able to handle this?
3. If I change my backend code, will my frontend code be affected?


#### Extensibility vs Reusability

Extensibility and reusability have many emphasized properties in common, including low coupling, modularity and high risk elements’ ability to construct for many different software systems, which is motivated by the observation of software systems often sharing common elements. Reusability together with extensibility allows a technology to be transferred to another project with less development and maintenance time, as well as enhanced reliability and consistency

## Programming paradigms

Some paradigms are concerned mainly with implications for the execution model of the language, such as allowing side effects, or whether the sequence of operations is defined by the execution model. Other paradigms are concerned mainly with the way that code is organized, such as grouping a code into units along with the state that is modified by the code. Yet others are concerned mainly with the style of syntax and grammar.

### Imperative
Control flow in imperative programming is explicit: commands show how the computation takes place, step by step. Each step affects the global state of the computation.

```BASIC
10 PRINT "Enter a number: ";
20 INPUT N
30 FACTORIAL = 1
40 FOR I = 1 TO N
50     FACTORIAL = FACTORIAL * I
60 NEXT I
70 PRINT "The factorial of "; N; " is "; FACTORIAL
80 END
```

### Declarative 

Control flow in declarative programming is implicit: the programmer states only what the result should look like, not how to obtain it.

```sql
select upper(name)
from people
where length(name) > 5
order by name
```

### Procedural programming
It is based on the concept of the procedure call. Procedures (a type of routine or subroutine) simply contain a series of computational steps to be carried out. Any given procedure might be called at any point during a program's execution, including by other procedures or itself.

**Think of all programming as managing the relationship between two fundamental concepts:
state and behavior. State is the data of your program. Behavior is the logic.**

Procedural Programming is based on implementing these two concepts separately. State is held in data structures. Behavior is held in functions (also known as procedures or subroutines). A procedural application therefore passes data structures into functions to produce some output.

Procedural code thinks of the actions that it has to perform as a series of steps.
Imagine you want to transfer some money from one account to another. These are the following steps that you would take:
* Open the source account
* Withdraw the money
* Open the destination account
* Deposit the money in destination account

A procedural version of this program would be:

```python
def transfer(source: int, destination: int, amount: int) -> None:
    
    source_account = get_account(source)
    update_account(source_account, -amount)

    destination_account = get_account(destination)
    update_account(destination_account, amount)

def get_account(number: int) -> dict:
    return list(filter(lambda account: account['number'] == number, accounts))[0]

def update_account(account: int, delta: int) -> None:
    account['balance'] += delta
```

## Object-oriented programming
Object-Oriented Programming is based on implementing the state and behaviour concepts together. State and behaviour are combined into one new concept: an Object. An OO application can therefore produce some output by calling an Object, without needing to pass data structures.

The focus of procedural programming is to break down a programming task into a collection of variables, data structures, and subroutines, whereas in object-oriented programming it is to break down a programming task into objects that expose behavior (methods) and data (members or attributes) using interfaces. The most important distinction is that while procedural programming uses procedures to operate on data structures, object-oriented programming bundles the two together, so an "object", which is an instance of a class, operates on its "own" data structure.

Advantages of OO include the potential for information hiding: if a caller needn't pass any data structure, then the caller needn't be aware of any data structure, and can therefore be completely decoupled from the data format.

```java
public class OopBankAccount {
    private Integer number;
    private Integer balance;

    public OopBankAccount(Integer number, Integer balance) {
        this.number = number;
        this.balance = balance;
    }

    void deposit(Integer amount) {
        this.balance  += amount;
    }

    void withdraw(Integer amount) {
        this.balance  += amount;
    }

    void transfer(OopBankAccount destination, Integer amount) {
        this.withdraw(amount);
        destination.deposit(amount);
    }

}
```

Advantages:

* Reusability: Through classes and objects, and inheritance of common attributes and functions.
* Security: Hiding and protecting information through encapsulation.
* Maintenance: Easy to make changes without affecting existing objects much.
* Inheritance: Easy to import required functionality from libraries and customize them, thanks to inheritance. 

Disadvantages:

* Beforehand planning of entities that should be modeled as classes.
* OOPS programs are usually larger than those of other paradigms.
* [Banana-gorilla problem](https://dev.to/efpage/what-s-wrong-with-the-gorilla-2l4j#:~:text=Joe%20Armstrong%2C%20the%20principal%20inventor,and%20the%20entire%20jungle.%22.) - **You wanted a banana but what you got was a gorilla holding the banana and the entire jungle**

Object-oriented concepts form the heart of Java just as they form the basis
for human understanding. It is important that you understand how these 
concepts translate into programs. As you will see, object-oriented 
programming is a powerful and natural paradigm for creating programs that 
survive the inevitable changes accompanying the life cycle of any
major software project, including conception, growth, and aging. For example, 
once you have well-defined objects and clean, reliable interfaces to those 
objects, you can gracefully decommission or replace parts of an older system 
without fear.

## Abstraction

> is a mechanism which represent the essential features without including implementation details

An essential element of object-oriented programming is abstraction. Humans manage complexity through abstraction. For example, people do not think of a car as a set of tens of thousands of individual parts. They think of it as a well-defined object with its own unique behavior. This abstraction allows people to use a car to drive to the grocery store without being overwhelmed by the complexity of the parts that form the car. They can ignore the details of how the engine, transmission, and braking systems work. Instead, they are free to utilize the object as a whole. 

A powerful way to manage abstraction is through the use of hierarchical classifications. This allows you to layer the semantics of complex systems, breaking them into more manageable pieces. From the outside, the car is a single object. Once inside, you see that the car consists of several subsystems: steering, brakes, sound system, seat belts, heating, cellular phone, and so on. In turn, each of these subsystems is made up of more specialized units. For instance, the sound system consists of a radio, a CD player, and/or a tape player. The point is that you manage the complexity of the car (or any other complex system) through the use of hierarchical abstractions. 

Hierarchical abstractions of complex systems can also be applied to computer programs. The data from a traditional process-oriented program can be transformed by abstraction into its component objects. A sequence of process steps can become a collection of messages between these objects. Thus, each of these objects describes its own unique behavior. You can treat these objects as concrete entities that respond to messages telling them to do something. This is the essence of object-oriented programming.

Objects in an OOP language provide an abstraction that hides the internal implementation details. Similar to the coffee machine in your kitchen, you just need to know which methods of the object are available to call and which input parameters are needed to trigger a specific operation. But you don’t need to understand how this method is implemented and which kinds of actions it has to perform to create the expected result.

Advantages of Abstraction:

* Abstraction is used to create a boundary between the application and the client code. This could help us to reduce the design and implementation complexity of software.
* In complex software, abstraction helps us separate responsibilities into software entities (classes, method, etc.) that only know the required functionality of each other but not how that functionality is implemented.
* Abstraction maximizes ease of use for the relevant information. In other words, the code with proper abstraction help programmers to quickly make sense of what that code does and what it is meant to be used for. It avoids code duplication and increases code reusability.
* Abstraction allows the programmer to simplify programming and shift focus from implementation details of actions toward the classes, available methods, etc. It will enable the user to avoid writing low-level code.
* It allows the programmer to change the internal implementation of methods or concrete classes without hampering the interface.
* Using abstraction, we can increase the code security as only relevant details will be provided to users.


## Encapsulation

> encapsulation refers to the bundling of data with the methods that operate on that data, or the restricting of direct access to some of an object's components. Encapsulation is used to hide the values or state of a structured data object inside a class, preventing direct access to them by clients in a way that could expose hidden implementation details or violate state invariance maintained by the methods

Encapsulation may also refer to a mechanism of restricting the direct access to some components of an object, such that users cannot access state values for all of the variables of a particular object. Encapsulation can be used to hide both data members and data functions or methods associated with an instantiated class or object.

Advantages of Encapsulation:
* `Hiding Data` - Users will have no idea how classes are being implemented or stored. All that users will know is that values are being passed and initialized.
* `More Flexibility` - Enables you to set variables as read or write-only. Examples include: setName(), setAge() or to set variables as write-only then you only need to omit the get methods like getName(), getAge() etc.
* `Easy to Reuse` - With encapsulation it's easy to change and adapt to new requirements.

### Classes 

A class is a blueprint for creating objects (a particular data structure), providing initial values for state (member variables or attributes), and implementations of behavior (member functions or methods). The user-defined objects are created using the class keyword.

When an object is created by a constructor of the class, the resulting object is called an instance of the class, and the member variables specific to the object are called instance variables, to contrast with the class variables shared across the class.

In order to create a class in Java, you need to use the class keyword.

```java
class AsiaCup {
    private String name;
}
```

A class is a blueprint which you use to create objects. An object is an instance of a class - it's a concrete 'thing' that you made using a specific class. So, 'object' and 'instance' are the same thing, but the word 'instance' indicates the relationship of an object to its class.

You can create a new instance of a class by using the new keyword and the constructor of the class.

```java
AsiaCup instance1 = new AsiaCup();
AsiaCup instance2 = new AsiaCup();
```

Changing the value of a member variable is done by using the dot operator (.) to access the member variable.

```java
instance1.name = "Asia Cup 2022";
instance2.name = "Asia Cup 2023";

System.out.println(instance1.name); // Asia Cup 2022
System.out.println(instance2.name); // Asia Cup 2023
```

## Reading List
* [OOP vs Procedural vs Functional Programming](scaler.com/topics/java/oop-vs-functional-vs-procedural/)
* [Programming Paradigms](https://cs.lmu.edu/~ray/notes/paradigms/)
* [Abstraction](https://levelup.gitconnected.com/abstraction-in-object-oriented-programming-a28a0e534f75)
* [Java The Complete Reference](http://libgen.rs/book/index.php?md5=8C1E0F8CC408249BF7EF46DFDAE99E1A)


## TODOs
* [Git Tutorial](https://www.scaler.com/topics/git/)
* [Git essentials](https://www.scaler.com/topics/git/git-commands-workflow/)
* [Install intellij Community Edition](https://www.jetbrains.com/idea/download/)
* [How to upload solutions on platform](https://www.loom.com/share/a543e7af8eb74b08bda3849bbdf33805)