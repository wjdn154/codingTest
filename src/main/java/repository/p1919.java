package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        String left = st.nextToken();
        String right = st2.nextToken();
        int[] arr = new int[26];
        int count = 0;

        for(int i = 0; i < left.length(); i++) arr[left.charAt(i) - 97]++;
        for(int i = 0; i < right.length(); i++) arr[right.charAt(i) - 97]--;
        for(int i = 0; i < 26; i++) {
            if(arr[i] > 0) count += arr[i];
            if(arr[i] < 0) count += (arr[i] * -1);
        }
        System.out.println(count);

        /**
         *
         * 문제
         *  - 애너그램 관계 : 두 영어 단어가 철자의 순서를 뒤바꾸어 같아질 수 있음.
         *
         *  - 예시 : occurs, succor
         *
         *  - 아닌 예시 : dared, bread
         *  - dared에서 d를 제거, bread에서 b를 제거하면, 애너그램 관계가 됨.
         *  - 제거해야 하는 최소 개수의 문자 수를 구하는 프로그램을 작성하시오.
         *  - 문자를 제거할 때에는 아무 위치에 있는 문자든지 제거할 수 있다.
         *
         * 입력
         * - 첫째 줄과 둘째 줄에 영어 단어가 소문자로 주어진다.
         * - 각각의 길이는 1,000자를 넘지 않으며, 적어도 한 글자로 이루어진 단어가 주어진다.
         *
         */

    }
}
