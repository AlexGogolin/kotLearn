package org.example.Lesson_2

const val TOTAL_TABLES = 13

fun main() {
    val bookingTablesToday = 13
    val bookingTablesTomorrow = 9

    val isAvailableToday = TOTAL_TABLES > bookingTablesToday
    val isAvailableTomorrow = TOTAL_TABLES > bookingTablesTomorrow

    println("Доступность столиков на сегодня: $isAvailableToday\nДоступность столиков на завтра: $isAvailableTomorrow")
}