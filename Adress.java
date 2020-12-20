package com.company;

import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String block;
    private String flat;

    public Adress(String str) {
        String[] st = getAddressArray(str);
        this.country = st[0];
        this.region = st[1];
        this.city = st[2];
        this.street = st[3];
        this.house = st[4];
        this.block = st[5];
        this.flat = st[6];
    }

    private String[] getAddressArray(String str) {
        String[] arr = new String[7];
        str = str.replaceAll(" ", "");
        StringTokenizer st = new StringTokenizer(str, ",.;-");

        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = st.nextToken();
            i++;
        }
        return arr;
    }

    public String toString() {
        return ("Полный адрес: " + country + ", " + region + ", " + city + ", " + street + " " + house + "/" + block + ", " + flat);
    }

    public static void main(String[] args) {
        Adress address = new Adress("   Россия, 45, Москва, Пушкинская, 28, 1, 18  ");
        System.out.println(address);
        address = new Adress("   Россия, 77.Москва; Пушкинская-28-1, 18  ");
        System.out.println(address);
    }
}
