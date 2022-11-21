package ProblemSolving.array;

public class Largest2Number2ndWay {

    public static void main(String[] args) {
        int[] arr = {45, 87, 90, 43, 12, 65, 87};
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The First Largest Number is "+arr[arr.length-1]);
        System.out.println("The Second Largest Number is "+arr[arr.length -2]);
    }
}
