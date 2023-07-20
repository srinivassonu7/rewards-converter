import java.util.Scanner;


public class RewardValue{
    private double cValue;
    private final double rate=0.0035;
    RewardValue(double cValue){
        this.cValue=cValue;
    }
    RewardValue(int mValue){
        this.cValue=convertToCash(mValue);
    }
    double convertToCash(int mValue){

        return mValue * rate;
    }
    double getCashValue(){


        return cValue;
    }
    int getMilesValue(){

        return (int)(this.cValue/rate);
    }

}