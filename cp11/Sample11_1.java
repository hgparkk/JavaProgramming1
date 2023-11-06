class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + "로, 연료량을 " + gas + "로 바꾸었습니다.");
    }
}

class RacingCar extends Car {
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("레이싱 카가 만들어졌습니다.");
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("코스 번호를 " + course + "로 했습니다.");
    }
}

class Sample11_1 {
    public static void main(String args[]) {
        RacingCar rccar1;
        rccar1 = new RacingCar();

        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);
    }
}