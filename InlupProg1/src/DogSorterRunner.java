import java.util.ArrayList;
import java.util.Random;

public class DogSorterRunner {

    // Ändra denna konstant för att ändra hur många hundar som ska skapas
    private static final int NUMBER_OF_DOGS = 10;

    private static final Random RND = new Random();

    private static final String[] NAMES = { "Fido", "Karo", "Molly", "Bella", "Wilma", "Doris", "Sigge", "Charlie",
            "Ludde", "Bamse", "Lassie", "Ronja", "Ratata" };

    private static final String[] BREEDS = { "Labrador", "Pudel", "Golden retriever", "Tax", "Dachshund" };

    private static String getRandomValueFromArray(String[] array) {
        return array[RND.nextInt(array.length)];
    }

    private static String randomName() {
        return getRandomValueFromArray(NAMES);
    }

    private static String randomBreed() {
        return getRandomValueFromArray(BREEDS);
    }

    private static int randomNumber() {
        return RND.nextInt(10) + 1;
    }

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        for (int n = 0; n < NUMBER_OF_DOGS; n++) {
            Dog dog = new Dog(randomName(), randomBreed(), randomNumber(), randomNumber());
            dogs.add(dog);
        }

        new DogSorter().sort(dogs);

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

}