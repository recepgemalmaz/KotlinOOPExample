package com.recepgemalmaz.kotlinoopexample

class User {
    var name: String? = null
    var age: Int? = null

    // Default Constructor
constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        println("User created with name: $name and age: $age")
    }

    init {
        println("User created with name: $name and age: $age")
    }
}