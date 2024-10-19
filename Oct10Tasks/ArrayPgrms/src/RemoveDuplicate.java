import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String args[]) {
        int arr[] = {4, 4, 5, 6, 6};
        int temp[] = new int[arr.length];
        Arrays.sort(arr);
        int count = 0;


        temp[count++] = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[count++] = arr[i];
            }
        }

        int uniqueArr[] = Arrays.copyOf(temp, count);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
}
