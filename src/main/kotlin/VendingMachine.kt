class VendingMachine {
    val PRE_CMD_ESCAPE = 0
    val PRE_CMD_ERR = -1

    fun execute() {
        var myMoney = 10000
        val beverageList = makeTestData()

        while (true) {
            printMenu(beverageList, myMoney)
            when(val insertCmd = insertCommand(beverageList.size)) {
                PRE_CMD_ESCAPE -> break
                PRE_CMD_ERR -> printErr()
                else -> {
                    myMoney -= buyBeverage(beverageList, insertCmd)
                    // TODO: 0원 검사
                }
            }
        }
    }

    private fun buyBeverage(itemList: List<Beverage>, pick: Int): Int {
        println("정말 놀랍군요! ${itemList.get(pick -1)} 구매")
        return itemList.get(pick -1).price
    }

    private fun printErr() {
        println("RTFM")
    }

    fun printMenu(itemList: List<Beverage>, money: Int) {
        println("K-VendingMachine 에 오신걸 환영합니다.")
        var index = 1
        for (item in itemList) {
            println("${index++}. $item")
        }
        println("0. 종료")
        println("잔액 ${money}원")
    }

    fun insertCommand(itemSize: Int): Int {
        val insertCommand = readLine()?.toIntOrNull()?:-1
        if (insertCommand > itemSize) return PRE_CMD_ERR
        return insertCommand
    }

    fun makeTestData(): List<Beverage> {
        val list = mutableListOf<Beverage>()
        list.add(Beverage("제로 콜라", 1200, 255))
        list.add(Beverage("제로 펩시 라임", 1600, 350))
        list.add(Beverage("제로 나랑드", 700, 260))
        list.add(Beverage("제로 칠성 사이다", 1000, 255))
        return list
    }
}