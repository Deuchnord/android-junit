package com.tanghe.test;

import java.lang.Math;

/**
 * Created by tanghe on 14/10/16.
 */

public class Operation {

    public static float addition(float n1, float n2)
    {
        return n1 + n2;
    }

    public static float soustraction(float n1, float n2)
    {
        return n1 - n2;
    }

    public static float multiplication(float n1, float n2)
    {
        return n1 * n2;
    }

    public static float division(float n1, float n2) throws DivideByZeroException
    {
        
        if(n2 == 0)
            throw new DivideByZeroException();
            
        return n1 / n2;
    }

    public static double carre(double n)
    {
        return n * n;
    }

    public static double racineCarree(double n) throws NegativeNumberException
    {
        if(n < 0)
            throw new NegativeNumberException();
        return Math.sqrt(n);
    }

    public static class DivideByZeroException extends Exception { }
    public static class NegativeNumberException extends Exception { }

}
