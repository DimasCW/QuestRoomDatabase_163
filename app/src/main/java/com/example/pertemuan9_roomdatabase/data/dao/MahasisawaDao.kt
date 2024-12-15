package com.example.pertemuan9_roomdatabase.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.pertemuan9_roomdatabase.data.entity.Mahasiswa


//Step 2
@Dao
interface MahasisawaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa) /**memasukkan table mahasiswa**/

}