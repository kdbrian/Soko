package com.junrdev.soko.model

class Vendor(
    val id: String,
    val name: String,
    val profilePicUrl: String,

    val locationId: String?,
    val phone: String,
    val email: String
)