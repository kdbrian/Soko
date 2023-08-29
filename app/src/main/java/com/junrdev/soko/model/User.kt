package com.junrdev.soko.model

import android.os.Parcelable

class User(
    val Uid: String,
    val email: String,
    val  userType: UserType ? = UserType.BUYER
)

enum class UserType(type : String)  {

    VENDOR("vendor"),
    BUYER("buyer");

//    constructor(type : String) {
//    }

//    fun getUserType (): String = get
}