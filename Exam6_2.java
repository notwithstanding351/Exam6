/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam6;

/**
 *
 * @author 하이테크
 */
public class Exam6_2 {

    public static void main(String[] args) {
        int n = 1000;
        int total = (summation(n));
        System.out.println("1 ~ " + n + " 까지의 합 : " + total);
    }

    // 메소드 작성
    public static int summation(int num1)
    {
        int tempTotal = 0;
        for(int i=1;i<=num1;i++){
            tempTotal += i;
        }
        return tempTotal;
    }
}
