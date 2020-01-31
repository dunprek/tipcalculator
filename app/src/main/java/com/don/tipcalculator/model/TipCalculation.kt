package com.don.tipcalculator.model

/**
 * Created by gideon on 31,January,2020
 * gideon@cicil.co.id
 * Jakarta - Indonesia
 */
data class TipCalculation(
    val checkAmount: Double = 0.0,
    val tipPct: Int = 0,
    val tipAmount: Double = 0.0,
    val grandTotal: Double = 0.0
)