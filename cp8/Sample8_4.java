class Car {
    int num;
    double gas;

    void setNum(int n) {
        num = n;
        System.out.println("차량 번호를 " + num + "로 바꾸었습니다.");
    }

    void setGas(double g) {
        gas = g;
        System.out.println("연료량을 " + gas + "로 바꾸었습니다.");
    }

    void show() {
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료량은 " + gas + "입니다.");
    }
}

class Sample8_4 {
    public static void main(String args[]) {
        Car car1 = new Car();

        car1.setNum(1234);
        car1.setGas(20.5);
    }
}
