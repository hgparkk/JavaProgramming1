import java.io.*;
class Sample4_P5 
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("과목 1~5의 점수를 정수로 입력하십시오.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();   
        String str2 = br.readLine(); 
        String str3 = br.readLine(); 
        String str4 = br.readLine(); 
        String str5 = br.readLine(); 

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3 = Integer.parseInt(str3);
        int num4 = Integer.parseInt(str4);
        int num5 = Integer.parseInt(str5);

        int sum = num1 + num2 + num3 + num4 + num5;

        System.out.println("5과목의 합계는 "+sum+"점입니다.");
        System.out.println("5과목의 평균은 "+((double)sum/(double)5)+"점입니다.");
    }
}
