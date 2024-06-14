package com.han.functionsandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("hello my friend")
        test()
        

        /*

        var myString = " deneme "
        */


        var myAge : Int? = null


        println(myAge!! * 20 )






    }


    // code block , reusable , input , output


    fun test(){
        println("hello world")

        myPlus("Metin",2)
        myPlus("Metin2",6)




    }

    fun myPlus(a : String , b : Int) {

        println(a + " " + b)
    }

   fun myMultiply (c : Int , d : Int) : Int {

       return c * d



       //Nullability






   }












}