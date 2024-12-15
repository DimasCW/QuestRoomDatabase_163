package com.example.pertemuan9_roomdatabase.data.database

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pertemuan9_roomdatabase.data.dao.MahasisawaDao
import com.example.pertemuan9_roomdatabase.data.entity.Mahasiswa

//Mendefinisikan database dengan tabel mahasiswa
//Step 3
@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase(){

    //mendefinisikan fungsi untuk mengakses data mahasiswa
    abstract fun mahasiswaDao(): MahasisawaDao

    companion object{
        @Volatile //memastikan bahwa nilai variable
        private var Instance : KrsDatabase? =  null

        fun getDatabase(context: Context): KrsDatabase {
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context.applicationContext,
                    KrsDatabase::class.java, //class database
                    "KrsDatabsse" //nama database
                )
                    .build().also { Instance = it }
            })
        }
    }
}