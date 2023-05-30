package com.ecemgamzecuhadar.oopproject;

import static java.lang.System.out;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        User myUser = new User();
        myUser.name = "Ecem";
        myUser.job = "LandscapeArchitect";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";
         */

        User myUser = new User("Ecem","LandscapeArhitecture");
        System.out.println(myUser.information());


        out.println(myUser.name);

        //Encapsulation

        Musician james = new Musician("James", "Guitar", 50 );
        out.println(james.getName());
        james.setAge(60, "Ecem");
        out.println(james.getAge());


        //Inheritance
        SuperMusician lars = new SuperMusician("Lars", "Drums", 55 );
        out.println(lars.sing());
        out.println(lars.getAge());

        //Polymorphism

        //Static Polymorphism

        Mathematics mathematics = new Mathematics();
        out.println(mathematics.sum());
        out.println(mathematics.sum(5, 3));
        out.println(mathematics.sum(5, 3, 4 ));

        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

        //Abstract & Interface

        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();



    }
}