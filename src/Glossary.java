import java.util.ArrayList;

public class Glossary {

    public void questions() {

        ArrayList<String[]> qAndA = new ArrayList<String[]>();
        String[] glossary = {
                /*
                 * "Q) Is Java platform independent?",
                 * "A) Yes, Java runs the same code on different platforms.",
                 * 
                 * "Q) What all memory areas are allocated by JVM?",
                 * "A) Class, Heap, Stack, Program Counter Register, and Native Method Stack.",
                 * 
                 * "Q) Java vs. C ++?",
                 * """A) Platform dependency – C++ is platform dependent while java is platform
                 * independent,
                 * No goto support – Java doesn’t support goto statement while C++ does.
                 * Multiple inheritance – C++ supports multiple inheritance while java does not.
                 * Multithreading – C++ does not have in-build thread support, on the other hand
                 * java supports multithreading
                 * Virtual keyword – C++ has virtual keyword, it determines if a member function
                 * of a class can be overridden in its child class. In java there is no concept
                 * of virtual keyword.""",
                 * 
                 * "Q) Explain public static void main(String args[])",
                 * "A) It is the method called at the beginning of a program to let the virtual
                 * machine
                 * know where and how to begin interpreting code.
                 * public grants access,
                 * static describes the method as not being a unique instance,
                 * void tells that the method will not have a return once finished,
                 * main() is the name of the method,
                 * String args[] places all of the following code into a string array.",
                 * 
                 * "Q) What is javac ?"
                 * "A) javac is the Java compiler. It translates the completed Java program into byte code, creating the .class file."
                 * 
                 * "Q) What is class?"
                 * "A) A class is a template used to create and define objects."
                 * 
                 * "Q) What is the base class of all classes?"
                 * "A) The base class of all classes is called the superclass or the parent class."
                 * 
                 * "Q) What is an Array?"
                 * "A) An array is a container object that holds a fixed number of objects of a single type."
                 * 
                 * "Q) Four main principles of OOPS Concepts?"
                 * "A) Encapsulation, data abstraction, polymorphism, and inheritance.
                 * Also called the four pillars of Object Oriented Programming."
                 * 
                 * "Q)THIS keyword?"
                 * "A) THIS is a context sensitive variable that is used to refer to the current object."
                 * 
                 * "Q) Inheritance"
                 * "A) Inheritance in Java is the method to create a hierarchy between classes
                 * by inheriting from other classes.
                 * Inheritance lets us inherit attributes and methods from another class."
                 * 
                 * "Q) Polymorphism"
                 * "A) Polymorphism means "many
                 * forms", and it occurs when we have many classes that are related to each other by inheritance."
                 * 
                 * "Q) Encapsulation"
                 * "A) Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit."
                 * 
                 * "Q) Abstraction "
                 * "A)in Java is a process of hiding the implementation details from the user and showing only the functionality to the user."
                 * 
                 * "Q) Explain super keyword in Java?"
                 * "A) The super keyword is used to call on variables from the objects
                 * superclass.
                 * This can be used to override the objects variables and methods or to utilize
                 * an implementation from the superclass."
                 * 
                 * "Q) What is JUnit?"
                 * "A)It used for unit testing."
                 * 
                 * "Q) What is unit testing?"
                 * "A) Testing of the smallest functional units of code."
                 * 
                 * "Q) TDD"
                 * "A) Test Driven Development. Design the tests and then write the code to pass the tests."
                 * 
                 * "Q) What is the difference between 'While' and 'Do While' loops?"
                 * "A) todo- look this up"
                 * 
                 * "Q) What are the size of Different Data types in Java?"
                 * "A) boolean 1 bit range 0 to 1 stores True or false
                 * byte – 8 bit (1 byte) range -128 to 127
                 * short – 16 bit (2 bytes) range -32,768 to 32,767
                 * char – 16 bit (2 bytes) Unicode range 0 to 65535
                 * int – 32 bit (4 bytes) (whole number) range -2,147,483,648 to 2,147,483,647
                 * float – 32 bit (4 bytes) (real number) 6 to 7 decimal digits
                 * long – 64 bit (8 bytes) (Single precision) -9,223,372,036,854,775,808 to
                 * 9,223,372,036,854,775,807
                 * double – 64 bit (8 bytes) (double precision) 15 decimal digits"
                 * 
                 * "Q) What is Type casting in Java?"
                 * "A) When we assign a value of one data type to the different data type"
                 * 
                 * "Q)	What is a constructor in Java?"
                 * "A) Constructor is used for creating an instance of a class,
                 * they are invoked when an instance of class gets created.
                 * Constructor name and class name should be same and it doesn’t have a return
                 * type."
                 * 
                 * "Q) Can THIS keyword be assigned null value?"
                 * "A) No, this keyword cannot have null values assigned to it."
                 * 
                 * "Q) What is finalize() method in java?"
                 * "A) Called by the garbage collector on an object when garbage
                 * collection determines that there are no more references to the object.
                 * A subclass overrides the finalize method to dispose of system resources or to
                 * perform other cleanup."
                 * 
                 * "Q) What is Garbage collection in java?"
                 * "A) Since objects are dynamically allocated by using the new operator,
                 * java handles the de-allocation of the memory automatically,
                 * when no references to an object exist for a long time."
                 * 
                 * "Q) How many times does the garbage collector calls the finalize() method for an object?"
                 * "A) The garbage collector only calls the finalize() method once for each object."
                 * 
                 * "Q) What are two different ways to call garbage collector?"
                 * "A) the System.gc() and Runtime.getRuntime().gc() methods will request garbage collection, but not necessarily run it right away."
                 * 
                 * "Q) Can the Garbage Collection be forced by any means?"
                 * "A) You can call the finalize() method to force garbage collection."
                 * 
                 * "Q) What is an exception?"
                 * "A) An unexpected event that happens while a program is running."
                 * 
                 * "Q) What is the difference between Error and Exception?"
                 * "A)An exception is something that could be accounted for with a revision of
                 * the program.
                 * An error is something that is beyond the ability of the code to account for."
                 */

        };

    }
}
