/**
 * Rebecca Martell Söderdahl rema8538
 */

import java.util.ArrayList;

public class DogSorter {

    public static void main(String[] args) {

    }
        public static void sort (ArrayList <Dog> dogs) {

            Dog temp;
            for (int i = 0; i < dogs.size(); i++) {
                for (int j = 1; j < dogs.size() - i; j++) {
                    if (dogs.get(j - 1).getTailLength() > dogs.get(j).getTailLength()) {

                        temp = dogs.get(j - 1);
                        dogs.set(j - 1, dogs.get(j));
                        dogs.set(j, temp);

                    } else if (dogs.get(j - 1).getTailLength() == dogs.get(j).getTailLength()) {
                        String dogOne = dogs.get(j).getName();
                        String dogTwo =dogs.get(j-1).getName();
                        int compareValue = dogOne.compareTo(dogTwo);


                    if (compareValue < 0){

                    temp = dogs.get(j - 1);
                    dogs.set(j - 1, dogs.get(j));
                    dogs.set(j, temp);

                }


                    }
                }
            }
        }
    }
