package com.example.pertemuan9_roomdatabase.repository

import com.example.pertemuan9_roomdatabase.data.dao.MahasisawaDao
import com.example.pertemuan9_roomdatabase.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

//Step 5
class LocalRepositoryMhs (
    private val mahasiswaDao: MahasisawaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    //----
    //getAllMhs
    override fun getAllMhs(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiwa()
    }

    //getMhs
    override fun getMhs(nim : String): Flow<Mahasiswa>{
        return mahasiswaDao.getMahasiswa(nim)
    }

    //deleteMhs
    override suspend fun deleteMhs(mahasiswa: Mahasiswa){
        mahasiswaDao.deleteMahasiswa(mahasiswa)
    }

    //updateMhs
    override suspend fun updateMhs(mahasiswa: Mahasiswa){
         mahasiswaDao.updateMahasiswa(mahasiswa)
    }
}

