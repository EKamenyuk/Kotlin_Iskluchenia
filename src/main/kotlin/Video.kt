data class Video(
    val id: Int, //	Идентификатор видеозаписи
    val owne_Id: Int, // Идентификатор владельца видеозаписи
    val title: String, // Название видеозаписи
    val description: String, // Текст описания видеозаписи
    val duration: Int, // Длительность ролика в секундах
    val views: Int, //	Количество просмотров видеозаписи
    val comments: Int, // Количество комментариев к видеозаписи
    val canRepost: Boolean, // Может ли пользователь сделать репост. true может
)