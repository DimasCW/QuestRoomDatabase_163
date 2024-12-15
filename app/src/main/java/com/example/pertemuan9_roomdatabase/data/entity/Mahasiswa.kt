package com.example.pertemuan9_roomdatabase.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


// Step 1
@Entity(tableName = "mahasiswa")
data class Mahasiswa(
    @PrimaryKey
    val nim : String,
    val nama : String,
    val alamat : String,
    val jenisKelamin : String,
    val kelas : String,
    val angkatan : String
)
