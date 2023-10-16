class Car {
    int num;
    double gas;

    void setNumGas(int n, double g) {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + "로, 연료량을 " + gas + "로 바꾸었습니다.");
    }

    void show() {
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료량은 " + gas + "입니다.");
    }
}

class Sample8_5 {
    public static void main(String args[]) {
        Car car1 = new Car();

        int number = 1234;
        double gasoline = 20.5;

        car1.setNumGas(number, gasoline);
    }
}
