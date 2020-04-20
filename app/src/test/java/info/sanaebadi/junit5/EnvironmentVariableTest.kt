package info.sanaebadi.junit5

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable

class EnvironmentVariableTest {
    @Test
    @EnabledIfEnvironmentVariable(named = "MY_ENV_VAR", matches = "true")
    fun onlyRunIfTheEnvironmentVariableIsSet() {
        //check that an empty hab=nd has score "0"
        //   val hand = Hand()
        //   Assertions.assertTrue(hand.sum == 0)
    }


    @Test
    @DisabledIfEnvironmentVariable(named = "MY_ENV_VAR", matches = "true")
    fun disableIfTheEnvironmentVariableIsSet() {
        //check that a Hnad containing an Ace of spades has score "11"
        //   val hand = Hand().apply{
        // add(Card(Rank.Ace , Suit.Spades))
    }
    //   Assertions.assertTrue(hand.sum == 11)
}





