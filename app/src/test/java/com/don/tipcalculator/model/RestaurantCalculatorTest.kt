package com.don.tipcalculator.model

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Created by gideon on 31,January,2020
 * gideon@cicil.co.id
 * Jakarta - Indonesia
 */
class RestaurantCalculatorTest {
    lateinit var calculator: RestaurantCalculator

    @Before
    fun setup() {
        calculator = RestaurantCalculator()
    }

    @Test
    fun testCalculateTip() {
        val baseTc = TipCalculation(checkAmount = 10.0)
        val testVals = listOf(
            baseTc.copy(tipPct = 25, tipAmount = 2.5, grandTotal = 12.50),
            baseTc.copy(tipPct = 15, tipAmount = 1.5, grandTotal = 11.50),
            baseTc.copy(tipPct = 18, tipAmount = 1.8, grandTotal = 11.8))

        testVals.forEach{
            assertEquals(it, calculator.calculateTip(it.checkAmount, it.tipPct))
        }
    }

}