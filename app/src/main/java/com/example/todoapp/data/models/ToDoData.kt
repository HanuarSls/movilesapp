package com.example.todoapp.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


//Nota: en android studio si queremos que nuescra clase represente una entidad ponemos el
// @Entity(y espesificamos el nombre de la tabla)
@Entity(tableName = "todo_table")
@Parcelize

//Creamos una data class ToDOData
data class ToDoData(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,
    var priority: Priority,
    var description: String
): Parcelable