class Mina {
    fun recolectarPepitas() : Int {
        while(bob.oroRecolectado < 3){
            // Pausa del sistema
            Thread.sleep(1000)
            if(bob.oroRecolectado < 3) {
                //bob.oroRecolectado += bob.oroRecolectado + 1
                bob.oroRecolectado += 1
                //bob.sed=bob.sed+1
                bob.sed += 1
                //bob.fatiga=bob.fatiga+2
                bob.fatiga += 1
                println("Minero Bob: Recolectado una pepita de oro. Oro actual ${bob.oroRecolectado} ")
            }
        }
        return bob.oroRecolectado

    }
}