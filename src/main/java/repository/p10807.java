package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10807 {
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(bf.readLine());
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int v = Integer.parseInt(bf.readLine());

            int count = 0;
            for(int i = 0; i < N; i++) if(Integer.parseInt(st.nextToken()) == v) count++;

            System.out.println(count);
        }
    }
}
