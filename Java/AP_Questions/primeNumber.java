public class primeNumber{

    public static void main(String []args){
        primeNumber p = new primeNumber();
        System.out.println(p.isPrime(5));
        System.out.println(p.isPrime(69));
        System.out.println(p.isPrime(8));
        System.out.println(p.isPrime(7));
        System.out.println(p.isPrime(20));
    }

    /**
     * 
     * @param num
     * @return boolean true if prime, false if not
     */
    public boolean isPrime(int num) {
        int divider = 2;
        while(num>divider) {
            if(num % divider == 0 ) {
                return false;
            }
            return true;
        }
        return true;
    }
}