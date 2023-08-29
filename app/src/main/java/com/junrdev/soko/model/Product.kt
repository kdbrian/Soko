package com.junrdev.soko.model

class Product (

    val id : String,
    val name : String,

    val imageUrl : String ?,
    val images : List<String> ? = null,
    val numberInStock : Int ,

    val category: String,
    val categories : List<String> ?,

    val price : Float,
    val discountAllowed : Boolean ? = false,
    val discount : Double ? = 0.0,

    val vendorId : String
)