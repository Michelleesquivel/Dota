package equipos
import heroes.Heroe
import torres.Torre
import ancients.Ancient
import partidos.Partido

class equipo ( var name: String, private var heroesRadiant: ArrayList<Heroe> = ArrayList(),
              torreq: Int, ancient: Ancient,
              private var heroesDire: ArrayList<Heroe> = ArrayList()){
    fun equipo1(name: String, heroesRadiant: ArrayList<Heroe>, torreq: Int,ancient: Ancient){
        var name = "Radiant"
        var heroesRadiant: ArrayList<Heroe>
        var torreq = 6
        var ancient: Ancient

    }

    fun equipo2(name: String, heroesDire: ArrayList<Heroe>, torreq: Int,ancient: Ancient){
        var name = "Dire"
        var heroesDire: ArrayList<Heroe>
        var torreq = 6
        var ancient: Ancient

    }

}