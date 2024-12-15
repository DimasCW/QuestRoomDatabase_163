package com.example.pertemuan9_roomdatabase.repositori

import com.example.pertemuan9_roomdatabase.data.dao.MahasisawaDao
import com.example.pertemuan9_roomdatabase.data.entity.Mahasiswa

//Step 5
class LocalRepositoryMhs (
    private val mahasiswaDao: MahasisawaDao
) : RepositoryMhs
{
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

}