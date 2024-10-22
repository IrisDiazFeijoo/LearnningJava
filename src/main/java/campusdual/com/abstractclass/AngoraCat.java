package campusdual.com.abstractclass;

public class AngoraCat extends Cat{
    public AngoraCat(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(("Meow! (in Angora dialect)"));
    }

    @Override
    public void climbing() {
        System.out.println("Soo cute *_*");
    }
}

