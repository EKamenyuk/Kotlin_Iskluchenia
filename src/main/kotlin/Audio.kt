data class Audio(
    val id: Int, // Идентификатор аудиозаписи.
    val owner_id: Int, // Идентификатор владельца
    val artist: String, // Исполнитель
    val title: String, // Название композиции
    val duration: Int, // Длительность аудиозаписи
    val album_id: Int, // Идентификатор альбома
    val genre_id: Int, // Идентификатор жанра
    val date: Int, // Дата добавления.
)