class Car {
    int num;
    double gas;
}

class Sample8_1 {
    public static void main(String args[]) {
        Car car1;
        car1 = new Car();
        car1.num = 1234;
        car1.gas = 20.5;

        System.out.println("차량 번호는 " + car1.num + "입니다.");
        System.out.println("연료량은 " + car1.gas + "입니다.");
    }
}