package top.ilum.amenity.data

data class User(
    val id: String,
    val name: String,
    val username: String,
    val role: Boolean,
    val email: String,
    val markers: List<Marker>,
    val territory: List<Territory>
)