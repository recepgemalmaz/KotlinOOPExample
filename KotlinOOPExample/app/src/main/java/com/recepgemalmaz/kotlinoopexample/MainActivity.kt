package com.recepgemalmaz.kotlinoopexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user = User("Recep", 22)
        println(user.name)
        println(user.age)
        println("User name is ${user.name} and age is ${user.age}")

        var musician = Musician("James", 50, "Guitar")
        //musician.age = 60
        //println("Musician name is ${musician.name}, age is ${musician.age} and instrument is ${musician.instrument}")

        var musician2 = Musician("Lars", 55, "Drums")
        //println("Musician name is ${musician2.name}, age is ${musician2.age} and instrument is ${musician2.instrument}")

        //altakileri yazidirir
        println( musician2.returnBandName("Recep"))
        println( musician2.returnBandName("Recep2"))
        
    }
}