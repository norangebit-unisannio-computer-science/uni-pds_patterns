import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

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

    val c = JPanel()
    c.layout = GridLayout(4,1)

    c.add(view)
    c.add(addOne)
    c.add(addTwo)
    c.add(odd)

    frame.contentPane = c
    frame.pack()
    frame.isVisible = true
}