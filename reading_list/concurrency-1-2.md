# Concurrency Introduction

- [Concurrency Introduction](#concurrency-introduction)
  - [Processes](#processes)
    - [Types of Processes](#types-of-processes)
  - [Scheduling Algorithms](#scheduling-algorithms)
    - [Why do we need Scheduling Algorithms?](#why-do-we-need-scheduling-algorithms)
    - [First Come First Serve (FCFS)](#first-come-first-serve-fcfs)
      - [Advantages](#advantages)
      - [Disadvantages](#disadvantages)
    - [Round Robin](#round-robin)
      - [Algorithm](#algorithm)
      - [Example](#example)
      - [Advantages](#advantages)
      - [Disadvantages](#disadvantages)
  - [Threads](#threads)
    - [Thread vs Process](#thread-vs-process)
    - [Concurrency vs Parallelism](#concurrency-vs-parallelism)
    - [Using threads in Java](#using-threads-in-java)
      - [Number printer](#number-printer)
  - [Assignment](#assignment)
  - [References](#references)


## Processes

We install a lot of different applications on are system. An application is a program that we can run on our system. For instance, we can run a web browser, a text editor, etc. Each of these applications is a program. However, each of these applications is a different program. When we install an application, it is installed as a file on our system. When we run the application, the operating system loads the application into memory and runs it. When we run an application, the operating system creates a process for the application.

A process is an instance of a program. A process is a program that is running on our system. When we run an application, the operating system creates a process for the application. When we run multiple applications, the operating system creates multiple processes for the applications. Each process has its own memory space. A process can access the memory of other processes. However, a process cannot access the memory of another process.

When the process is created by the operating system it creates a data structure to store the information of that process. This is known as Process Control Block (PCB). Process Control block (PCB) is a data structure that stores information of a process. 

![Process Control Block](https://scaler.com/topics/images/pcb-in-os.webp)

It's the job of the operating system to assign a CPU to a process as the process doesn't need a CPU all the time. Let's take an example of the input/output process, they are only used by the CPU when triggered.

The role of the process control block arises as an identification card for each process. The Operating System doesn't know which process is which, until Operating System refers through the PCB of every process.

The process control block contains many attributes such as process ID, process state, process priority, accounting information, program counter, CPU registers`, etc for each process.

![Process Control Block](https://scaler.com/topics/images/structure-of-process-control-block.webp)

### Types of Processes

A process can be classified into the following types:
* `I/O bound process` - An I/O bound process spends most of its time waiting for I/O operations to complete. For instance, a process that reads data from a file spends most of its time waiting for the data to be read from the file. An I/O bound process spends most of its time waiting for I/O operations to complete. For instance, a process that reads data from a file spends most of its time waiting for the data to be read from the file.
* `CPU bound process` - A CPU bound process spends most of its time executing instructions. For instance, a process that performs a lot of computations spends most of its time executing instructions. A CPU bound process spends most of its time executing instructions. For instance, a process that performs a lot of computations spends most of its time executing instructions.

## Scheduling Algorithms

### Why do we need Scheduling Algorithms?

A process to complete its execution needs both CPU time and I/O time. In a multiprogramming system, there can be one process using CPU while another is waiting for I/O whereas, in a uni programming system, time spent waiting for I/O is completely wasted as CPU is idle at this time. The multiprogramming can be achieved by the use of process scheduling.

The objectives of a scheduling algorithm are as follows:

* Maximize the CPU utilization, meaning that keep the CPU as busy as possible.
* Fair allocation of CPU time to every process
* Maximize the Throughput
* Minimize the turnaround time
* Minimize the waiting time
* Minimize the response time

To achieve these objectives, we need to have a scheduling algorithm. A scheduling algorithm is an algorithm that decides which process to run next. To demonstrate the various scheduling algorithms, we will use the following processes:

| Process | Arrival Time | Burst Time |
| :------ | :----------- | :--------- |
| P1      | 2            | 6          |
| P2      | 1            | 8          |
| P3      | 0            | 3          |
| P4      | 4            | 4          |


### First Come First Serve (FCFS)

First Come First Serve (FCFS) is a non-preemptive scheduling algorithm. In this algorithm, the process that comes first is executed first. If two processes arrive at the same time, then the process that comes first in the ready queue is executed first. This can be decided on the basis of the process ID or the burst time.

Let us take the example of the above processes. The process P3 arrives first, so it is executed first. The process P2 arrives next, so it is executed next. The process P1 arrives next, so it is executed next. The process P4 arrives last, so it is executed last.

**At time t=0**

At time t=0, the process P3 arrives. So, it is executed first. The process P3 is executed for 3 time units. The process P3 is completed at time t=3.

![First Come First Serve](https://scaler.com/topics/images/gantt-chart-in-fcfs-scheduling.webp)

**At time t=1**

At time t=1, the process P2 arrives, but it cannot be executed as the process P3 is still executing. So, the process P2 is added to the ready queue.    

**At time t=2**

At time t=2, the process P1 arrives, but it cannot be executed as the process P3 is still executing. So, the process P1 is added to the ready queue. Now, there are two processes in the ready queue, P2 and P1.

**At time t=3**

Process P3 is completed at time t=3. So, the process P2 is executed next. The process P2 is executed for 8 time units. The process P2 is completed at time t=11.

![First Come First Serve](https://scaler.com/topics/images/gantt-chart-4-is-fcfs-scheduling.webp)

**At time t=4**

At time t=4, the process P4 arrives, but it cannot be executed as the process P2 is still executing. So, the process P4 is added to the ready queue. Now, there are two processes in the ready queue, P1, and P4.

**At time t=11**

Process P2 is completed at time t=11. So, the process P1 is executed next. The process P1 is executed for 6 time units. The process P1 is completed at time t=17.

**At time t=17**

Process P1 is completed at time t=17. So, the process P4 is executed next. The process P4 is executed for 4 time units. The process P4 is completed at time t=21.

**At time t=21**

Process P4 is completed at time t=21. So, there are no more processes to execute.

![First Come First Serve](https://scaler.com/topics/images/gantt-chart-6-in-fcfs-scheduling.webp)

#### Advantages
* Involves no complex logic and just picks processes from the ready queue one by one.
* Easy to implement and understand.
* Every process will eventually get a chance to run so no starvation occurs.

#### Disadvantages
* Waiting time for processes with less execution time is often very long.
* It favors CPU-bound processes then I/O processes.
* Leads to [convoy effect](https://www.codingninjas.com/codestudio/library/convoy-effect#:~:text=First%20Serve%20Algorithm-,What%20is%20the%20Convoy%20Effect%3F,the%20current%20one%20is%20finished.).
* Causes lower device and CPU utilization.
* Poor in performance as the average wait time is high.

### Round Robin

> Round-robin (RR) is one of the algorithms employed by process and network schedulers in computing. As the term is generally used, time slices (also known as time quanta) are assigned to each process in equal portions and in circular order, handling all processes without priority (also known as cyclic executive). Round-robin scheduling is simple, easy to implement, and starvation-free. Round-robin scheduling can be applied to other scheduling problems, such as data packet scheduling in computer networks.

One of the major problems with SRTF is that it can lead to starvation. This is because a process with a long burst time can be starved of CPU time. Often the requirement is to have a scheduling algorithm that is fair to all processes so that all processes are progressing and they have lower waiting times. This is where Round Robin scheduling comes in.

Round Robin scheduling is a preemptive scheduling algorithm. This means that the scheduler can preempt a process and give the CPU to another process. 

This is done after a time slice. The time slice is the amount of time a process is allowed to run before it is preempted. The time slice is usually a small value like 10ms. This means that a process is given 10ms of CPU time and then it is preempted and another process is given 10ms of CPU time. This is repeated until all processes have been given CPU time. This is called Round Robin scheduling because the CPU is given to each process in a round robin fashion.

#### Algorithm

* If no process is running, pick the next process from the queue and run it.
* The process runs either till the minimum of the time slice or the burst time.
    `RunnningTime = min(timeSlice, burstTime)`
* If the process is not finished, put it back in the queue.
* Repeat the above steps till the queue is empty.

![Round Robin Scheduling](https://scaler.com/topics/images/working-of-round-robin-scheduling-in-os.webp)

#### Example

Let us consider the following processes with their arrival time and burst time.

| Process | Arrival Time | Burst Time |
| ------- | ------------ | ---------- |
| P1      | 0            | 5          |
| P2      | 1            | 6          |
| P3      | 2            | 3          |
| P4      | 3            | 1          |
| P5      | 4            | 5          |
| P6      | 6            | 4          |

Let us consider our time slice to be 4 units.

**At t=0**

* P1 arrives and is added to the queue.
* Since no process is running, P1 is picked and is given 4 units of CPU time.

**At t=1**
* P2 arrives and is added to the queue.
* P1 is still running and has 3 unit of CPU time left.

**At t=2**
* P3 arrives and is added to the queue.
* P1 is still running and has 2 unit of CPU time left.

**At t=3**
* P4 arrives and is added to the queue.
* P1 is still running and has 1 unit of CPU time left.

The queue now looks like this:
| Process | Remaining Time |
| ------- | -------------- |
| P2      | 6              |
| P3      | 3              |
| P4      | 1              |

**At t=4**
* P5 arrives and is added to the queue.
* The time slice for P1 is over.
* P2 is picked and is given 4 units of CPU time.
* P1 is added to the queue with 1 unit of CPU time left.

The queue now looks like this:
| Process | Remaining Time |
| ------- | -------------- |
| P3      | 3              |
| P4      | 1              |
| P5      | 5              |
| P1      | 1              |

**At t=6**
* P6 arrives and is added to the queue.
* P2 is still running and has 2 units of CPU time left.

**At t=8**
* The time slice for P2 is over.
* P3 is picked and is given 4 units of CPU time.
* P2 is added to the queue with 2 units of CPU time left.

The queue now looks like this:
| Process | Remaining Time |
| ------- | -------------- |
| P4      | 1              |
| P5      | 5              |
| P1      | 1              |
| P6      | 4              |
| P2      | 2              |

**At t=11**
* P3 has finished running.
* P4 is picked and has 1 unit of CPU time left.

The queue now looks like this:

| Process | Remaining Time |
| ------- | -------------- |
| P5      | 5              |
| P1      | 1              |
| P6      | 4              |
| P2      | 2              |

**At t=12**
* P4 has finished running.
* P5 is picked and is given 4 units of CPU time.
  
The queue now looks like this:
| Process | Remaining Time |
| ------- | -------------- |
| P1      | 1              |
| P6      | 4              |
| P2      | 2              |

**At t=16**
* The time slice for P5 is over.
* P1 is picked and has 1 unit of CPU time left.
* P5 is added to the queue with 1 unit of CPU time left.

**At t=17**
* P1 has finished running.
* P6 is picked and is given 4 units of CPU time.

The queue now looks like this:
| Process | Remaining Time |
| ------- | -------------- |
| P2      | 2              |
| P5      | 1              |

**At t=21**
* P6 has finished running.
* P2 is picked up and has 2 units of CPU time left.

**At t=23**
* P2 has finished running.
* P5 is picked up and has 1 unit of CPU time left.

**At t=24**
* P5 has finished running.
* No more processes are left in the queue.

![Round Robin Scheduling](https://scaler.com/topics/images/example-of-round-robin-scheduling-algorithm.webp)

#### Advantages
* This round robin algorithm offers starvation-free execution of processes.
* Each process gets equal priority and fair allocation of CPU.
* It is easily implementable on the system because round robin scheduling in os doesn’t depend upon burst time.

#### Disadvantages
* The waiting time and response time are higher due to the short time slot.
* Lower time quantum results in higher context switching.
* We cannot set any special priority for the processes.


---

## Threads 

> A thread is a lightweight process. It is a unit of execution within a process. A process can have multiple threads. Each thread has its own program counter, stack, and registers. Threads share the same address space. This means that all threads in a process can access the same memory. This is different from processes where each process has its own address space.

Often, a process needs to perform multiple tasks at the same time. For example, a web browser needs to download a file and display a web page at the same time. Creating a new process for each task is expensive. This is because creating a new process requires a lot of resources.

Threads are used to solve this problem. Threads are used to perform multiple tasks within a process. This is done by sharing the same address space. This means that all threads in a process can access the same memory. This is different from processes where each process has its own address space.

Thread is a sequential flow of tasks within a process. Threads in OS can be of the same or different types. Threads are used to increase the performance of the applications.
Each thread has its own program counter, stack, and set of registers. But the threads of a single process might share the same code and data/file. Threads are also termed as lightweight processes as they share common resources.

![Threads](https://scaler.com/topics/images/what-is-thread-in-os.webp)


### Thread vs Process
| Process                                                                          | Thread                                                                                                     |
| -------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| Processes use more resources and hence they are termed as heavyweight processes. | Threads share resources and hence they are termed as lightweight processes.                                |
| Creation and termination times of processes are slower.                          | Creation and termination times of threads are faster compared to processes.                                |
| Processes have their own code and data/file.                                     | Threads share code and data/file within a process.                                                         |
| Communication between processes is slower.                                       | Communication between threads is faster.                                                                   |
| Context Switching in processes is slower.                                        | Context switching in threads is faster.                                                                    |
| Processes are independent of each other.                                         | Threads, on the other hand, are interdependent. (i.e they can read, write or change another thread’s data) |
| Eg: Opening two different browsers.                                              | Eg: Opening two tabs in the same browser.                                                                  |

![Threads vs Process](https://scaler.com/topics/images/process-vs-thread.webp)

### Concurrency vs Parallelism

* Concurrent - At the same time, but not necessarily at the same instant. It is possible for multiple threads to be at different stages of execution at the same time but not being processed together. A single core CPU can only execute one thread at a time. But it can switch between threads very quickly. This is called context switching. This is how concurrency is achieved. A single core CPU can have concurrency but not parallelism.
* Parallel - At the same time and at the same instant. It is possible for multiple threads to be at different stages of execution at the same time and being processed together. A single core CPU cannot achieve parallelism. It can only achieve concurrency. A multi-core CPU can achieve both concurrency and parallelism.


### Using threads in Java


In Java, we can create a thread by extending the Thread class or by implementing the Runnable interface. The Thread class is a subclass of the Object class. It implements the Runnable interface. The Runnable interface has a single method called run(). This method is called when the thread is started.

```java
class NewThread implements Runnable {
    @Override
    public void run() {
        // Code to be executed by the thread
    }
}
```

We can create a new thread by creating an object of the NewThread class and passing it to the Thread class constructor. The Thread class constructor takes a Runnable object as an argument. This Runnable object is the thread that we want to create.

```java
NewThread newThread = new NewThread();
Thread thread = new Thread(newThread);
```

To run the thread, we call the start() method on the Thread object. This method calls the run() method of the Runnable object. The run() method is executed by the thread.

```java
thread.start();
```

#### Number printer

**Problem Statement**
* Create a new thread that prints the numbers from 1 to 10.

**Solution**
```java
class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();
        Thread thread = new Thread(numberPrinter);
        thread.start();
    }
}
```

**Problem Statement 2**
* Print the numbers from 1 to 10 where each number is printed by a different thread.

***Solution***
```java
class NumberPrinter implements Runnable {
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
```

## Assignment
* Create a count class that has a count variable.
* Create two different classes `Adder` and `Subtractor`.
* Accept a count object in the constructor of both the classes.
* In `Adder`, iterate from 1 to 100 and increment the count variable by 1 on each iteration.
* In `Subtractor`, iterate from 1 to 100 and decrement the count variable by 1 on each iteration.
* Print the final value of the count variable.
* What would the ideal value of the count variable be?
* What is the actual value of the count variable?
* Try to add some delay in the `Adder` and `Subtractor` classes using inspiration from the code below. What is the value of the count variable now?

```java
try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
    e.printStackTrace();
}
```

## References
* [What is an OS?](https://www.scaler.com/topics/operating-system/what-is-operating-system/)
* [Scheduling Algorithms](https://www.scaler.com/topics/operating-system/scheduling-algorithms-in-os/)
* [Web Browser architecture](https://levelup.gitconnected.com/how-web-browsers-use-processes-and-threads-9f8f8fa23371)