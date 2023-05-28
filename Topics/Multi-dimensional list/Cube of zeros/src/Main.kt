fun main() {
    // write your code here
    val list3D = mutableListOf<MutableList<MutableList<Int>>>()

    for (i in 0 until 3) {
        val list2D = mutableListOf<MutableList<Int>>()

        for (j in 0 until 3) {
            val list1D = mutableListOf<Int>(0, 0, 0)
            list2D.add(list1D)
        }

        list3D.add(list2D)
    }

    println(list3D)
}