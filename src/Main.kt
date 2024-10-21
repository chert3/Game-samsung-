import kotlin.math.round
import kotlin.math.roundToInt
import kotlin.random.Random

fun game() {
    println("game")
    val player: Human = choose_character("fighter")
    val enemy: Human = choose_character("enemy")
    var input: String?

    while ((player.health > 0) and (enemy.health > 0)) {
        println("""
            PLAYER'S ${player.toString()}
            ENEMY'S ${enemy.toString()}
        """.trimIndent())
        println("choose to attack or to heal [attack/heal]")
        input = readLine()
        when (input){
            "attack" -> enemy.health -= player.attack()
            "heal" -> player.heal()
            else -> println("wrong input, you skip your turn")
        }
        player.health -= enemy.attack()
    }

    //finish
    if (enemy.health <= 0) {
        println("you won")
    }
    else {
        println("you lost")
    }

    println("again? [y]")
    input = readLine()
    if (input == "y") game()



}

fun choose_character(who: String):Human {
    lateinit var c:Human
    val characters = arrayOf("wizard", "robot", "knight")
    var input: String?

    do {
        println("choose your $who (wizard, robot, knight)")
        input = readLine()
        when (input) {
            "wizard" -> c = Wizard(20F, Random.nextInt(3, 7), 20F)
            "robot" -> c = Robot(20F, Random.nextInt(3, 7))
            "knight" -> c = Knight(20F, Random.nextInt(3, 7), (Random.nextFloat() * 100).roundToInt())
        }
    } while (input !in characters)

    return c
}

fun main() {
    game()
}
