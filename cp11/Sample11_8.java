class Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }
}

class Sample11_8 {
    public static void main(String args[]) {
        Car car1 = new Car();
        Car car2 = new Car();

        Car car3;
        car3 = car1;

        boolean b11 = car1.equals(car2);
        boolean b12 = car1.equals(car3);

        System.out.println("car1과 car2가 같은지 조사한 결과, " + b11 + "였습니다.");
        System.out.println("car1과 car3가 같은지 조사한 결과, " + b12 + "였습니다.");
    }
}
