package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        List<String> arr = new ArrayList<String>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String left = st.nextToken();
            String right = st.nextToken();
            String flag = "Possible";
            int[] alphabet = new int[26];

            if(left.length() != right.length()) {
                arr.add("Impossible");
                continue;
            }

            for(int j = 0; j < left.length(); j++) {
                alphabet[left.charAt(j) - 97 ]++;
                alphabet[right.charAt(j) - 97]--;
            }

            for(int k : alphabet) {
                if (k != 0) {
                    flag = "Impossible";
                    break;
                }
            }
            arr.add(flag);
        }
        arr.forEach(System.out::println);
    }
}
