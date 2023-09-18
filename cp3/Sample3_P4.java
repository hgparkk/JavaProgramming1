//93쪽 4번

import java.io.*;

class Sample3_P4 
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("원주율의 값은 얼마입니까?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double num = Double.parseDouble(str);
        System.out.println("원주율의 값은 "+num+"입니다.");
    }
}
