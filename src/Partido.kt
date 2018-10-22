package partidos

import ancients.Ancient
import heroes.Heroe
import narradores.narrador
import java.util.ArrayList
import equipos.equipo

class Partido (private var heroes1: ArrayList<Heroe> = ArrayList() ) {

    fun initList() {

        heroes1.add(Heroe("Axe", "Fuerza"))
        heroes1.add(Heroe("Tiny", "Fuerza"))
        heroes1.add(Heroe("Lycan", "Fuerza"))
        heroes1.add(Heroe("Abaddon", "Fuerza "))
        heroes1.add(Heroe("Kunkka", "Fuerza "))
        heroes1.add(Heroe("Chaos Knight", "Fuerza"))
        heroes1.add(Heroe("Earth Spirit", "Fuerza "))
        heroes1.add(Heroe("Chen", "Inteligencia"))
        heroes1.add(Heroe("Lina", "Inteligencia"))
        heroes1.add(Heroe("Lich", "Inteligencia"))
        heroes1.add(Heroe("Bane", "Inteligencia"))
        heroes1.add(Heroe("Enigma", "Inteligencia"))
        heroes1.add(Heroe("Zeus", "Inteligencia"))
        heroes1.add(Heroe("Queen of Pain", "Inteligencia"))
        heroes1.add(Heroe("Medusa", "Agilidad"))
        heroes1.add(Heroe("Sniper", "Agilidad"))
        heroes1.add(Heroe("Luna", "Agilidad"))
        heroes1.add(Heroe("Mirana", "Agilidad"))
        heroes1.add(Heroe("Drow Ranger", "Agilidad"))
        heroes1.add(Heroe("Viper", "Agilidad"))
        heroes1.add(Heroe("Razor", "Agilidad"))
    }

    fun bienvenida(heroesRadiant: ArrayList<String>, heroesDire: ArrayList<String>) {
        println("Bienvenid@ a una nueva partida de Dota")

        //Selección de heroes del equipo Radiant
        while (heroesRadiant.size < 5) {
            print(heroes1)
            print("\n")
            println("Escribe el nombre del heroe para el equipo Radiant: ")
            val selheroeR = readLine()!!.toString()
            heroesRadiant.add(selheroeR)
            print("Equipo Radiant")
            print(heroesRadiant)
            print("\n")
        }

        //Selección de heroes del equipo Dire
        while (heroesDire.size < 5) {
            print(heroes1)
            print("\n")
            println("Escribe el nombre del heroe para el equipo Dire: ")
            val selheroeD = readLine()!!.toString()
            heroesDire.add(selheroeD)
            print("Equipo Dire")
            print(heroesDire)
            print("\n")
        }
    }

    fun empezarJuego() {
        // Comienza el juego
//Narracion pendiente
        //Repetir hasta que un equipo pierde
        var perdio = true

        println("Bienvenid@ al maravilloso mundo de Dota")
        println("Ataque al heroe del equipo en contra")
            do {
                println("1. Ocurrieron muertes")
                println("2. Matan Torres")
                println("Ingrese la opcion que ocurrio: ")
                var juegosel = readLine()!!.toInt()
                if (juegosel == 1) {
                    println("¿Fue Radiant quien mato? 1.si/2.no: ")
                    var muertes = readLine()!!.toInt()
                    //Si radiant mato
                    if (muertes == 1) {
                        println("¿Cuántas muertes? (1-5)")
                        var cantidadmuertes = readLine()!!.toInt()
                        when (cantidadmuertes) {
                            1 -> {
                                //Cuando ocurre una Kill de Radiant
                                unKill(esRadiant = true)
                            }
                            (2-4)->{
                                // Cuando ocurren mas de dos kill pero menos que cinco por Radianr
                                masKill(esRadiant = true)
                            }
                            5 -> {
                                //Cuando Radian hace cinco kills
                                cincoKill(esRadiant = true)
                            }
                        }

                    }//Cuando mata Dire
                        else{println("¿Cuántas muertes? (1-5)")
                        var cantidadmuertes = readLine()!!.toInt()
                        when (cantidadmuertes) {
                            1 -> {
                                //Cuando ocurre una Kill de Dire
                                unKill(esRadiant = false)
                            }
                            (2-4)->{
                                // Cuando ocurren mas de dos kill pero menos que cinco por Dire
                                masKill(esRadiant = false)
                            }
                            5 -> {
                                //Cuando Dire hace cinco kills
                                cincoKill(esRadiant = false)
                            }
                        }

                    }
                }else if(juegosel == 2){ println("¿Fue Radiant quien mato? 1.si/2.no: ")
                    //Cuando se realiza una muerte a una Torre
                    var muertesTorres = readLine()!!.toInt()
                    if(muertesTorres == 1){
                        killTorre(esRadiant = true)
                    } else if(muertesTorres == 2){
                        killTorre(esRadiant = false)
                        //Cuando la torre no es Radiant
                    }

                } // Cuando ingresa un numero que no corresponde al propuesto
                    else{
                    println("Ingreso un dato incorrecto")
                }

            } while (perdio)
        }
    }

    fun unKill(esRadiant: Boolean){
        // Cuando un Radiant tuvo una kill
        val esRadiant = true
        if(esRadiant){
            println("Un Dire ha muerto")
        }else(esRadiant)
        println("Un Radiant ha muerto")
    }

    fun masKill(esRadiant: Boolean){
        //Ocurrieron de 2-4 kill por un Radiant
        val esRadiant = true
        if(esRadiant){
            println("Más de un Dire ha muerto")
        }//Cuando un Dire hace de 2-4 kills
        else{
            println("Más de un Radiant ha muerto")
        }

    }

    fun cincoKill(esRadiant: Boolean){
    // CUando un Radiant hace 5 kill
        val esRadiant = true
        if(esRadiant){
            println("Un Dire ha muerto")
        }//Cuando Dire hace 5 kills
        else{
            println("Cinco Radiant han muerto")
        }
    }

    fun killTorre(esRadiant: Boolean){
        // Cuando un Radiant mata una torre
        val esRadiant = true
        if(esRadiant){
            println("El equipo Radiant ha derrivado una Torre Dire")
        } // Cuando un dDire mata una torre Radiant
        else{
            println("El equipo Dire ha derivado una Torre Radiant")
        }
    }

    fun radiantWin(){
        println("Felicidades el equipo Rafiant ha ganado")

    }

    fun direWin(){
        println("Felicidades el equipo Dire ha ganado")
    }
