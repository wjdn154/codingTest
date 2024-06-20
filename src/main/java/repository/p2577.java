package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String num = String.valueOf(A * B * C);

        int[] arr = new int[10];

        for(int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            arr[Integer.parseInt(String.valueOf(c))]++;
        }

        for(int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
