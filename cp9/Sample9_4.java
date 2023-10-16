class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }

    void show() {
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료량은 " + gas + "입니다.");
    }
}

class Sample9_4 {
    public static void main(String args[]) {
        Car car1 = new Car();
        car1.show();
    }
}
