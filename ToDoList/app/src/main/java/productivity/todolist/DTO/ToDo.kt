package productivity.todolist.DTO

import android.content.ContentValues
import productivity.todolist.COL_Name
import productivity.todolist.TABLE_TODO

class ToDo {

    var id : Long = -1
    var name = ""
    var createdAt = ""
    var items : MutableList<ToDoItem> = ArrayList()
}

fun addToDo(toDo: ToDo): Boolean {
    val db = writableDatabase
    val cv = ContentValues()
    cv.put(COL_Name, toDo.name)
    val result = db.insert(TABLE_TODO, null, cv)
    return
}