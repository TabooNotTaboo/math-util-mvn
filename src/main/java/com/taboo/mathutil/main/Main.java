package com.taboo.mathutil.main;

import com.taboo.mathutil.core.MathUtility;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        //Test case 1
        int n = 0; //given = 0 , y muon tinh 0!
        long expected = 1; //y muon la ham n!= 0! phai tra ve 1
        long actual = MathUtility.getFactorial(n);
        // so sanh giua expectd va actual
        System.out.println(n + "! -> expected: " + expected + " | actual= " + actual);
        
        //Test case 2
        n = 1; //give n = 1 , y muon tinh 0!
        expected = 1; 
        actual = MathUtility.getFactorial(n);
        // so sanh giua expectd va actual
        System.out.println(n + "! -> expected: " + expected + " | actual= " + actual);
        
        //Test case 3
        System.out.println("5! -> expected: 120" + " | actual = " + MathUtility.getFactorial(5));
        
        
    }

}
// Minh la dev, minh phai test code cua minh trc 
// muon test code (dev) hay test app (qc/tester) thi can phai chuan bi 
// Test case - tinh huong kiem thu, truong hop kiem thu - cach ta kiem thu trong 1 ngu canh nao do-ban ve do data
// test cse co cau truc nhu sau :
//ID | description | steps/Procedures | expected result | status (passed) 
// Dev em muon kiem thu xem ham chinh em viet getFactorial () dung hay sai 
// thi em test thiet ke test case
//test case 1 : verify getFatorial (with n = 0 )
//step procedures :                           [cac buoc run app]
// 1. give n = 0
// 2. execute/call/invoke function getFactorial
// expectd result: the function must return 1 (standing for 1 )

// Test case 2 : verify getFactorial (with n = 1 )
// Step/proccedures
// 1 . give n =1 
// 2 . call/ invoke getFactorial (n = 1)
// expected result
// method must be return 1 in case of 1!
// Status : pass/failed

// Test case 3 : verify getFactorial (with n = 5 )
// Step/proccedures
// 1 . give n =5 
// 2 . call/ invoke getFactorial (n = 5)
// expected result
// method must be return 120 in case of 5!
// Status : pass/failed