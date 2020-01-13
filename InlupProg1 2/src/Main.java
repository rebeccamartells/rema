/**
 * Rebecca Martell Söderdahl rema8538
 */

import java.util.ArrayList;
public class Main {

    private InputHandler input = new InputHandler();
    private ArrayList<Dog> dogList = new ArrayList<>();
    private ArrayList<User> userList = new ArrayList<>();

    private void printMenu() { //detta är metoden för att anropa att skriva ut menyn
        System.out.println("Hej och välkommen till hundprogrammet!");
        System.out.println("Kommando? >");
        System.out.println("Register new dog");
        System.out.println("Increase age");
        System.out.println("List dogs");
        System.out.println("Remove dog");
        System.out.println("Register new user");
        System.out.println("List users");
        System.out.println("Exit");
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.printMenu();
        main.runCommandLoop();
    }

    private void printCommand(String command) {
        System.out.println("You chose the command: " + command);

    }

    private void runCommandLoop() {
        String command = null;
        do {
            command = input.readLine("Command").toLowerCase();
            // System.out.println("Du valde kommandot: " + command );
            switch (command) {
                case "register new dog":
                    printCommand(command);
                    registerNewDog();
                    break;
                case "increase age":
                    printCommand(command);
                    increaseAge();
                    break;
                case "list dogs":
                    printCommand(command);
                    listDogs();
                    break;
                case "remove dog":
                    printCommand(command);
                    removeDog();
                    break;
                case "register new user":
                    printCommand(command);
                    registerNewUser();
                    break;
                case "list users":
                    printCommand(command);
                    listUsers();
                    break;
                case "give dog":
                    printCommand(command);
                    giveDog();
                    break;
                case "remove user":
                    printCommand(command);
                    removeUser();
                    break;
                case "exit":
                    printCommand(command);
                    System.out.println("Goodbye!");
                    break;
                default:
                    printCommand(command);
                    System.out.println("Wrong, not a command!");
                    break;
            }
        } while (!command.equalsIgnoreCase("exit"));

    }

    private void registerNewDog() {
        String name = input.readLine("Name").toLowerCase();
        String breed = input.readLine("Breed").toLowerCase();
        int age = input.readInt("Age");
        int weight = input.readInt("Weight");
        dogList.add(new Dog(name, breed, age, weight));
        System.out.println(name + " added to the register");
    }

    private void increaseAge() {
        String name = input.readLine("Enter the name of the dog:");
        if (name.equals(" ")) {
            System.out.println("you can't leave the name blank");
        }
        Dog dog = findDog(name);

        if (dog == null) {
            System.out.println("error: there is no such dog");
            return;
        } else
            dog.increaseAge();
        System.out.println(name + " is now one year older");
    }

    private void listDogs() {
        if (dogList.isEmpty()) {
            System.out.print("Error: no dogs in register");
            return;
        }
        double smallestTail = input.readDouble("Smallest tail lenght to display");
        boolean found = false;

        new DogSorter().sort(dogList);
        for (int i = 0; i < dogList.size(); i++) {
            if (dogList.get(i).getTailLength() >= smallestTail) {
                if (!found) {
                    System.out.println("The following dogs has such a large tail: ");
                }
                found = true;
                System.out.println(dogList.get(i).toString());
            }
        }
    }

    private void removeDog() {
        String name = input.readLine("Name of the dog you want to remove: ").toLowerCase();
        Dog dog = findDog(name);

        if (dog == null) {
            System.out.println("Error: no such dog");
            return;
        } else
            dogList.remove(dog);

        System.out.println(name + " is removed from the register");
    }

    private void registerNewUser() {
        String name = input.readLine("Name").toLowerCase();
        userList.add(new User(name));
        System.out.println(name + " added to the register");
    }

    private void listUsers() {
        if (userList.isEmpty()) {
            System.out.println("Error: no users in register");
            return;
        }
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i).toString());
            }
    }

    private void giveDog() {
        if (userList.isEmpty()) {
            System.out.println("Error no users is register");
        }
        String dogName = input.readLine("Enter the name of the dog");
        Dog dog = findDog(dogName);
        String ownerName= input.readLine("Enter the name of the new owner");
        User user = findUser(ownerName);

        dog.setOwner(user);
        user.addDog(dog);

        System.out.println(user + "now owns " + dog);
    }

    private void removeUser() {
        String name = input.readLine("Name of the user you want to remove: ").toLowerCase();
        User user = findUser(name);

        if (user == null) {
            System.out.println("Error: no such user");
            return;
        } else
            userList.remove(user);

        System.out.println(name + "is removed from the register");
    }

    private User findUser(String name) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equalsIgnoreCase(name)) {
                return userList.get(i);
            }
        }
        return null;
    }

    private Dog findDog(String name) {
        for (int i = 0; i < dogList.size(); i++) {
            if (dogList.get(i).getName().equalsIgnoreCase(name)) {
                return dogList.get(i);
            }
        }
        return null;
    }
}

    //inte klar
   // private void makeBid() {
      //  String userName = readName(" enter name");
      //  if (findUser(userName) == null) {
       //     System.out.println("Error!");
        //} else {
          //  String userName = readName(" enter name");
      //  }
   // }

//}





