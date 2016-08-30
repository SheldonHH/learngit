/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest;

/**
 *
 * @author Sheldon
 */
public class StringTest {
    public static void main(String []args){
        String tempstr = "abcdefghijklmnopqrstuvwxyz";
        int times = 50000;
        
         String str = "";
        long lstart1 = System.currentTimeMillis();
        
        for (int i = 0; i < times; i++) {
            str += tempstr;//字符串拼接
        }
        long lend1 = System.currentTimeMillis();
        long time = (lend1 - lstart1);
        System.out.println("Duration of StringBuffer"+time +" milliseconds, which is "+(double)time/1000+" seconds");
    }
}
