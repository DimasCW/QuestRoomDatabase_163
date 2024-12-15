package com.example.pertemuan9_roomdatabase.repositori

import com.example.pertemuan9_roomdatabase.data.entity.Mahasiswa

//Step 4
interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}