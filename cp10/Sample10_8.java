class Car {
    private int num;
    private double gas;
    private String name;

    public Car() {
        num = 0;
        gas = 0.0;
        name = "이름 없음";
        System.out.println("자동차가 만들어졌습니다.");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + "로, 연료량을" + gas + "로 바꾸었습니다.");
    }

    public void setName(String nm) {
        name = nm;
        System.out.println("차량 이름을 " + name + "로 바꾸었습니다.");
    }

    public void show() {
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료량은 " + gas + "입니다.");
        System.out.println("이름은 " + name + "입니다.");
    }
}

class Sample10_8 {
    public static void main(String args[]) {
        Car car1;
        car1 = new Car();

        car1.show();

        int number = 1234;
        double gasoline = 20.5;
        String str = "1호차";

        car1.setCar(number, gasoline);
        car1.setName(str);

        car1.show();
    }
}