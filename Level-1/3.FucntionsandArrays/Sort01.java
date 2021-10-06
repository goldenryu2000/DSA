public class Sort01 {
    // Sort 0-1 in an array (In-place)
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0 }; // 20 elements

        int z = 0; // Pointer for Zeroes in the array
        int one = 0; // Pointer for Ones in the array
        while (one < arr.length) {
            if (arr[one] == 1)
                one++;
            else if (arr[one] == 0) {
                int temp = arr[one];
                arr[one] = arr[z];
                arr[z] = temp;
                one++;
                z++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("Number of 0'sL: " + (z));
        System.out.println("Number of 1's: " + (one - z));
    }
}