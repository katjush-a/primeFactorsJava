import java.util.*;

public class PrimeFactor {

    public ArrayList getPrimes(int num){
        ArrayList factors = new ArrayList();

        if (num < 0) {
            num *= -1;
            factors.add(-1);
        }

        for(int i = 2;i <= num;i++) {
            while(num % i == 0){
                factors.add(i);
                num /= i;
            }
        }
        return factors;
    }

    public static void main(String args[]){
        //long start = System.currentTimeMillis();
        PrimeFactor factorGen = new PrimeFactor();
        System.out.println(args[0]);
        System.out.println(factorGen.getPrimes(Integer.parseInt(args[0])));
        //long end = System.currentTimeMillis();
        //System.out.println("Finished in: " + (end - start) + " millisecond(s)");
    }
}
