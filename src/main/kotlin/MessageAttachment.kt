class MessageAttachment(param: Message) : Attachment {
    override val type: String = "message"
    val message = param

    override fun toString(): String {
        return "\n  $message"
    }
}
