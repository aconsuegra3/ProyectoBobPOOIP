class Banco (var oroRecolectado : Int, var sed : Int, var fatiga: Int){
    val bob = Bob(oroRecolectado, sed, fatiga)
    fun DepositarOro(oroRecolectado: Int){
        bob.oroRecolectado = 0
    }
}