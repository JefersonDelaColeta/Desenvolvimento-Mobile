//1) Fazer um programa que receba um texto e retorne (exiba na tela) o
// mesmo de forma invertida, exemplo:
//   texto digitado:   Boa noite!
//   retorno:  !etion aoB

fun main(){
    inverter()
}

fun inverter(){
    println("Digite uma palavra para invertermos: ")
    var frase = readln()
   return println("O texto invertido é: " + frase.reversed())
}