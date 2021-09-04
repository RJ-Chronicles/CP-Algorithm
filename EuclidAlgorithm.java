public class EuclidAlgorithm {
    public static void main(String args[]) {
        System.out.println(binpow(20,100));
    }
    public static long binpow(long  a, long  b) {
        if(b == 0)
            return a;
        else{
           return binpow(b, a%b);
        }
    }
}