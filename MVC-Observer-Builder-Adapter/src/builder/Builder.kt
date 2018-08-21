package builder

import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel

interface Builder {

    fun addLabel(c: JLabel): Builder

    fun addButtonOne(c: JButton): Builder

    fun addButtonTwo(c: JButton): Builder

    fun addButtonOdd(c: JButton): Builder

    fun getResult(): JPanel
}