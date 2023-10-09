/*
1. 0 < a && a < 10
2. a != 0
3. a == 0 || 10 < a
 */


import java.io.*;

class Sample5_P2 
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("정수를 입력하십시오.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res%2 == 1)
            System.out.println(res+"(은)는 홀수입니다.");

        else
            System.out.println(res+"(은)는 짝수입니다.");
    }    
}
