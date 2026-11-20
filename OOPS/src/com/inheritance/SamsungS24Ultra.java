package com.inheritance;

class SamsungS24Ultra extends Samsungs {   // MultiLevel Inheritance

    int zoom = 100;

    public void aiFeatures() {
        System.out.println("Galaxy AI Features");
    }

    public void display() {
        System.out.println("6.8 Inch AMOLED Display");
    }


    
    public static void main(String[] args) {

        SamsungS24Ultra phone = new SamsungS24Ultra();

        System.out.println("Mobile Details ->\n");
        System.out.println("Brand : " + phone.brand);
        System.out.println("RAM : " + phone.ram + " GB");
        phone.calling();
        phone.messaging();
        
        System.out.println("----------------------------------------");

        System.out.println("Samsung Details ->\n");
        System.out.println("UI : " + phone.ui);
        System.out.println("Fingerprint : " + phone.fingerprint);
        phone.camera();
        phone.samsungPay();
          
        System.out.println("----------------------------------------");


        System.out.println("SamsungS24Ultra Details ->\n");
        System.out.println("Zoom : " + phone.zoom + "X");
        phone.aiFeatures();
        phone.display();
    }
}
