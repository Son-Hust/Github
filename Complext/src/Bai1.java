public class Bai1 {
    public int tong(int arr[]){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
           sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Bai1 ex =new Bai1();
        int ketqua=ex.tong(new int[]{1,2,3,4,5,6});
        System.out.println(ketqua);
    }
}
