package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(input);

        double firstNumber = Double.parseDouble(st.nextToken());
        double secondNumber = Double.parseDouble(st.nextToken());

        System.out.println(firstNumber / secondNumber);

    }
}
