public class Bat extends Mammal {
    public Bat(){
        super(300);
    }

    void fly(){
        System.out.println("The bat flys");
        energy -= 50;
        displayEnergy();
    }

    void eat(){
        System.out.println("The bat eats some humans!");
        energy += 25;
        displayEnergy();
    }

    void attack(){
        System.out.println("The bat attacks a town and loses 100 energy");
        energy -= 100;
        displayEnergy();
    }
}