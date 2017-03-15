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
public class Exam6_1 {

    public static void main(String[] args) {
        cal(5, 3);
    }

    public static void cal(int num1, int num2) {
        System.out.println("덧셈 : "+ (num1 + num2));
        System.out.println("뺄셈 : "+ (num1 - num2));
        System.out.println("곱셈 : "+ (num1 * num2));
        System.out.println("나눗셈 : "+ (num1 / num2));
        System.out.println("나머지 : "+ (num1 % num2));
        
    }
}