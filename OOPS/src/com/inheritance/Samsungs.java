package com.inheritance;

class Samsungs extends Mobile {

    String ui = "One UI";
    boolean fingerprint = true;

    public void camera() {
        System.out.println("50 MP Camera");
    }

    public void samsungPay() {
        System.out.println("Samsung Pay Supported");
    }
}
