package com.example.sprintfinal5zapatos

class ZapatosList {
    companion object {
        fun getZapatos(): List<Zapato> {
            val shoeList = mutableListOf<Zapato>()
            shoeList.add(Zapato("PikaTilla", "https://i.postimg.cc/m2YqGH54/zapato1.png", 99.99))
            shoeList.add(Zapato("DoblaPata", "https://i.postimg.cc/NjbzKwtP/zapato2.png", 79.99))
            shoeList.add(Zapato("NikeTrue", "https://i.postimg.cc/kg7HMg0b/zapato3.png", 149.99))
            shoeList.add(Zapato("ConversePride", "https://i.postimg.cc/d3MWbsRD/zapato4.png", 129.99))
            shoeList.add(Zapato("Convert L", "https://i.postimg.cc/vBxq2gVp/zapato5.png", 109.99))
            shoeList.add(Zapato("PaCorrer", "https://i.postimg.cc/PqxFZFrf/zapato6.png", 89.99))
            shoeList.add(Zapato("ConverseBajo", "https://i.postimg.cc/0jptxTZn/zapato7.png", 199.99))
            shoeList.add(Zapato("ControlTilla", "https://i.postimg.cc/nLPS1YC4/zapato8.png", 169.99))
            shoeList.add(Zapato("TipoInvierno", "https://i.postimg.cc/tTP0Zm2Z/zapato9.png", 83.99))
            shoeList.add(Zapato("CasualVans", "https://i.postimg.cc/Xq0Rwcz2/zapato10.png", 19.99))
            shoeList.add(Zapato("SancoTilla", "https://i.postimg.cc/XYvTcvs0/zapato11.png", 19.99))
            shoeList.add(Zapato("TiroLargo", "https://i.postimg.cc/prYgk5NP/zapato12.png", 19.99))
            shoeList.add(Zapato("ConverCuero", "https://i.postimg.cc/7Y9F2zMV/zapato13.png", 19.99))
            shoeList.add(Zapato("Zapato2099", "https://i.postimg.cc/13YbWZdV/zapato15.png", 19.99))
            return shoeList
        }
    }
}