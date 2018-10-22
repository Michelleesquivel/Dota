package main


import partidos.Partido
import heroes.Heroe
import equipos.equipo


var wantstoContinue = true
var intro = Partido()
var juego = Partido()


fun main(args: Array<String>) {
    intro.initList()
    //Menu principal
    do{
        println("Bienvanid@ a Dota\n")
        println("Menu Principal\n")
        println("1. Jugar\n")
        println("2. Salir\n")
        println("Ingrese el numero de la opcion que desea: ")
        val option = readLine()!!.toInt()
    //El usuario desea jugar
        if(option == 1) {
            var l1: ArrayList<String> = ArrayList()
            var l2: ArrayList<String> = ArrayList()
            intro.bienvenida(l1, l2)
            juego.empezarJuego()

           //Si el usuario desea salir del juego
        }else if(option == 2){
            println("Gracias por jugar con nosotros")
            wantstoContinue = false
        }

    }while (wantstoContinue)}



