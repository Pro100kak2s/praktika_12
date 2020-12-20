package com.company;

public class Shirt {
   private String number;
   private String name;
   private String size;
   private String color;

   Shirt(){}

   Shirt(String number,String name,String size,String color){
       this.name=name;
       this.number=number;
       this.size=size;
       this.color=color;
   }

   public Shirt[] makeNewArray(String[] str){
   Shirt[] mas=new Shirt[11];
   String[] shirtStr=new String[10];
   for(int i=0;i<11;i++){
       shirtStr=str[i].split(",");
       mas[i]=new Shirt(shirtStr[0],shirtStr[1],shirtStr[2],shirtStr[3]);
   }
   return mas;
   }

    @Override
    public String toString() {
        return "Shirt{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args){
       String[] shirts=new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt shirt=new Shirt();
        Shirt[] sh=shirt.makeNewArray(shirts);
        for(Shirt i:sh){
            System.out.println(i);
        }
   }
}