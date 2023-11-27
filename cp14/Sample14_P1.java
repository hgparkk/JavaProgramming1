import java.io.*;

class Student {
    String num;
    String name;
    int lanScore;
    int mathScore;
    int engScore;

    public Student(String num, String name, int lanScore, int mathScore, int engScore) {
        this.num = num;
        this.name = name;
        this.lanScore = lanScore;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    public void show() {
        System.out.println(num + " " + name + " " + lanScore + " " + mathScore + " " + engScore);
    }
}

class Sample14_P1 {
    public static void main(String[] args) {
        Student std[] = new Student[10];
        String str;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt"), "UTF8"));

            int i = 0;

            while ((str = br.readLine()) != null) {
                System.out.println(str);
                String info[] = str.split(" ");
                if (info[0].equals("학번")) {
                } else {
                    int info1 = Integer.parseInt(info[2]);
                    int info2 = Integer.parseInt(info[3]);
                    int info3 = Integer.parseInt(info[4]);
                    std[i] = new Student(info[0], info[1], info1, info2, info3);
                    i++;
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("입출력 에러가 발생했습니다.");
        }

        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF8"));

            bw.write("학번 성명 국어 영어 수학 총점 평균");
            for (int j = 0; j < std.length; j++) {
                int sum = std[j].lanScore + std[j].mathScore + std[j].engScore;
                double avg = sum / 3;
                bw.write(std[j].num + " " + std[j].name + " " + std[j].lanScore + " " + std[j].mathScore + " "
                        + std[j].engScore + " " + sum + " " + avg);
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("입출력 에러가 발생했습니다.");
        }
    }
}
