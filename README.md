# S1.06 - Java Generics 📦

## 🧾 Task Objectives

- Understand and apply the concept of **Generics** in Java.
- Create reusable and type-safe code through **generic classes**, **interfaces**, and **methods**.
- Practice different levels of generic usage: basic, bounded types, wildcards, and generic methods.
- Use Git to manage and track your code in a remote repository.

  ---

## 📚 Documentation

- [Oracle Java Generics Documentation](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
- [Baeldung - Introduction to Generics in Java](https://www.baeldung.com/java-generics)

  ---

## 🧪 Proposed Exercises

## 🔹 Level 1
<details>

### Exercise 1

Create a class named `NoGenericMethods` that stores three arguments of the same type, along with methods to store and retrieve these objects, and a constructor to initialize all three.
Verify that the arguments can be passed in any order when calling the constructor.

  

### Exercise 2

Create a class named Person with the attributes: name, surname, and age. Then, create a class named GenericMethods with a generic method that accepts three arguments of generic types.
This method should only print the received arguments to the screen.
In the main() method of the main class, call the generic method using different types of parameters.

Example: an object of the Person class, a String, and a primitive type.

This way, you will confirm that it is possible to pass any type of parameter and in any order.

</details>

### 🔹 Level2

<details>

### Exercise 1

Modify the previous exercise so that one of the arguments of the generic method is **not generic**.

### Exercise 2

Modify the previous section so that the arguments of the generic method become a **list of variable arguments (varargs)**.
  
</details>

### 🔹 Level 3

<details>

To complete this exercise, you need an interface named Phone and three classes: **Smartphone**, **Generic**, and **Main**.

The _Phone_ interface must have a method called `call()`. The Smartphone class must implement Phone, and in addition to the `call()` method, it must also have a method called `takePhoto()`.

The Generic class must have two generic methods. The first one should accept a type argument bounded by the _Phone_ interface, and the second should accept an argument bounded by the **Smartphone** class.
From these two methods, call the relevant methods from Phone and **Smartphone**.

In the `main()` method of the Main class, pass a **Smartphone** object to both generic methods in the Generic class.

Can the method in Generic that is bounded by the _Phone_ interface call the `takePhoto()` method?

  
</details>

---

## 💻 Technologies Used

- Java 17 or higher
- IntelliJ IDEA / Eclipse / VS Code with Java support
- Git & GitHub
- Maven (optional, for project setup and dependencies)

---

## 🤖 Requirements

- Java SDK 17 or higher
- A code editor or IDE (IntelliJ recommended)
- Git installed in your terminal


## 🚀 Installation

1. Clone the repository
    
    ```bash
      git clone https://github.com/your-username/S1.05-Generics.git
      
2. Navigate to the project directory:

   ```bash
   cd S1.05-Generics

4. Open the project in your IDE.
5. Locate the `Main.java` or the file for each exercise.
6. Run the main method to test the output.


## 🤝 Contributions

1. Fork this repository
2. Create a new feature branch:
    ```bash
    git checkout -b feature/YourFeatureName

3. Make your changes and commit:
    ```bash
   git commit -m "feat: added new test case for XYZ"

4. Push the branch:
    ```bash
    git push origin feature/YourFeatureName

5. Open a Pull Request


Feel free to fork this repository and submit pull requests to improve or expand the exercises.

## 💌 Contact

For any questions or feedback, open an _Issue_ or reach out via [GitHub](https://github.com/your-username/S1.05-Generics.git)

