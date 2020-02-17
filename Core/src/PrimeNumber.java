public class PrimeNumber {
    protected boolean checkPrime(int number){
        for (int i=2;i<=(int) Math.sqrt(number);i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    //Improve
    protected boolean checkImprove(int number){
        if(number==2) return true;
        if(number%2==0) return false;
        for (int i=3;i<=(int)Math.sqrt(number);i=i+2){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber=new PrimeNumber();
        System.out.println("So 123 co phai la so nguyen to:"+primeNumber.checkPrime(123));
        System.out.println("So 123 co phai la so nguyen to:"+primeNumber.checkImprove(123));
    }
}
