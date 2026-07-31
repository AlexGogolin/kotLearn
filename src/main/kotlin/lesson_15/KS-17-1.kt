package org.example.lesson_15

class Quiz(question: String, answer: String) {
    private val _question = question
    private var _answer = answer

    val question: String
        get() = _question

    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}