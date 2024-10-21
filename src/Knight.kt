class Knight(health: Float, power: Int, defence: Int): Human() {
    override var health = health + defence/10
    override val power = power
    val defence = defence

    override fun attack(): Int {
        return power
    }

    override fun heal() {
        health += health/5 + defence/10
    }

    override fun toString(): String {
        return "HEALTH: ${health} POWER: ${power} DEFENCE: ${defence}"
    }
}