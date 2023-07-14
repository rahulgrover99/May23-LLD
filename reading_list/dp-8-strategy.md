## Strategy design pattern

> The strategy pattern (also known as the policy pattern) is a software design pattern that enables an algorithm's behavior to be selected at runtime. The strategy pattern encapsulates alternative algorithms (or strategies) for a specific task and supports their interchangeable use. The strategy pattern lets the algorithm vary independently from clients that use it.

Today we are building a navigation system for a car. The navigation system should be able to calculate the shortest route between two points and tell the driver how to get there.
We start with a simple implementation that only supports driving on roads and hence we design a simple `RoadNavigation` class that calculates the shortest route between two points on a road.

```java
public class Navigator {
    public void navigate(Point from, Point to) {
        ...
    }
}
```

Our application is a hit and we get a lot of requests to support other types of navigation such as using a bike or walking. In order to support various types of navigation we introduce a new `ModeType` enum that defines the different types of navigation.

```java
public class Navigator {
    public void navigate(Point from, Point to, ModeType mode){
        if (mode == ModeType.ROAD) {
            ...
        } else if (mode == ModeType.BIKE) {
            ...
        } else if (mode == ModeType.WALK) {
            ...
        }
    }
}
```

This works but it is not very flexible. If we want to add a new type of navigation we have to modify the `navigate` method. This is an example of a violation of the open-closed principle. Similarly, the method has multiple reasons to change, and we have to test it for all the different types of navigation.

We could create an interface and have a separate class for each type of navigation. This would solve the problem of having to modify the `navigate` method, but inheritance is static and we cannot change the behavior of the `navigate` method at runtime. Also code duplication is a problem.
This is where the strategy pattern comes in. The strategy pattern allows us to encapsulate the different types of navigation in separate classes and select the appropriate one at runtime. The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called strategies. The original class, called context, must have a field for storing a reference to one of the strategies. The context delegates the work to a linked strategy object instead of executing it on its own.

### Implementation

1. `Strategy` interface - defines an algorithm interface common to all supported versions.

```java
public interface NavigationStrategy {
    void navigate(Point from, Point to);
}
```

2. `Concrete Strategy` classes - implement the algorithms using the Strategy interface.

```java
public class RoadNavigation implements NavigationStrategy {
    @Override
    public void navigate(Point from, Point to) {
        ...
    }
}
```

3. `Context` class - maintains a reference to a Strategy object and defines an interface that lets the strategy access its data.

```java
public class Navigator {
    private NavigationStrategy strategy;

    public Navigator(NavigationStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(Point from, Point to) {
        strategy.navigate(from, to);
    }
}
```

4. `Client` - creates and configures the context and the strategy objects.

```java
public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new RoadNavigation());
        navigator.navigate(new Point(0, 0), new Point(10, 10));
    }
}
```

To create a strategy object we can also use a factory method.

### Recap
* The strategy pattern encapsulates alternative algorithms (or strategies) for a specific task and supports their interchangeable use.
* Implementing it in place violates the open-closed principle and makes the code harder to maintain.
* Inheritance is static, and we cannot change the behavior of the system at runtime.
* To use the strategy pattern we create a strategy interface and a set of classes that implement it.
* The context class maintains a reference to a strategy object and delegates the work to it.
