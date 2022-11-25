
import java.util.Scanner;

class Dog {
    Scanner scan = new Scanner(System.in);
    int age = 0;
    double weight = 0;
    String name = "";
    String furColor = "";
    String breed = "";

    public void bark() {
        System.out.println("Woof! Woof!");
    }
    public void rename() {
        System.out.print(name + " isn't a good name. What should they be renamed to: ");
        String newName = scan.next();
        name = newName;
    }
    public void eat() {
        System.out.print(name + " is hungry, how much should he eat: ");
        Double foodAmt = scan.nextDouble();
        weight += foodAmt;
    }
}

public class Lab12B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog myDog = new Dog();

        System.out.println("You are about to create a dog");
        System.out.print("How old is the dog: ");
        myDog.age = scan.nextInt();
        System.out.print("How much does the dog weigh: ");
        myDog.weight = scan.nextDouble();
        System.out.print("What is the dog's name: ");
        myDog.name = scan.next();
        System.out.print("What color is the dog: ");
        myDog.furColor = scan.next();
        System.out.print("What breed is the dog: ");
        myDog.breed = scan.next();
        System.out.println(myDog.name + " is a " + myDog.age + " year old " + myDog.furColor + " " + myDog.breed + " that weighs " + myDog.weight + " lbs.\n");

        myDog.bark();
        myDog.eat();
        myDog.rename();

        System.out.print("\n" + myDog.name + " is a " + myDog.age + " year old " + myDog.furColor + " " + myDog.breed + " that weight " + myDog.weight + " lbs.");

    }

}