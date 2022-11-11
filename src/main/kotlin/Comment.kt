data class Comment (
    val id : Int, // Идентификатор комментария
    val postId : Int, // идентификатор поста
    val fromId : Int, // Идентификатор автора комментария
    val date : Int, // Дата создания комментария в формате Unixtime
    val text : String,
    val thread : Thread?
)