package Task_2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myList = {2, 2, 0, 0, 2, 3, 8, 0, 0, 0};
        printResult(myList, "Имеются ли два соседних элемента, с нулевым значением",
                HasZeroNeighbors.hasZeroNeighbors(myList));
    }
    public static void printResult(int[] nums, String label, Object result) {
        System.out.print(Arrays.toString(nums) + " ");
        System.out.println(label + ": " + result);
    }
}
