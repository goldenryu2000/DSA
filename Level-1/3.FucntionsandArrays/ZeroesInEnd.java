public class ZeroesInEnd {
    public static void main(String[] args) {
        // move all the zeroes to the end
        // also make sure the the non-zero numbers are stably sorted
        int[] arr = { 5, 6, 0, -8, 0, 0, 9, 0, 54, 0, 0, 23, 0, 6, -9, 0, 12 };

        int l = 0;
        int h = 0;
        while (h != arr.length) {
            if (arr[h] != 0) {
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                h++;
                l++;
            } else {
                h++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
