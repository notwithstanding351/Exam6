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
public class Exam6_3 {

    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;
        int max = getMaxValue(value1, value2);
        System.out.println("max : " + max);

        int min = getMinValue(value1, value2);
        System.out.println("min : " + min);
    }

    public static int getMaxValue(int v1, int v2) {
        if(v1> v2){
            return v1;
        }
        else
            return v2;
    }

    public static int getMinValue(int v1, int v2) {
        // 코드 작성
        if(v1 < v2)
            return v1;
        else
            return v2;
    }
}
