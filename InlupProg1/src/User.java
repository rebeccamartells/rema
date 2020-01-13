public class User {

    private Dog[] ownedDogs = new Dog[0];

    private String name;
    private String dog;

    public User(String name) {
        this.name = name;
    }

    public void addDog(Dog dog) {
        increaseArray();
        ownedDogs[ownedDogs.length - 1] = dog;

    }

    public void increaseArray() {

        Dog[] tempArray = new Dog[ownedDogs.length + 1];
        for (int i = 0; i < ownedDogs.length; i++) {
            ownedDogs[i] = tempArray[i];
        }
        ownedDogs = tempArray;
    }

    public void getName() {
        String names = " ";
        for (int i = 0; i < ownedDogs.length; i++) {
            names += ownedDogs[i].getName();
        }
    }
    public String toString() {
        String info = name + "," + dog;
        return info;

    }
}

