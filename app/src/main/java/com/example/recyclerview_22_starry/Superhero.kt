package com.example.recyclerview_22_starry

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Superhero (
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String
) : Parcelable