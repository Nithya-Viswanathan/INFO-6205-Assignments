package edu.neu.coe.info6205.union_find;
import java.util.Random;
import java.util.Scanner;

public class HWQUPC_Solution {
    public static void main(String[] args) {
        int x = 0;
        HWQUPC_Solution tests = new HWQUPC_Solution();
        do{

            Scanner sc = new Scanner(System.in);
            System.out.print("Please input the size of sites: ");
            int n = sc.nextInt();
            int g = 0;
            int counts = 0;

            Random rd = new Random();
            UF_HWQUPC uf = new UF_HWQUPC(n,true);
            do{
                int num1 = rd.nextInt(n);
                int num2 = rd.nextInt(n);

                uf.connect(num1,num2);

                counts += tests.number(num1,num2);


                g++;
            }while (uf.getCount()>1);

            System.out.println("the number of pairs is: "+g);
            System.out.println("the number of connections happening is: "+counts);

            x++;
        }while(x<6);

    }

    public int number(int p, int q){
        int numConnections;
        if(p==q){
            numConnections=0;
        }
        else {
            numConnections=1;
        }
        return numConnections;
    }

}
