package File_io;

public class demo5 {
    /**
     * 啤酒2元一瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，
     * 10元可以喝多少瓶啤酒？剩多少个盖子和空瓶？
     * @param args
     */
    public static int totalNumber=0;//啤酒的总瓶数
    public static int lastCoverNumber=0;//最后的瓶盖数量
    public static int lastBottleNumber=0;//最后的空瓶数量
    public static void main(String[] args) {
      buy(10);
        System.out.println("总数："+totalNumber);
        System.out.println("剩余瓶子数："+lastBottleNumber);
        System.out.println("剩余瓶盖数："+lastCoverNumber);

    }
    public static void buy(int money){
   //看可以买多少瓶

     int buyNumber=money/2; //5
        totalNumber +=buyNumber;

     //把瓶盖和空瓶换算成钱
        //计算本轮的瓶盖数和空瓶数
        int coverNumber=lastCoverNumber+buyNumber;
        int  bottleNumber=lastBottleNumber+buyNumber;

     //将瓶盖和空瓶换算成钱
        int allMoney=0;
        if(coverNumber>=4){
            allMoney+=(coverNumber/4)*2;
        }
        lastCoverNumber=coverNumber % 4;
        if(bottleNumber>=2){
            allMoney+=(bottleNumber/2)*2;
        }
      lastBottleNumber=bottleNumber % 2;


     if(allMoney>=2){
         buy(allMoney);
     }

    }
}
