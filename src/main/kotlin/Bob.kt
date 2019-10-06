import java.util.*
var aleatorio = Random()

open class Bob (val nombre: String= "Bob", var fatiga : Int =(aleatorio.nextInt(5)+1), var sed : Int =0, var oroRecolectado:Int=(aleatorio.nextInt(3)+1)){
    override fun toString(): String {
        return "El minero $nombre tiene $fatiga de fatiga, $sed de sed, y posee $oroRecolectado pepitas de oro en sus bolsillos"
    }
}