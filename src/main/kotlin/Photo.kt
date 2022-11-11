data class Photo(
    val id: Int, // Идентификатор фотографии.
    val albumId: Int, // Идентификатор альбома
    val userId: Int, // Идентификатор пользователя
    val text: String, // Текст описания фотографии
    val date: Int,
    val width: Int, // Ширина  фотографии
    val height: Int, // Высота  фотографии
)