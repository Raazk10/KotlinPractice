class Block(val color: String) {
    object DimProperties {
        var width = 0
        var length = 0

        fun blocksInBox(lengthBox: Int, widthBox: Int):Int{
            return (lengthBox / length) * (widthBox / width)
        }
    }
}
class C {
    val b = Block.DimProperties.length
}