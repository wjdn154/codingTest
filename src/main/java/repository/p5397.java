package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class p5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine()); // * 입력 1
        List<Character> list = new LinkedList<>();

        for(int i = 0; i < N; i ++) {
            StringTokenizer st = new StringTokenizer(bf.readLine()); // * 입력 2
            String str = st.nextToken();
            ListIterator<Character> listIterator = list.listIterator(0);

            for(int j = 0; j < str.length(); j ++) {
                char cmd = str.charAt(j);
                switch (cmd) {
                    case ('>') -> {
                        if (listIterator.hasNext()) listIterator.next();
                    }
                    case ('<') -> {
                        if (listIterator.hasPrevious()) listIterator.previous();
                    }
                    case ('-') -> {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            listIterator.remove();
                        }
                    }
                    default -> listIterator.add(cmd);
                }
            }
            StringBuilder answer = new StringBuilder();
            for(char s : list) {
                answer.append(s);
            }
            System.out.println(answer);
            list.clear();
        }

    }
    /**
     * 문제
     * 비밀번호를 알아내는 프로그램
     * 입력:
     * 1. 알파벳 대문자
     * 2. 소문자
     * 3. 숫자
     * 4. 백스페이스
     * 5. 화살표
     *
     * 입력
     * 1. 테스트 케이스의 개수.
     * 2. 테스트 케이스
     *  - 백스페이스 : '-'(이때 커서의 바로 앞에 글자가 존재한다면, 그 글자를 지운다.)
     *  - 화살표 : '<', '>'(이때는 커서의 위치를 움직일 수 있다면, 왼쪽 또는 오른쪽으로 1만큼 움직인다.)
     *
     * 출력
     * 1. 비밀번호(비밀번호 > 0)를 출력.
     */
}
