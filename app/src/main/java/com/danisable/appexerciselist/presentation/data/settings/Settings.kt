package com.danisable.appexerciselist.presentation.data.settings

import com.danisable.appexerciselist.domain.model.Settings


object Settings {
    fun getSettings(): ArrayList<Settings> {
        return arrayListOf(
            Settings(
                "Artista 0",
                "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg"
            ),
            Settings(
                "Artista 1",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzyALOcLp4ykOIC4bim8L0xZIvgfLLZEo-mg&usqp=CAU"
            ),
            Settings("Artista 2", "https://img2.freepng.es/20180626/fhs/kisspng-avatar-user-computer-icons-software-developer-5b327cc98b5780.5684824215300354015708.jpg"),
            Settings("Artista 3", "https://png.pngtree.com/element_our/20190604/ourlarge/pngtree-user-avatar-boy-image_1482937.jpg"),
            Settings("Artista 0", "https://png.pngtree.com/png-vector/20190625/ourlarge/pngtree-business-male-user-avatar-vector-png-image_1511454.jpg"),
            Settings("Artista 1", "https://img.freepik.com/free-vector/illustration-user-avatar-icon_53876-5907.jpg?size=338&ext=jpg"),
            Settings("Artista 2", "https://png.pngtree.com/png-vector/20190702/ourlarge/pngtree-female-user-avatars-flat-style-women-profession-vector-png-image_1529171.jpg"),
            Settings("Artista 3", "https://png.pngtree.com/element_our/20190529/ourmid/pngtree-black-round-pattern-user-cartoon-avatar-image_1200114.jpg")
        )
    }
}