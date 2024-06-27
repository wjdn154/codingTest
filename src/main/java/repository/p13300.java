package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine().trim());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] boy = new int[6];
        int[] girl = new int[6];
        for(int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine().trim());
            int gender = Integer.parseInt(st2.nextToken());
            int grade = Integer.parseInt(st2.nextToken())-1;

            if(gender == 0) girl[grade]++;
            else boy[grade]++;
        }

        int count = 0;
        for(int i = 0; i < 6; i++) {
            if(boy[i] != 0) {
                count += (boy[i] + K - 1) / K;
            }
            if(girl[i] != 0) {
                count += (girl[i] + K - 1) / K;
            }
        }
        System.out.println(count);
    }
}
