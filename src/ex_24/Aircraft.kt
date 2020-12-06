package ex_24

open class Aircraft(number: String, maxRange: Int, tankCapacityFuel: Int) {
    val mNumber: String = number
    val mMaxRange: Int = maxRange
    val mTankCapacityFuel: Int = tankCapacityFuel
    val mConsumptionPer100: Int
        get() = (mTankCapacityFuel / mMaxRange) * 100

    open fun info() {
        println("Номер воздушного судна: $mNumber\n" +
                "Максимальная дальность полета: $mMaxRange\n" +
                "Вместимость бака: $mTankCapacityFuel\n" +
                "Расход топлива на 100 км: $mConsumptionPer100")
    }
}