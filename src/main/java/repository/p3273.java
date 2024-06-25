package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p3273 {
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            int x = Integer.parseInt(br.readLine());

            int count = 0;
            int start = 0;
            int end = N - 1;
            int sum = 0;

            while(start < end) {
                sum = arr[start] + arr[end];
                if(sum == x) count++;
                if(sum <= x) start++;
                else end--;
            }

            System.out.println(count);
        }
    }
}
