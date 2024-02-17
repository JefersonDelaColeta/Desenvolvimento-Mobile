//2) Faça a soma de todos os números em um intervalo de 1 até 300

fun main(){
    var somaTotal = 0
    var step = 1

    while(step <= 300)
    {
        somaTotal+=step
        step++
    }

    println("A soma de todos os números é de: " + somaTotal)
}

