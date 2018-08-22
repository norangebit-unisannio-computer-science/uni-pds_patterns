package main.mvc.view.swing.builder

import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel

class HorizontalBuilder: Builder {

    private val panel = JPanel()

    init {
        panel.layout = GridLayout(5,1)
    }

    override fun addLabel(c: JLabel): Builder {
        panel.add(c)
        return this
    }

    override fun addButtonOne(c: JButton): Builder {
        panel.add(c)
        return this
    }

    override fun addButtonTwo(c: JButton): Builder {
        panel.add(c)
        return this
    }

    override fun addButtonOdd(c: JButton): Builder {
        panel.add(c)
        return this
    }

    override fun addButtonUndo(c: JButton): Builder {
        panel.add(c)
        return this
    }

    override fun getResult(): JPanel = panel
}