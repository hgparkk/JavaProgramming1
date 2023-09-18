import java.io.*;

class Sample4_P4 
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("삼각형의 밑변과 높이를 입력하십시오.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        int width = Integer.parseInt(str1);
        int height = Integer.parseInt(str2);

        System.out.println("삼격형의 넓이는 "+(double)((width*height)/(double)2)+"입니다.");
    }
}
