package org.example.lesson_14

class Order(
    private val id: Int,
    private var statusOfOrder: Boolean = false,
){
    private fun changeStatus(statusOfOrder: Boolean) {
        this.statusOfOrder = statusOfOrder
    }
    fun getNewStatus(newStatus: Boolean) {
        changeStatus(newStatus)
    }
}