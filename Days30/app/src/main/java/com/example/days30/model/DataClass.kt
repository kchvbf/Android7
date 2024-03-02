package com.example.days30.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DataClass(
    @StringRes val nameRes: Int,
    @StringRes val instructionRes: Int,
    @DrawableRes val imageRes: Int,
)