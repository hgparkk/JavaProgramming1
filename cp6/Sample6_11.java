import java.io.*;

class Sample6_11 {
    public static void main(String args[]) throws IOException {
        System.out.println("몇 번째 처리를 건너뛰시겠스니까?(1~10)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for (int i = 1; i <= 10; i++) {
            if (i == res)
                continue;
            System.out.println(i + "번째 처리입니다.");
        }
    }
}
