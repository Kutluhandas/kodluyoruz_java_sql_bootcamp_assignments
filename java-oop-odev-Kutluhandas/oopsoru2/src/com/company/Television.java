package com.company;

public class Television {

    private int width,height,screenSize,volume;
    private int maxVolume = 100;

    private boolean power;

    public Television(int tvWidth, int tvHeight, int tvScreenSize){

        this.width = tvWidth;
        this.height = tvHeight;
        this.screenSize = tvScreenSize;

    }


    public int getMinusVolume(){

        return this.volume;

    }

    public void setMinusVolume(int minusVolume){
    for(minusVolume=minusVolume; minusVolume>=0; minusVolume--){
        System.out.print(minusVolume + " ");
    }
    System.out.println(" ");
        this.volume = minusVolume;
    }

    public int getPlusVolume(){
        return this.volume;
    }

    public void setPlusVolume(int plusVolume){
        for(plusVolume=plusVolume; plusVolume<=maxVolume; plusVolume++){
            System.out.print(plusVolume + " ");
        }
        System.out.println(" ");
        this.volume = plusVolume;
    }

    public boolean getTvPower(){
        return this.power;
    }

    public void setTvPower(boolean newPower){
        if(newPower){
            System.out.println("Tv açıldı");
        }else{ System.out.println("Tv kapandı");}
        this.power = newPower;
    }


}