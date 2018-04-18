package cn.tx.poker;

import cn.tx.set.Persion;

/**
 * 扑克花色
 * 王/黑桃/红桃/梅花/方块
 * A2...10JQK
 * */
public class Poker implements Comparable<Poker>{
    private Integer color;
    private String colorName;
    private Integer number;
    private String valueName;

    @Override
    public int compareTo(Poker o) {
        int val =this.color.compareTo(o.color);
        if ( val == 0){
            return this.number.compareTo(o.number);
        }
        return val;
    }

    public Poker() {
//        Poker poker =  new Poker(Integer color, Integer value);

//        poker.setColorValue();
    }

    public Poker(Integer color, Integer value) {
        /**
         * 大王(0,1)
         * 小王(0,2)
         * 红桃2(2,2)
         * 梅花J(3,11)
         * */
        this.color = color;
        this.number = value;

        setColorValue(color,value);
    }

    @Override
    public String toString() {
        if(this.color.equals(0)){
            return valueName+colorName ;
        }
        return colorName+valueName ;
    }

    public void setColorValue(int color,int value) {

        this.color = color;

//        switch (this.color){
//            case 1:
//                this.colorName = "♠";
//                break;
//            case 2:
//                this.colorName = "♥";
//                break;
//            case 3:
//                this.colorName = "♣";
//                break;
//            case 4:
//                this.colorName = "♦";
//                break;
//            case 0:
//                this.colorName = "王";
//                break;
//        }

        if(this.color==1) {
            this.colorName = "♠";//黑桃
        }else if(this.color.equals(2)){
            this.colorName = "♥";//红桃
        }else if(this.color.equals(3)){
            this.colorName = "♣";//梅花
        }else if(this.color.equals(4)){
            this.colorName = "♦";//方块
        }else {
            this.colorName = "王";//Joker
        }

        this.number = value;


        if(this.color.equals(0)){
            if(this.number.equals(15)){
                this.valueName="大";
            }else if(this.number.equals(14)){
                this.valueName="小";
            }else{
                System.out.println("扑克14是小王,15是大王,其他的都是错误输入.");
            }
        }else {
            if(this.number>1 && this.number<11){
                this.valueName = this.number.toString();
            }else if(this.number.equals(1)){
                this.valueName="A";
            }else if(this.number.equals(11)){
                this.valueName="J";
            }else if(this.number.equals(12)){
                this.valueName="Q";
            }else if(this.number.equals(13)){
                this.valueName="K";
            }else {
                System.out.println("扑克的值大小必须在1-13之间.");
            }
        }

    }


    public Integer getColor() {
        return color;
    }

    public String getColorName() {
        return colorName;
    }

    public Integer getValue() {
        return number;
    }

    public String getValueName() {
        return valueName;
    }

}
