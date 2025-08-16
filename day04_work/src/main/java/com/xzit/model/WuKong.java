package com.xzit.model;

public class WuKong  implements Shape{
    CuiLanGao cuiLanGao;
    @Override
    public void becomeCuiLanGao() {
      cuiLanGao = new CuiLanGao();
      cuiLanGao.becomeCuiLanGao();
      fightWithPig();
      catchPig();
    }
    public static void fightWithPig(){
        System.out.println("和猪八戒战斗");
    }
    public static void catchPig(){
        System.out.println("抓住猪八戒");
    }
}
