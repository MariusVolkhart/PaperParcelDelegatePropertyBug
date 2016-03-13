package com.volkhart.paperparcelbugdemo

import nz.bradcampbell.paperparcel.PaperParcel

@PaperParcel
data class User(val firstName: String,
                val lastName: String) {

    val fullName: String by lazy {
        "$firstName $lastName"
    }
}