public class Bai2 {
    public int showMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Bai2 ex=new Bai2();
        System.out.println(ex.showMax(new int[]{1,3,6,2,9,4,7}));
    }
}
