// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Sual 1. Verilmis ededin nece mertebeli olduqunu teyin edin

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ededi daxil edin:");
//        int eded = sc.nextInt();
//        int mertebe = 0;
//        // eded 0 olana qeder donguye giririk
//        while (eded != 0) {
//            eded = eded / 10;
//            //her bolunme bir mertebe
//            mertebe++;
//        }
//        System.out.println(mertebe);


        //Sual 2. Verilmis ededin sade qeqmlerinin sayini tapin.

Scanner sc=new Scanner(System.in);
        System.out.println("Reqemi daxil edin:");
        int num= sc.nextInt();

        int sum=0;
        while (num!=0){
          int digit= num%10;
          if (isSade(digit)){
              sum+=digit;
          }
          num=num/10;
        }


        //Sual 3.
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Bir reqem girin:");
//        int reqem=sc.nextInt();
//
//        int rqm;
//        int orginalReqem=rqm;
//        int tersineReqem=0;
//        while (rqm>0){
//            //son reqemini tapiriq
//            int  sonReqem=rqm%10;
//            //tersine cevirme kodu
//            tersineReqem=tersineReqem*10+sonReqem;
//            if (tersineReqem){
//                System.out.println("True");
//            }
//            else System.out.println("False");
//        }


}

    private static boolean isSade(int digit) {
        for (int i = 2; i < digit / 2; i++) {
            if (digit % i != 0) {
                return  false;

            } {

            }

       }return  true;
    }
    }

