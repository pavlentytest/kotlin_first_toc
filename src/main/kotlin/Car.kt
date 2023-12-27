open class Car (var name_: String="", var power_: Int=0) {
    var name: String = ""
        get() {
            return field
        }
        private set(value) {
            if(value.length > 10) {
                field = value
            }
        }
    val power: Int
    init {
        name = name_
        power = power_
    }
}
class ECar : Car() {

}
