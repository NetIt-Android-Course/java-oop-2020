package com.teo;

import com.teo.dog_shelter.Dog;

public class Main {

    public static void main(String[] args) {
        Chair teoChair = new Chair("#F00", "wood");
        Chair ivanChair = new Chair("#0F0", "plastic");
        Chair peshoChair = new Chair();
        Chair atanasChair = new Chair("#00F", "wood",
                3, 10, 10);

        teoChair.moveChair(1, 1);
        teoChair.positionY = -100;

        System.out.println("Chair Teo pos:" +
                teoChair.positionX + " " +
                teoChair.positionY + " " +
                teoChair.color);
        System.out.println("Chair Ivan pos:" +
                ivanChair.positionX + " " +
                ivanChair.positionY + " " +
                ivanChair.color);

        MyText stringClone = new MyText();
        stringClone.setValue("this is a test");
        System.out.println("text length:" + stringClone.getLength());

        Dog puhcho = new Dog("Puhcho", "Teo");
        puhcho.celebrateBirthday();
        puhcho.setOwnerName("Ivan");
        System.out.println(puhcho.getName() + " " + puhcho.getAge());
    }
}
