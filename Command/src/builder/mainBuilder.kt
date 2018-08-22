package builder

import Controller
import CounterModel
import ObserverLabel
import javax.swing.JButton
import javax.swing.JFrame

class MyFrame(): JFrame(){
    val undo = JButton("undo")

    init {
        undo.isEnabled = false
    }

    fun setUndoEnable(b: Boolean){
        undo.isEnabled=b
    }
}

fun main(args: Array<String>){
    val model = CounterModel()
    val view = ObserverLabel()
    val frame = MyFrame()
    val controller = Controller(model, frame)
    model.addObserver(view)

    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    val addOne = JButton("+1")
    addOne.addActionListener { controller.addOne() }
    val addTwo = JButton("+2")
    addTwo.addActionListener { controller.addTwo() }
    val odd = JButton("odd")
    odd.addActionListener { controller.odd() }
    frame.undo.addActionListener { controller.undo() }

    val builder = if(args.isEmpty()) VerticalBuilder() else HorizontalBuilder()

    builder.addLabel(view)
            .addButtonOne(addOne)
            .addButtonTwo(addTwo)
            .addButtonOdd(odd)
            .addButtonUndo(frame.undo)

    frame.contentPane = builder.getResult()
    frame.pack()
    frame.isVisible = true

}