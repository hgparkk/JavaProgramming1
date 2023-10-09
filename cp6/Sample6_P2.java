import java.io.*;

class Sample6_P2 {
    public static void main(String args[]) throws IOException {
        System.out.println("시험 점수를 입력하십시오.(0을 입력하면 종료)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int sum = 0;

        do {
            String str = br.readLine();
            num = Integer.parseInt(str);
            sum += num;
        } while (num != 0);

        System.out.println("시험 점수의 합계는 " + sum + "점입니다.");
    }
}
