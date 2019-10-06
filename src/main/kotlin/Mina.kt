class Mina {
    fun recolectarPepitas() : Int {
        while(bob.oroRecolectado < 3){
            // Pausa del sistema
            Thread.sleep(1000)
            if(bob.oroRecolectado < 3) {
                bob.oroRecolectado += 1
                bob.sed += 1
                bob.fatiga += 2
                println("Minero Bob: Recolectado una pepita de oro. Oro actual ${bob.oroRecolectado} ")
            }
        }
        return bob.oroRecolectado

    }
}