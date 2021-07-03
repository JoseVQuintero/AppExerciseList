package com.danisable.appexerciselist.presentation.data.news
import com.danisable.appexerciselist.domain.model.News

object News {
    fun getNews(): ArrayList<News> {
        return arrayListOf(
            News(
                "Artista 0",
                "Este es un artista con muy buena musica",
                "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg"
            ),
            News(
                "Artista 1",
                "Este es un artista con muy buena musica",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzyALOcLp4ykOIC4bim8L0xZIvgfLLZEo-mg&usqp=CAU"
            ),
            News("Artista 2","Este es un artista con muy buena musica", "https://img2.freepng.es/20180626/fhs/kisspng-avatar-user-computer-icons-software-developer-5b327cc98b5780.5684824215300354015708.jpg"),
            News("Artista 3","Este es un artista con muy buena musica", "https://png.pngtree.com/element_our/20190604/ourlarge/pngtree-user-avatar-boy-image_1482937.jpg"),
            News("Artista 0","Este es un artista con muy buena musica", "https://png.pngtree.com/png-vector/20190625/ourlarge/pngtree-business-male-user-avatar-vector-png-image_1511454.jpg"),
            News("Artista 1","Este es un artista con muy buena musica", "https://img.freepik.com/free-vector/illustration-user-avatar-icon_53876-5907.jpg?size=338&ext=jpg"),
            News("Artista 2","Este es un artista con muy buena musica", "https://png.pngtree.com/png-vector/20190702/ourlarge/pngtree-female-user-avatars-flat-style-women-profession-vector-png-image_1529171.jpg"),
            News("Artista 3","Este es un artista con muy buena musica", "https://png.pngtree.com/element_our/20190529/ourmid/pngtree-black-round-pattern-user-cartoon-avatar-image_1200114.jpg")
        )
    }
}