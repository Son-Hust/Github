public class Fibonacci {
    //De Quy
    protected int fibonacci(int number){
        if(number==0) return 0;
        if(number>=1&&number<=2) return 1;
        return fibonacci(number-1)+fibonacci(number-2);
    }
    //Thong thuong
    protected int fibonacciNormal(int number){
        if(number==0) return 0;
        if(number>=1&&number<=2) return 1;
        int numb1=1;
        int numb2=1;
        int numbn = 0;
        for (int i=3;i<=number;i++){
            numbn=numb1+numb2;
            numb1=numb2;
            numb2=numbn;
        }
        return numbn;
    }
    //Tong fibonacci tu 1-n
    protected long sumFib(int number){
        int sum=0;
        for (int i=0;i<=number;i++){
            sum=sum+fibonacci(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        long t=fibonacci.fibonacci(5);
        long a=fibonacci.fibonacciNormal(5);
        System.out.println("So fibonacci thu 5 la:"+t);
        System.out.println("So thu 5:"+a);
        System.out.println("Tong:"+fibonacci.sumFib(5));
    }
}
