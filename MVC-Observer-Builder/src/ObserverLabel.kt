import java.util.*
import javax.swing.JLabel

class ObserverLabel: Observer, JLabel("0") {

    override fun update(p0: Observable?, p1: Any?) {
        text = (p0 as CounterModel).count.toString()
    }

}