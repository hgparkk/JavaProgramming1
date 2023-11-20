class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("차량 번호가 " + num + "로, 연료량이 " + gas + "인 자동차가 만들어졌습니다.");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + "로, 연료량을 " + gas + "로 바꾸었습니다.");
    }

    public void show() {
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료량은 " + gas + "입니다.");
    }
}

class RacingCar extends Car {
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("레이싱 카가 만들어졌습니다.");
    }

    public RacingCar(int n, double g, int c) {
        super(n, g);
        course = c;
        System.out.println("코스 번호가 " + course + "인 레이싱 카가 만들어졌습니다.");
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("코스 번호를 " + course + "로 했습니다.");
    }
}

class Sample11_2 {
    public static void main(String args[]) {
        RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
    }
}
