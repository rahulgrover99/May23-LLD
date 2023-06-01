# Assignment - 1

This assignment is obviously not graded, and it's for your own learning. Try to attempt it with a relaxed and a problem solving mindset. I have intentially left some gaps for you to figure out things and find out solutions. Feel free to use whatsapp group as a channel of discussion. 

## Part - 1 (Github)
> Note: Only attempt part 1 if you are absolute beginner.
1. [Create a new repository](https://docs.github.com/en/get-started/quickstart/create-a-repo?tool=webui)
1. [Clone your repository](https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository?tool=webui)
1. Create a `your-name.md` file and add your name to it. 
1. Commit and push your changes using CLI (you might face some issues in the last step - figure out yourself how to unblock yourself.)

## Part - 2 (Intellij)
> Note: Only attempt part 1 if you are absolute beginner.
1. Create a new project in Intellij
1. Design a class ‘Complex ‘with data members for real and imaginary part. Provide default and Parameterized constructors. Write a program to perform arithmetic operations of two complex numbers.
1. Run your code in debug mode and observe things around. 
1. Figure out how to initialize a repository as git repository and then upload it on Github.

## Part - 3 (Github + PRs)
1. Fork this repository, clone your personal version of repository locally. 
1. Add a `your-name.md` file to `contrib` directory with contents as your full name and your batch name, also a link to the github repository if you created one. 
1. Commit and push. 
1. Create and send a Pull Request to this repository. 
1. Sit and wait for me to approve it and get merged. 
1. Try to understand what you just did, and how it might help write code in real world. 
1. Ofcourse, if you find some miskate, please feel free to send a PR to correct it. 

## Part - 4 (Inheritance, Polymorphism and Github)
1. Fork and clone repository. (if not done)
1. In the solutions directory, create a new folder with your github username.
1. Use that folder as the package to write code for the problem mentioned below.
1. Design a base class `Shape` with two double type values - `height` and `width`, with a parametrized constructor to take in values. 
1. Add a method `compute_area()` for calculating area of shape -- by default it returns 0. 
1. Create two child classes: `Triangle` and `Rectangle`. Override `compute_area()` and redefine this function in the derived class to suit their requirements. 
1. Finally write a program that accepts if user would like to enter dimensions for Rectangle or Triangle. 
    ```java
    Shape shape;
    if (input == "Triangle") {
        shape = new Triangle(h, w);
    } else {
        shape = new Rectangle(h, w);
    }

    printArea(shape);
    ```
1. printArea takes a `Shape` as input and prints out area.
1. That's it, commit, push and PR!


