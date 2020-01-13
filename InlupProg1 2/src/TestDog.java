public class TestDog {
    public static void main (String [] args) {

        Dog Dogi = new Dog ("Dogi", "samojed", 12, 5);

        System.out.println(Dogi.getName());
        System.out.println(Dogi.getBreed());
        System.out.println(Dogi.getAge());
        System.out.println(Dogi.getWeight());
        System.out.println(Dogi.getTailLength());
        System.out.println(Dogi.toString());

    }
}
