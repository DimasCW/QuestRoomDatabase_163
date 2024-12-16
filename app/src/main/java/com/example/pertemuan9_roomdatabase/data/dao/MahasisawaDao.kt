package com.example.pertemuan9_roomdatabase.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pertemuan9_roomdatabase.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow


//Step 2
@Dao
interface MahasisawaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa) /**memasukkan table mahasiswa**/

    //-----
    //getAllMahasiswa
    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMahasiwa() : Flow<List<Mahasiswa>>

    //getMahasiswa
    @Query("SELECT * FROM mahasiswa WHERE nim = :nim")
    fun getMahasiswa(nim: String) : Flow<Mahasiswa>

    //deleteMahasiswa
    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)

    //updateMahasiswa
    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)
}

