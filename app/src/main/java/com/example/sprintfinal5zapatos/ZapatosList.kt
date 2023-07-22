package com.example.sprintfinal5zapatos

class ZapatosList {
    companion object {
        fun getZapatos(): List<Zapato> {
            val shoeList = mutableListOf<Zapato>()
            shoeList.add(Zapato("Zapato 1", "https://acortar.link/uf76FN", 99.99))
            shoeList.add(Zapato("Zapato 2", "https://acortar.link/tHa8Uf", 79.99))
            shoeList.add(Zapato("Zapato 3", "https://acortar.link/6r3Agy", 149.99))
            shoeList.add(Zapato("Zapato 4", "https://acortar.link/W0NmGG", 129.99))
            shoeList.add(Zapato("Zapato 5", "https://example.com/zapato5.jpg", 109.99))
            shoeList.add(Zapato("Zapato 6", "https://example.com/zapato6.jpg", 89.99))
            shoeList.add(Zapato("Zapato 7", "https://example.com/zapato7.jpg", 199.99))
            shoeList.add(Zapato("Zapato 8", "https://example.com/zapato8.jpg", 169.99))
            return shoeList
        }
    }
}