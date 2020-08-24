package com.hacybeyker.googlemapsviewpager.entity

data class Clinic(
    var id:Int,
    var title:String,
    var description:String,
    var latitude: Double = 0.0,
    var longitude: Double = 0.0
)