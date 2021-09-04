public class primaliryTest_TestForPrimeNumber {
    public static void main(String args[]) {
        boolean test = primeTest(12);
        System.out.println(test);
    }
    
    public static boolean primeTest(int n){
        for(int i = 2; i*i < n; i++){
            if(n %i ==0)
                return false;
        }
        return true;
    }
}