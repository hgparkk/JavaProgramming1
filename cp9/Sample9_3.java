class Car {
    private int num;
    private double gas;

    public void setCar(int n) {
        num = n;
        System.out.println("차량 번호를 " + num + "로 바꾸었습니다.");
    }

    public void setCar(double g) {
        gas = g;
        System.out.println("연료량을" + gas + "로 바꾸었습니다.");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + "로, 연료량을 " + gas + "로 바꾸었습니다.");
    }

    public void show() {
        System.out.println("챠량 번호는 " + num + "입니다.");
        System.out.println("연료량은 " + gas + "입니다.");
    }
}

class Sample9_3 {
    public static void main(String args[]) {
        Car car1 = new Car();

        car1.setCar(1234, 20.5);
        car1.show();

        System.out.println("차량 번호만 변경되었습니다.");
        car1.setCar(2345);
        car1.show();

        System.out.println("연료량만 변경되었습니다.");
        car1.setCar(30.5);
        car1.show();
    }
}
