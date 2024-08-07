package repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p10828 {
    /**
     * 문제
     *  - 정수를 저장하는 스택을 구현, 입력으로 주어지는 명령을 처리하는 프로그램.
     *  - 명령은 총 다섯 가지.
     *   1. push X: 정수 X를 스택에 넣는 연산.
     *   2. pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력.
     *   3. size: 스택에 들어있는 정수의 개수를 출력.
     *   4. empty: 스택이 비어있으면 1, 아니면 0을 출력.
     *   5. top: 스택의 가장 위에 있는 정수를 출력. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력.
     * 입력
     *  - 첫째 줄 : 주어지는 명령의 수 N (1 ≤ N ≤ 10,000).
     *  - 둘째 줄부터 : 명령어.
     *
     * 출력
     * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력.
     *
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        Stack<Integer> sk = new Stack<>();
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String cmd = st.nextToken();

            switch(cmd) {
                case "push":
                    sk.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(!sk.empty()) {
                        System.out.println(sk.peek());
                        sk.pop();
                    }else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(sk.size());
                    break;
                case "empty":
                    if(sk.empty()) {
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(sk.empty()) {
                        System.out.println(-1);
                    }else {
                        System.out.println(sk.peek());
                    }
                    break;
            }
        }

    }
}
