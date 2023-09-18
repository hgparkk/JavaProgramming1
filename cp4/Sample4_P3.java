import java.io.*;

class Sample4_P3 
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("정사각형의 한 변의 길이를 입력하십시오.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        System.out.println("정사각형의 넓이는 "+(num*num)+"입니다.");
    }
}
