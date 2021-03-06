import java.io.*;
import java.util.*;
//solution for coci 06 regional firefly

public class line_sweep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();

        int [] line = new int [500001];

        int count = 0;

        for (int i=0; i<n; i+=2) {
            line[h-sc.nextInt()]++;
            line[sc.nextInt()]--;
            count++;
        }

        int num = 0;
        int min = 200001;
        for (int j=0; j<h; j++) {
            count+=line[j];
            if (count<min) {
                min=count;
                num=0;
            } 
            if (count==min) {
                num++;
            }
        }
        System.out.println(min+" "+num);
        System.exit(0);
    }

}
