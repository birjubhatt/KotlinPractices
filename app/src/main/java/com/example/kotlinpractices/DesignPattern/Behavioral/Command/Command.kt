package com.example.kotlinpractices.DesignPattern.Behavioral.Command

abstract class Command {

    abstract fun execute(target: Target)

    abstract fun undo()

    abstract fun redo()

}