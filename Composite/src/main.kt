fun main(args: Array<String>){
    val leftEye = Leaf("left eye")
    val rightEye = Leaf("right eye")
    val eyes = Composite("eyes")
    eyes.addComponent(leftEye)
    eyes.addComponent(rightEye)
    val nose = Leaf("nose")
    val mouth = Leaf("mouth")
    val head = Composite("head")
    head.addComponent(eyes)
    head.addComponent(nose)
    head.addComponent(mouth)

    head.print()
}