class MyPoint {
    int x;
    int y;

    void setX(int px) {
        x = px;
    }

    void setY(int py) {
        y = py;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}

class Sample8_P5 {
    public static void main(String args[]) {
        MyPoint p1 = new MyPoint();
        p1.setX(10);
        p1.setY(5);

        int px = p1.getX();
        int py = p1.getY();

        System.out.println("X좌표는 " + px + ", Y좌표는 " + py + "였습니다.");
    }
}
