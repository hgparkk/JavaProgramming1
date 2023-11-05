class Account {
    static int Acno;
    private int no;
    private String name;
    private int money;

    public Account() {
        no = 0;
        name = "설정되지 않음";
        money = 0;
        Acno++;
        System.out.println("고객이 " + Acno + "명 등록되었습니다.");
    }

    public Account(int no, String name, int money) {
        this.no = no;
        this.name = name;
        this.money = money;
        Acno++;
        System.out.println("고객이 " + Acno + "명 등록되었습니다.");
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setAccount(int no, String name, int money) {
        this.no = no;
        this.name = name;
        this.money = money;
    }

    public void show() {
        System.out.println("고객번호 : " + no + ", 고객이름 : " + name + ", 잔고금액 : " + money);
    }
}

class TestAccount {
    public static void main(String args[]) {
        Account[] ac = new Account[5];

        for (int i = 0; i < ac.length; i++) {
            if (i < 2) {
                ac[i] = new Account();
            } else {
                String no = String.valueOf(i + 1);
                ac[i] = new Account(i + 1, no + "계좌", i * 1000);
            }
        }

        ac[0].setNo(1);
        ac[0].setName("1계좌");
        ac[0].setMoney(1000);
        ac[1].setAccount(2, "2계좌", 2000);

        for (int i = 0; i < ac.length; i++) {
            ac[i].show();
        }
    }
}
