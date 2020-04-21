package info.sanaebadi

import org.junit.jupiter.api.BeforeAll
import java.sql.DriverManager

object TST {
    @BeforeAll
    fun beforeAllInit() {
        DriverManager.println("this needs to run before all")
    }
}