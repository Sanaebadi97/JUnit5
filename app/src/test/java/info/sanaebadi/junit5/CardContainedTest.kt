package info.sanaebadi.junit5

import info.sanaebadi.junit5.caster.model.Card
import org.junit.jupiter.api.Test

class CardContainedTest {

    @Test
    fun cardIsCorrectlyContainedInsideADeck() {
        var card = Card.parse("88")
//        val deck=Deck(listOf(card))
//        Assert.assertTrue(card in deck)
    }
}