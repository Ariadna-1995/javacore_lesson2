package Task_1;

public class Main {
    public static void main(String[] args) {
        BullsAndCows bullsAndCows = new BullsAndCows(5601);
        int[] myList = {6750, 7014, 4289, 4567, 2610};
        for (int i = 0; i < myList.length; i++) {

            System.out.println(bullsAndCows.compareWith(myList[i]));
        }
    }
}