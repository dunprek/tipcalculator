package com.don.tipcalculator.model

import java.math.RoundingMode

/**
 * Created by gideon on 31,January,2020
 * gideon@cicil.co.id
 * Jakarta - Indonesia
 */
class RestaurantCalculator {
    fun calculateTip(checkAmount: Double, tipPct: Int): TipCalculation {
        val tipAmount = (checkAmount * (tipPct.toDouble()) / 100.0)
            .toBigDecimal()
            .setScale(2,RoundingMode.HALF_UP)
            .toDouble()

        val grandTotal = checkAmount + tipAmount

        return TipCalculation(
            checkAmount = checkAmount,
            tipPct =  tipPct,
            tipAmount = tipAmount,
            grandTotal = grandTotal
        )
    }
}