package productivity.todolist

import android.os.FileObserver.CREATE

const val DB_NAME = "TpDoList"
const val DB_VERSION = 1
const val TABLE_TODO = "ToDo"

const val COL_ID = "id"
const val COL_CREATED_AT = "createdAt"
const val COL_Name = "name"

const val TABLE_TODO_ITEM = "ToDoItem"
const val COL_TODO_ID = "toDoId"
const val COL_ITEM_NAME = "itemName"
const val COL_IS_COMPLETED = "isCompleted"

const val INTENT_TODO_ID = "TodoID"
const val INTENT_TODO_NAME = "TodoName"