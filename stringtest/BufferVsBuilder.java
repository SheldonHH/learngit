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
public class BufferVsBuilder {
   
    public static void main(String[] args) {
        int N = 77777;
        long t;
        
        {
            String str = "";
            t = System.currentTimeMillis();
            for(int i = N; i --> 0;){
                str = str+"abc";
            }
            System.out.print("String concantation duration: ");
            System.out.println(System.currentTimeMillis()-t);
        }
        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("abc");
            }
            System.out.print("String buffer time: ");
            System.out.println(System.currentTimeMillis() - t);
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("abc");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
    }
}
