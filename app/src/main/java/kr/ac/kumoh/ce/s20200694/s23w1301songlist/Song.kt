package kr.ac.kumoh.ce.s20200694.s23w1301songlist

data class Song(
    val id: Int, //만약 읽는것만이 아니라 수정, 삭제 등 하려면 val -> var
    val title: String,
    val singer: String,
    val rating: Int,
    val lyrics: String,
)
