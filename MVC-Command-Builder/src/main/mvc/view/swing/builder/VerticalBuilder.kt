package main.mvc.view.swing.builder

import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel

class VerticalBuilder: Builder {

    private val panel = JPanel()
    private val buttonPanel = JPanel()

    init {
        buttonPanel.layout = GridLayout(1,4)
        panel.layout = GridLayout(2,1)
    }


    override fun addLabel(c: JLabel): Builder {
        panel.add(c)
        return this
    }

    override fun addButtonOne(c: JButton): Builder {
        buttonPanel.add(c)
        return this
    }

    override fun addButtonTwo(c: JButton): Builder {
        buttonPanel.add(c)
        return this
    }

    override fun addButtonOdd(c: JButton): Builder {
        buttonPanel.add(c)
        return this
    }

    override fun addButtonUndo(c: JButton): Builder {
        buttonPanel.add(c)
        return this
    }

    override fun getResult(): JPanel {
        panel.add(buttonPanel)
        return panel
    }
}