package main.mvc.controller.command

import main.mvc.model.Counter

class Odd(private val model: Counter): Command {

    override fun execute() = model.odd()
}