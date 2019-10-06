class Mina (var oroRecolectado : Int, var sed : Int, var fatiga: Int){
    val bob = Bob(oroRecolectado, sed, fatiga)
    val banco = Banco(oroRecolectado)
    fun RecolectarPepitas() {
        var pepitas : Int = 0
        while (pepitas < 3){
            pepitas += 1
            bob.fatiga += 2
            bob.sed += 1
            bob.oroRecolectado += 1
        }
        if (pepitas >= 3){
            banco.DepositarOro(oroRecolectado)
        }

    }
}