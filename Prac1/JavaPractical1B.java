
package pract_1b;

class Appliance {

    void function() {
        System.out.println("This is a general appliance function");
    }
}

// Child class
class Fan extends Appliance {

    // Method Overriding
    @Override
    void function() {
        System.out.println("Fan function: Circulating air");
    }
}

public class JavaPractical1B {

    public static void main(String[] args) {

        Appliance a = new Appliance();
        Fan f = new Fan();

        System.out.println("Parent Class Output:");
        a.function();

        System.out.println();

        System.out.println("Child Class Output:");
        f.function();
    }
}
