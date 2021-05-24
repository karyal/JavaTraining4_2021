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

public class Operators {
    public static void main(String[] args) {
        //1. Arithmetic Operators
        // +, -, *, /, %, sqrt, pow
        int num1, num2, result;
        num1= 85;
        num2 = 7;
        
        result=num1+num2;
        System.out.println(result);
        
        result=num1-num2;
        System.out.println(result);
        
        result=num1*num2;
        System.out.println(result);
        
        result=num1/num2;
        System.out.println(result);
        
        result=num1%num2;
        System.out.println(result);
        
        result=(int)Math.sqrt(num1);
        System.out.println(result);
        
        result=(int)Math.pow(2, 3);
        System.out.println(result);
        
        //Note: - Data type
        
        //2. Assignment Operator (=)        
        //a. Simple Assignment
        num1 = 78;
        System.out.println(num1);
        
        //b. Multiple assignment
        num1 = num2 = 6;
        System.out.println(num1);
        System.out.println(num2);
        
        //c. Short-hand assignment
        num1 = 5;
        num1+=2; //num1 = num1+2
        System.out.println(num1);
        
        //3. Relational Operators
        //Compare values and return boolean result
        boolean result2;
        num1=5;
        num2=2;
        
        result2 = (num1>num2);
        System.out.println(result2);   
        
        result2 = (num1!=num2);
        System.out.println(result2);   
        
        result2 = (num1<num2);
        System.out.println(result2);   
        
        result2 = (num1>=num2);
        System.out.println(result2);   
        
        result2 = (num1<=num2);
        System.out.println(result2);   
        
        //4. Logical Operators
        //a. Logical AND &&
        int n1, n2, n3;
        boolean res;
        n1=2;
        n2=3;
        n3=4;
        res = (n1>n2) && (n1>n3);
        /*
            T   T   T
            T   F   F
            F   T   F
            F   F   F
        */
        
        //b. Logical OR ||
        n1=2;
        n2=3;
        n3=4;
        res = (n1>n2) || (n1>n3);
        /*
            T   T   T
            T   F   T
            F   T   T
            F   F   F
        */
        
        //c. Logical NOT - !
        // T->F 
        // F->T
        n1=2;
        n2=3;       
        res = (n1>n2);
        res = !res;
        
        //5. Unary Operators
        // -, +, 
        n1 = -5;
        n2 = +4;
        
        //Increment Operator ++, decrement operator --
        n1 = 10;
        n1++; //increase by 1 i.e 11
        n1++; //increase by 1 i.e 12
        n1--; //increase by 1 i.e 11
        n1--; //increase by 1 i.e 10
        
        //Pre/Post
        ++n1; //pre increment
        n1++; //post increment
        
        --n1; //pre decrement
        n1--; //post decrement
        
        //HW: difference between pre and post form
        
        //6. Other Operators
            // {}, [], (), ., ,
        
            //Conditional Operator : ()?: like if statement
        
            // instanceof 
        
        //7. Bitwise Operators - NA
        
        //HW: Operator Precedence and Associativity.
    }
}
