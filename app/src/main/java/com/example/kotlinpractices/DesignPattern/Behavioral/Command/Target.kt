package com.example.kotlinpractices.DesignPattern.Behavioral.Command

import com.example.kotlinpractices.DesignPattern.Behavioral.Command.enums.Color
import com.example.kotlinpractices.DesignPattern.Behavioral.Command.enums.Size
import com.example.kotlinpractices.DesignPattern.Behavioral.Command.enums.Visibility

abstract class Target{

    var size: Size? = null

    var visibility: Visibility? = null

    var color: Color? = null

    fun printStatus() :String{
        println("size = $size visibility = $visibility")
        return "size = $size visibility = $visibility color = $color"
    }
}