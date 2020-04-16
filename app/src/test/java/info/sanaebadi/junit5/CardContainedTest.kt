package info.sanaebadi.junit5

import info.sanaebadi.junit5.model.Card
import info.sanaebadi.junit5.model.Deck
import org.junit.Assert
import org.junit.jupiter.api.Test
import java.util.logging.Level.parse

class CardContainedTest {

    @Test
    fun cardIsCorrectlyContainedInsideADeck() {
        var card = Card.parse("88")
//        val deck=Deck(listOf(card))
//        Assert.assertTrue(card in deck)
    }
}