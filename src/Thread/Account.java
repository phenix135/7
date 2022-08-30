package Thread;

public class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void drawMoney(double money){
        //1,先获取是谁来取钱
        String name=Thread.currentThread().getName();
        //2,判断是否够钱
        synchronized ("heima") {
            if(this.money>=money){
                System.out.println(name+"来取钱成功，取出"+money+"元");
                //更新余额
                this.money -=money;
                System.out.println("取钱后，剩余"+this.money);
            }else {
                System.out.println(name+"来取钱，余额不足");
            }
        }
    }
}
