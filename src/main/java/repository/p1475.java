package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] arr = new int[10];
        for(int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - '0';
            if(num == 6) {
                arr[9]++;
            }else {
                arr[num]++;
            }
        }

        int max = 0;
        for(int j = 0; j < 9; j++) {
            max = Math.max(max, arr[j]);
        }

        int nine = arr[9] / 2;
        if(arr[9] % 2 == 1) nine++;

        max = Math.max(max, nine);

        System.out.println(max);

    }
}
