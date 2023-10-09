class Sample6_8 {
    public static void main(String args[]) {
        boolean bl = false;
        for (int i = 0; i < 5; i++) {
            if (bl == false) {
                System.out.print("*");
                bl = true;
            } else {
                System.out.print("-");
                bl = false;
            }
        }
        System.out.print("\n");
    }
}
