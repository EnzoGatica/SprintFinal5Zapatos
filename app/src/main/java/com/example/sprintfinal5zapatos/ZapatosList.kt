package com.example.sprintfinal5zapatos

class ZapatosList {
    companion object {
        fun returnShoeList(): List<Zapatos> {
            val shoeList = mutableListOf<Zapatos>()
            val shoeItem1 = Zapatos("Zapato 1", "https://acortar.link/uf76FN", 99.99)
            shoeList.add(shoeItem1)
            val shoeItem2 = Zapatos("Zapato 2", "https://acortar.link/tHa8Uf", 79.99)
            shoeList.add(shoeItem2)
            val shoeItem3 = Zapatos("Zapato 3", "https://acortar.link/6r3Agy", 149.99)
            shoeList.add(shoeItem3)
            val shoeItem4 = Zapatos("Zapato 4", "https://acortar.link/W0NmGG", 129.99)
            shoeList.add(shoeItem4)
            val shoeItem5 = Zapatos("Zapato 5", "https://example.com/zapato5.jpg", 109.99)
            shoeList.add(shoeItem5)

            val shoeItem6 = Zapatos("Zapato 6", "https://example.com/zapato6.jpg", 89.99)
            shoeList.add(shoeItem6)
            val shoeItem7 = Zapatos("Zapato 7", "https://example.com/zapato7.jpg", 199.99)
            shoeList.add(shoeItem7)
            val shoeItem8 = Zapatos("Zapato 8", "https://example.com/zapato8.jpg", 169.99)
            shoeList.add(shoeItem8)
            return shoeList
        }
    }
}