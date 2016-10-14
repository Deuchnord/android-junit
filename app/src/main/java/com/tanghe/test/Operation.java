package com.tanghe.test;

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
        return n1 * n1;
    }

    public static float division(float n1, float n2) throws DivideByZeroException
    {
        /*
        if(n2 == 0)
            throw new DivideByZeroException();
            */
        return n1 / n2;
    }

    public static class DivideByZeroException extends Exception { }

}
