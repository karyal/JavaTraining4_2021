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
public class ArrayBasics {
    public static void main(String[] args) {
        
        //General Variable : Single Value
        int num1; //variable declare
        num1 = 30; // value assign
        num1 = 45; //value update
        System.out.println(num1); //value access
        
        //Array : a single variable can store multiple values of similar type
        //declare
        int nums[]; //decalre an array
        nums = new int[50000000]; //initialize an array with number of elements
        
        //Value Assign
        nums[0] = 8; //0-> index
        nums[1] = 7; //1-> index
        nums[2] = 6; //2-> index
        nums[3] = 3; //3-> index
        nums[4] = 5; //4-> index
        
        //Value Update/Edit
        nums[0] = 6;
        nums[1] = 3;
        nums[2] = 4;
        nums[3] = 7;
        nums[4] = 9;
        
        //Access
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        
        //System.out.println(nums[-1]); //java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5   
        //System.out.println(nums[5]); //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        
    }
}
