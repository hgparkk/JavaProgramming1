class Sample7_P2{
    public static void main(String args[]){
        int[] test;
        test = new int[5];

        test[0]=80;
        test[1]=60;
        test[2]=22;
        test[3]=50;
        test[4]=75;
        test[5]=100;
        //배열의 길이를 넘어선 값을 넣음
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "번째 사람의 점수는" + test[i] + "입니다.");
        }
    }
}