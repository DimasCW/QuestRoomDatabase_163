package com.example.pertemuan9_roomdatabase

import android.app.Application
import com.example.pertemuan9_roomdatabase.dependenciesinjection.ContainerApp
import com.example.pertemuan9_roomdatabase.dependenciesinjection.InterfaceContainerApp


//Step 7
class KrsApp : Application() {
    lateinit var containerApp: ContainerApp //Fungsinya untuk menyimpan

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) //membuat instance
        //instance adalah object yang dibuat dari class
    }
}