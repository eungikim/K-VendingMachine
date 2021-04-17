class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            println("환영합니다. 무엇을 드시겠습니까?")
            println("1. 제로 콜라")
            println("2. 제로 펩시 라임")
            println("3. 제로 나랑드")
            println("4. 제로 칠성 사이")

            val insert: Int = readLine()!!.toInt()

            println("insert: $insert")
        }
    }

    fun makeTestData(list: MutableList<Beverage>) {
        list.add(Beverage("제로 콜라", 1200))
        list.add(Beverage("제로 펩시 라", 1200))
        list.add(Beverage("제로 나랑", 1200))
        list.add(Beverage("제로 칠성 사이", 1200))
    }
}