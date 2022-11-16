package problem_solving.array;

public class Largest2Number {

    public static void main(String[] args) {
        int[] arr = {45, 87, 90, 43, 12, 65, 87};
        int fistLarge = arr[0];
        int secondLarge = arr[1];

        if (fistLarge < secondLarge) {
            int temp = fistLarge;
            fistLarge = secondLarge;
            secondLarge = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > fistLarge) {
                secondLarge = fistLarge;
                fistLarge = arr[i];
            } else if (arr[i] > secondLarge || arr[i] != fistLarge) {
                secondLarge = arr[i];
            }
        }
        System.out.println("The First Largest Number is "+fistLarge);
        System.out.println("The Second Largest Number is "+secondLarge);
    }
}
