class Robot(health: Float, power: Int): Human() {
    override var health = health
    override val power = power
    var battery: Int = 100

    override fun attack(): Int {
        battery -= 5
        return power
    }
    override fun heal() {
        health += health
        battery -= 30
        if (battery < 0) {health = 0.0F
        }
    }

    override fun toString(): String {
        return "HEALTH: ${health} POWER: ${power} BATTERY: ${battery}"
    }

}