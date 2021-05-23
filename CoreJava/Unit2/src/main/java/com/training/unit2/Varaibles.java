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

public class Varaibles {
    public static void main(String[] args) {        
        int num1, num2, res; //variable decalre
        num1=10; //value assign
        num2=20; //value assign        
        res=num1+num2; //value assign
        System.out.println(res); //value access
        
        num1=50; //value update
        num2=7; //value update       
        res=num1*num2; //value update
        System.out.println(res); //value access
        
        System.out.println(Integer.toString(res).hashCode()); //value access        
        
        String str1="Kathmandu";// varaible declare and initialize
        System.out.println(str1.hashCode());
    }
}
