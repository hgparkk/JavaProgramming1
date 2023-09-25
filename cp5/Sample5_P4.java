import java.io.*;

class Sample5_P4 
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("0에서 10까지의 수를 입력하십시오.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(0 <= res && res <= 10)
            System.out.println("정답입니다.");

        else
            System.out.println("오답입니다.");
    }    
}