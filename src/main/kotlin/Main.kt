// declaro variables globales para usar en las demás clases y así facilitar la utilización de las mismas
val bob = Bob()
val mina = Mina()
val taberna = Taberna()
val banco = Banco()
val hogar = HogarDulceHogar()

fun main(args: Array<String>) {
    println(bob)

    while (bob.oroRecolectado <= 3){

        iniciar()
        // pausa del sistema
        Thread.sleep(1000)

        // si el oro es 3, entonces lo depositará en el banco
        if(bob.oroRecolectado == 3){
            banco.depositar()
            Thread.sleep(1000)
        }

        // si la sed es mayor o igual a 5, Bob irá a la taberna a refrescarse
        if(bob.sed >= 5){
            taberna.refrescarse()
            Thread.sleep(1000)
            println(bob)
        }

        // si la fatiga es mayor o igual que 8, entonces descansará en su hogar
        if(bob.fatiga >= 8){
            hogar.descansar()
            Thread.sleep(1000)
            println(bob)
        }
    }
}

// Verificar si debe ir al banco o a la mina dependiendo de su oro
fun iniciar() {
    if(bob.oroRecolectado<3) {
        println("Minero Bob: De regreso a la mina de oro")
        mina.recolectarPepitas()

    }
}