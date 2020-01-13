public class Dog {

    private static final double DASCHHUND_TAIL_LENGHT = 3.7;
    private static final double DIVIDER = 10.0;

    private String name;
    private String breed;
    private User owner;
    private int age;
    private int weight;

    public Dog (String name, String breed, int age, int weight) {
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public int increaseAge(){
        return age=age+1;
    }
    public int getWeight(){
        return weight;
    }
    public void setOwner(User owner){
        this.owner=owner;
    }
    public User getOwner(){
        return owner;
    }


    public double getTailLength() {
        double tailLength= age*weight/DIVIDER;
        if ("Tax".equalsIgnoreCase(breed) || "dachshund".equalsIgnoreCase(breed)) {
            return DASCHHUND_TAIL_LENGHT;
        }	else
            return tailLength;
    }
    public String toString() {
        String info = name + ", " + breed +", " + age +", " + weight + ", " + getTailLength();
        return info;

    }

}