class Car {
    protected int num;
    protected double gas;

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

    public String toString() {
        String str = "차량 번호: " + num + " 연료량: " + gas;
        return str;
    }
}

class Sample11_7 {
    public static void main(String args[]) {
        Car car1 = new Car();
        car1.setCar(1234, 20.5);

        System.out.println(car1);
    }
}
