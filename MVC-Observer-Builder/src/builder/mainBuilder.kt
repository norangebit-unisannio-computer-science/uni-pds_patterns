package builder

import Controller
import CounterModel
import ObserverLabel
import javax.swing.JButton
import javax.swing.JFrame

fun main(args: Array<String>){
    val model = CounterModel()
    val view = ObserverLabel()
    val controller = Controller(model, view)
    model.addObserver(view)

    val frame = JFrame()
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    val addOne = JButton("+1")
    addOne.addActionListener { controller.addOne() }
    val addTwo = JButton("+2")
    addTwo.addActionListener { controller.addTwo() }
    val odd = JButton("odd")
    odd.addActionListener { controller.odd() }

    val builder = if(args.isEmpty()) VerticalBuilder() else HorizontalBuilder()

    builder.addLabel(view)
            .addButtonOne(addOne)
            .addButtonTwo(addTwo)
            .addButtonOdd(odd)

    frame.contentPane = builder.getResult()
    frame.pack()
    frame.isVisible = true
}