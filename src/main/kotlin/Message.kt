data class Message(
    val id: Int, // Идентификатор сообщения
    val owner_id: Int, // Идентификатор владельца
    val title: String, // Заголовок сообщения
    val text: String, // Текст сообщения
    val date: Int, // Дата сообщения
)