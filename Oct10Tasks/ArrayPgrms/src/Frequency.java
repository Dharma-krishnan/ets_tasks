public class Frequency {
    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 31, 13, 3};
        int n = arr.length;
        int frq[] = new int[n];
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            frq[i] = count;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.println("Element: " + arr[i] + " Frequency: " + frq[i]);
            }
        }
    }
}
