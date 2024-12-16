package com.example.pertemuan9_roomdatabase.repository

import com.example.pertemuan9_roomdatabase.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

//Step 4
interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    //-----
    //getAllMhs
    fun getAllMhs(): Flow<List<Mahasiswa>>

    //getMhs
    fun getMhs(nim: String) : Flow<Mahasiswa>

    //deleteMhs
    suspend fun deleteMhs(mahasiswa: Mahasiswa)

    //updateMhs
    suspend fun updateMhs(mahasiswa: Mahasiswa)
}