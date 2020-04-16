package info.sanaebadi.junit5.model

import java.util.*

class Deck(cards: List<Card>) {
    private var cards = cards.toMutableList()

    val size get() = cards.size


    fun isEmpty() = cards.isEmpty()

    fun shuffle() {
        cards.shuffle()
    }

    fun draw() = if (isEmpty()) {
        throw EmptyStackException()
    } else {
        cards.removeAt(0)
    }

    override fun toString() = if (isEmpty())
        "Empty Deck"
    else
        "Deck of $size"


    operator fun contains(card: Card) = card in cards


}

