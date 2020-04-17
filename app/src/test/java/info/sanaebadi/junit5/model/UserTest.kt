package info.sanaebadi.junit5.model

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class UserTest {
    @Test

    @Disabled
    fun testMultiplePropertiesOfUser() {
        val user = User(
            firstName = "Hoge",
            lastName = "Foobar",
            age = 21,
            postalAddresses = listOf(
                "361 yellow  road", "randoville", "tehran"
            )

        )

        assertAll("Test a user",
            { assertNotNull(user.firstName) },
            { assertNotNull(user.lastName) },
            {
                assertAll("Age-related tests",
                    { assertEquals(21, user.age) },
                    { assertTrue(user.isAdult()) }


                )

            },
            {
                assertAll("Address tests",
                   // { assertEquals(1, user.postalAddresses) },
                    { assertEquals(1, user.postalAddresses) },
                    { assertTrue(user.canReceivedMail()) })
            })
    }
}