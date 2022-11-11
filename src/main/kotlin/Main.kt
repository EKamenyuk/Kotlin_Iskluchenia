fun main(args: Array<String>) {

    val post1 = Post(
        111,
        111111,
        111111,
        111111,
        220820221450,
        "Текст поста",
        11111,
        222,
        true,
        Comments(333, true, false, false, true),
        Likes(444, true, true, true),
        Reposts(44, false),
        Views(33),
        "post", //post, copy, reply, postpone, suggest.
        12121,
        true,
        true,
        false,
        true,
        false,
        false,
        1
    )
    val post2 = Post(
        222,
        12345,
        12345,
        222222,
        120920221530,
        "Текст поста",
        12345,
        235,
        true,
        Comments(255, true, false, false, true),
        Likes(43, true, true, true),
        Reposts(13, false),
        Views(44),
        "post", //post, copy, reply, postpone, suggest.
        123,
        true,
        true,
        false,
        true,
        false,
        false,
        1
    )
    val post3 = Post(
        333,
        3456,
        3456,
        333333,
        121212589,
        "Текст поста",
        3456,
        3333,
        false,
        Comments(100, true, false, false, true),
        Likes(5500, true, true, true),
        Reposts(2000, false),
        Views(6000),
        "post", //post, copy, reply, postpone, suggest.
        10900,
        true,
        true,
        false,
        true,
        false,
        false,
        1
    )
    val post4 = Post(
        4444,
        4444444,
        4444444,
        4444444,
        110920222015,
        "Update",
        404040,
        444444,
        true,
        Comments(44444, true, false, false, true),
        Likes(555555, true, true, true),
        Reposts(33333, false),
        Views(55566666),
        "post", //post, copy, reply, postpone, suggest.
        777777,
        true,
        true,
        false,
        true,
        false,
        false,
        1
    )

    WallService.add(post1)
    WallService.add(post2)
    WallService.add(post3)
    WallService.add(post4)

    WallService.print()
    val comment1 = Comment(
        1,
        10,
        102021020,
        11112022,
        "text comment 1",
        null
    )

    try {
        WallService.createComment(comment1)
    } catch (e: PostNotFoundException){
        println(e.message)
    }
}