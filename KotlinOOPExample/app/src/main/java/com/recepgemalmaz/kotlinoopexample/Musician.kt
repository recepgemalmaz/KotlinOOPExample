package com.recepgemalmaz.kotlinoopexample

class Musician(name: String, age: Int, instrument: String) {


    private var name: String? = null
        //gosterim sekli
        get() = field
        set(value) {
            field = value
        }
    private var age: Int? = null
        //gosterim sekli
        get
        private set

    private var instrument: String? = null
        get() = field
        set(value) {
            field = value
        }

    /*init {
        this.name = name
        this.age = age
        this.instrument = instrument
        println("Musician created with name: $name, age: $age and instrument: $instrument")
    }
    //getter ve setter tanımlamak için
    //getter
    fun getName(): String? {
        return this.name
    }
    fun getAge(): Int? {
        return this.age
    }
    fun getInstrument(): String? {
        return this.instrument
    }
    //setter
    fun setName(name: String) {
        this.name = name
    }
    fun setAge(age: Int) {
        this.age = age
    }
    fun setInstrument(instrument: String) {
        this.instrument = instrument
    }*/

    private val bandName : String = "Metallica"

    fun returnBandName(password : String) : String {
        if (password == "Recep") {
            return bandName
        } else {
            return "Wrong password"
        }
    }

}