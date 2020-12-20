package com.company;

public class Number {
    private String number;
    public Number(String num){
        this.number=getNumber(num);
    }
    public String getNumber(String num){
        String newNum;
        if(num.charAt(0)=='+'){
            num=num.replace("+","");
        }
        return newNum="+"+num.substring(0,4)+"-"+num.substring(4,7)+"-"+num.substring(7,11);
    }

    @Override
    public String toString() {
        return "Number="+number;
    }

    public static void main(String[] args){
         Number number1=new Number("+89330236843");
         Number number2=new Number("893302376843");
        System.out.println(number1);
        System.out.println(number2);
    }
}
