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

enum DAY{SUN, MON, TUE, WED, THU, FRI, SAT}
enum MONTH{JAN, DEC}

//type : DAY
//possible value : SUN ..... SAT

public class EnumTypes {
    public static void main(String[] args) {
        DAY day; //Varaible Declare
        day = DAY.SUN; //Value Assign
        System.out.println(day);//Value Access
        
        MONTH month;
        month=MONTH.DEC;
        System.out.println(month);
    }
}
