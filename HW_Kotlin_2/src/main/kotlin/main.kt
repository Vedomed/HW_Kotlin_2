val amount: Int = 99

fun main () {
    println("платеж - " + amount)
    println ("комиссия - " + comission(amount))
}

fun comission(amount: Int = 99) {
    if (amount < 100) 35
    else amount * 0.35
}
