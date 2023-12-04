import java.math.BigInteger;

class Sum extends Thread {
    private long sum;

    public Sum() {
        sum = 0;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("합 실행결과 : " + sum);
    }
}

class Product extends Thread {
    BigInteger product;

    public Product() {
        product = new BigInteger("1");
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            BigInteger pre = new BigInteger(Integer.toString(i));
            product = product.multiply(pre);
        }
        System.out.println("곱 실행결과 : " + product);
    }
}

class Sample15_P1 {
    public static void main(String args[]) {
        Sum res1 = new Sum();
        res1.start();

        Product res2 = new Product();
        res2.start();
    }
}
