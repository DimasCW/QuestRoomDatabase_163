package com.example.pertemuan9_roomdatabase.dependenciesinjection

import android.content.Context
import com.example.pertemuan9_roomdatabase.data.database.KrsDatabase
import com.example.pertemuan9_roomdatabase.repository.LocalRepositoryMhs
import com.example.pertemuan9_roomdatabase.repository.RepositoryMhs

//Step 6
interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}