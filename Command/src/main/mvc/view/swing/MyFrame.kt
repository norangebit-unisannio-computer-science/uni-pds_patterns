package main.mvc.view.swing

import main.mvc.view.swing.builder.HorizontalBuilder
import main.mvc.view.swing.builder.VerticalBuilder
import main.mvc.controller.ControllerI
import main.mvc.view.View
import javax.swing.JButton
import javax.swing.JFrame

class MyFrame: JFrame(), View {
    private val addOne = JButton("+1")
    private val addTwo = JButton("+2")
    private val odd = JButton("odd")
    private val undo = JButton("undo")
    private val label = ObserverLabel()

    init {
        undo.isEnabled = false
    }

    override fun getObserver() = label

    override fun setUndoEnable(b: Boolean) {
        undo.isEnabled = b
    }

    fun build(i: Int){
        val builder = if(i==0) VerticalBuilder() else HorizontalBuilder()
        builder.addLabel(label)
                .addButtonOne(addOne)
                .addButtonTwo(addTwo)
                .addButtonOdd(odd)
                .addButtonUndo(undo)
        contentPane = builder.getResult()
        defaultCloseOperation = EXIT_ON_CLOSE
        pack()
    }

    override fun setController(c: ControllerI) {
        addOne.addActionListener{ c.addOne() }
        addTwo.addActionListener { c.addTwo() }
        odd.addActionListener { c.odd() }
        undo.addActionListener{ c.undo()}
    }
}