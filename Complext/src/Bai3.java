public class Bai3 {
    public int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Bai3 ex = new Bai3();
        System.out.println(ex.max(new int[]{1, 3, 5, 2, 7, 4}));

    }
}
