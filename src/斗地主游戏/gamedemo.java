package 斗地主游戏;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class gamedemo {

    //定义一个静态集合存储54张牌
     public static    List<card> allcards=new ArrayList<>();

      //静态代码块初始化数据
      static{
      String []sizes={"3","4","5","6","7","8","9","10","J","Q","K","A"};

      String []colors={"♥","♠","♣","♦"};
      String code="";
      int index=0;
      for(String size:sizes){
          index++;
          for(String color:colors){
           card c=new card(size,color,index);
           allcards.add(c);
          }
      }
      //添加大小王
       card c1=new card("","🃏",++index);
       card c2=new card("","🃏",++index);
          Collections.addAll(allcards,c1,c2);
          System.out.println("新牌"+allcards);
      }

    public static void main(String[] args) {
 //洗牌
         Collections.shuffle(allcards);
        System.out.println("洗牌后："+allcards);

   //发牌（定义三个玩家，为三个集合对象）
        List<card> linhuchong=new ArrayList<>();
        List<card> libai=new ArrayList<>();
        List<card> renyingying=new ArrayList<>();
   //发51张牌给玩家，留三张底牌
        for(int i=0;i<allcards.size()-3;i++){
            card c=allcards.get(i);
            if(i%3==0){
                //存入阿冲中
                linhuchong.add(c);
            } else if (i%3==1) {
                //存入李白
                libai.add(c);
            }else if(i%3==2){
                //存入任盈盈
                renyingying.add(c);
            }
        }
        //把最后三张牌放到一个子集合中去
        List<card> Lastthreecards=allcards.subList(allcards.size()-3, allcards.size() );

        //给玩家的牌排序（从大到小），先输出
        System.out.println("阿冲："+linhuchong);
        System.out.println("李白："+libai);
        System.out.println("任盈盈："+renyingying);
        System.out.println("底牌："+Lastthreecards);


    }
    public static void sortcards(List<card> cards){
          Collections.sort(cards, new Comparator<card>() {
              @Override
              public int compare(card o1, card o2) {
                  return o2.getIndex()-o1.getIndex();
              }
          });
    }
}
