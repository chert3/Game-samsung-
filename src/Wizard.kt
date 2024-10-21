class Wizard(health: Float, power: Int, mana: Float): Human() {
    override var health = health
    override val power = power
    var mana = mana

    override fun attack(): Int {
        return power
    }

    override fun heal() {
        health += mana/2
        mana -= mana/2
    }

    override fun toString(): String {
        return "HEALTH: ${health} POWER: ${power} MANA: ${mana}"
    }
}