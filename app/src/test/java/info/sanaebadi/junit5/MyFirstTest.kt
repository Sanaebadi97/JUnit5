package info.sanaebadi.junit5

import info.sanaebadi.junit5.model.Deck
import org.junit.Assert
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.*

class MyFirstTest {

    @Test
    fun textCode() {

        val deck = Deck(Collections.emptyList())
        assertTrue(deck.isEmpty())
    }

}