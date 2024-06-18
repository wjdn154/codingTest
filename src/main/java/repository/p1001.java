package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(input);

        int firstNumber = Integer.parseInt(st.nextToken());
        int secondNumber = Integer.parseInt(st.nextToken());

        System.out.println(firstNumber - secondNumber);

    }
}