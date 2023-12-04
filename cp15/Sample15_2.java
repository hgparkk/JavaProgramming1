class Car extends Thread {
    private String name;

    public Car(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "가 동작하고 있습니다.");
        }
    }
}

class Sample15_2 {
    public static void main(String[] args) {
        Car car1 = new Car("1호차");
        car1.start();

        Car car2 = new Car("2호차");
        car2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main() 메소드 실행 중입니다.");
        }
    }
}
