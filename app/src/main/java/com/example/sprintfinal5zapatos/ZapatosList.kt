package com.example.sprintfinal5zapatos

class ZapatosList {
    companion object {
        fun getZapatos(): List<Zapato> {
            val shoeList = mutableListOf<Zapato>()
            shoeList.add(Zapato("Zapato 1", "https://i.pinimg.com/564x/91/62/c3/9162c3f969f22973ab79399622cc1e60.jpg", 99.99))
            shoeList.add(Zapato("Zapato 2", "https://i.pinimg.com/564x/c8/7c/85/c87c858846479c479221b357e203f56f.jpg", 79.99))
            shoeList.add(Zapato("Zapato 3", "https://i.pinimg.com/564x/c3/a1/e7/c3a1e792b325b14cae95ad2fdca67fe2.jpg", 149.99))
            shoeList.add(Zapato("Zapato 4", "https://i.pinimg.com/236x/8f/96/f4/8f96f4b3ca7ed76bf568ad106b2be60d.jpg", 129.99))
            shoeList.add(Zapato("Zapato 5", "https://i.pinimg.com/236x/f1/ba/3a/f1ba3a3c69c403d029a492f562640b05.jpg", 109.99))
            shoeList.add(Zapato("Zapato 6", "https://i.pinimg.com/236x/49/70/3a/49703ab66f7ef2ed878d0692ae415e14.jpg", 89.99))
            shoeList.add(Zapato("Zapato 7", "https://i.pinimg.com/236x/93/ea/84/93ea845bdfd13f4fbe0f05639eeaf599.jpg", 199.99))
            shoeList.add(Zapato("Zapato 8", "https://i.pinimg.com/236x/b6/16/80/b61680386560fb8644a75761d7c442f6.jpg", 169.99))
            shoeList.add(Zapato("Zapato 9", "https://i.pinimg.com/236x/c2/dd/9e/c2dd9e43c894a64646b03aa8da4a7244.jpg", 169.99))
            shoeList.add(Zapato("Zapato 10", "https://i.pinimg.com/564x/08/2e/b3/082eb36aa62897a68a575e543c662080.jpg", 169.99))
            return shoeList
        }
    }
}