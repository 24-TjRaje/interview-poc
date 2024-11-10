package com.interview.interview_poc;

import java.math.BigInteger;

public class PrimeOps {

    public static boolean isPrime(int input) throws Exception {

        if(input<=0)
            throw new Exception("Number shouldnt be zero or negative");
        if(input==1)
            throw new Exception("1 is neither prime nor composite");
        if(input<4)
            return true;

        for(int i = 2; i<= input/2; i++)
            if(input % i == 0)
                return false;
        return true;
    }

    public static boolean isPrime2(int input) throws Exception {

        if(input<=0)
            throw new Exception("Number shouldnt be zero or negative");
        if(input==1)
            throw new Exception("1 is neither prime nor composite");
        if(input<4)
            return true;

        for( int i = 2; i <= Math.sqrt(input); i++){
            if(input%i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrimeInBuild(int input) {
        return BigInteger.valueOf(input).isProbablePrime(10);
    }
}
