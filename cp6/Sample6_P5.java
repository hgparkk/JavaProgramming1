import java.io.*;

class Sample6_P5 {
    public static void main(String args[]) throws IOException {
        System.out.println("2 이상의 정수를 입력하십시오.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        for (int i = 2; i <= num; i++) {
            if (i == num) {
                System.out.println(num + "(은)는 소수입니다.");
            } else if (num % i == 0) {
                System.out.println(num + "(은)는 소수가 아닙니다.");
                break;
            }
        }
    }
}
