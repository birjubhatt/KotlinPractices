package com.example.kotlinpractices.DesignPattern.Behavioral.Command.Commands

import com.example.kotlinpractices.DesignPattern.Behavioral.Command.Command
import com.example.kotlinpractices.DesignPattern.Behavioral.Command.Target
import com.example.kotlinpractices.DesignPattern.Behavioral.Command.enums.Visibility

class InvisibleSpell : Command() {

    private var target: Target? = null

    override fun execute(target: Target) {
        target.visibility = Visibility.INVISIBLE
        this.target = target
    }

    override fun undo() {
        if (target != null) {
            target?.visibility = Visibility.VISIBLE
        }
    }

    override fun redo() {
        if (target != null) {
            target?.visibility = Visibility.INVISIBLE
        }
    }

}