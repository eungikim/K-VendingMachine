data class Beverage (val name: String, var price: Int, val ml: Int) {
    val taste: String? = null

    override fun toString(): String {
        return "$name(${ml}ml) : ${price}원"
    }
}