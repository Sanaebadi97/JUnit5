package info.sanaebadi.junit5.model

data class User(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val postalAddresses: List<String>
) {

    fun isAdult() = age >= 18

    fun canReceivedMail() = postalAddresses.isNotEmpty()
}