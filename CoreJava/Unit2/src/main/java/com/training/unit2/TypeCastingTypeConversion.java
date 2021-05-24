/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.unit2;

/**
 *
 * @author Krishna
 */

public class TypeCastingTypeConversion {
    public static void main(String[] args) {
        //Type Casting Numeric to Numeric
        
        //Widenning
        // byte -> short -> int -> long -> float -> double;
        byte bn=10;
        int in=bn;
        double dn = in;
        System.out.println(dn);
        
        //Narrowing
        // byte <- short <- int <- long <- float <- double;
        dn = 78995475;
        in = (int) dn;
        bn = (byte) in;
        System.out.println(bn);
        
        //Type Conversion Numeric to String | String to Numeric
        //String to Numeric
        String str1="123";
        bn = Byte.parseByte(str1); //String to byte
        System.out.println(bn+1);
        
        //Numeric to String
        bn = 45;
        str1 = Byte.toString(bn);
        System.out.println(str1);
    }
}