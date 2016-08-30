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
public class StringBufferTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tempstr = "abcdefghijklmnopqrstuvwxyz";
        int times = 10000000;
        long lstart1 = System.currentTimeMillis();
        StringBuffer sb =  new StringBuffer();
        for (int i = 0; i < times; i++) {
           sb.append(tempstr);//字符串拼接
        }
        long lend1 = System.currentTimeMillis();
        long time = (lend1 - lstart1);
        System.out.println("Duration of StringBuffer "+time +" milliseconds, which is "+(double)time/1000+" seconds" );
         
      
    }
    
}
