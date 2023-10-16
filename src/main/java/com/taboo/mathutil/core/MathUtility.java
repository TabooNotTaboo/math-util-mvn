/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.taboo.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
   public static final double PI =3.14;
      public static long getFactorial (int n) {
       //ham tinh n! = 1,2,3... n
       //0!= 1!=1 -quy uoc
       //khong tinh giai thua so am 
       //n! tang rat nhanh ,20! vua du full kieu long 18 con so 0
       //quy uoc <0 ! va > 20 NEM NGOAI LE, KHONG TINH DC
       if (n<0 || n>20 )
           throw new IllegalArgumentException("Invalid n.n must be 0...20");
       if (n == 0 ||  n==1)
           return 1 ;
       return n * getFactorial(n-1);
      }
       
//   public static long getFactorial (int n) {
//       //ham tinh n! = 1,2,3... n
//       //0!= 1!=1 -quy uoc
//       //khong tinh giai thua so am 
//       //n! tang rat nhanh ,20! vua du full kieu long 18 con so 0
//       //quy uoc <0 ! va > 20 NEM NGOAI LE, KHONG TINH DC
//       if (n<0 || n>20 )
//           throw new IllegalArgumentException("Invalid n.n must be 0...20");
//       if (n == 0 ||  n==1)
//           return 1 ;
//       long result =1; 
//       for (int i = 2; i <= n; i++) {
//           result  *=i;
//       }
//       return result;
//   }
}
