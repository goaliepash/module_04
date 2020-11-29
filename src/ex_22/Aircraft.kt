package ex_22

open class Aircraft(number: String, maxRange: Int, tankCapacityFuel: Int) {
    protected val mNumber: String = number
    protected val mMaxRange: Int = maxRange
    protected val mTankCapacityFuel: Int = tankCapacityFuel
    protected val mConsumptionPer100: Int
        get() = (mTankCapacityFuel / mMaxRange) * 100

    open fun info() {
        println("Номер воздушного судна: $mNumber\n" +
                "Максимальная дальность полета: $mMaxRange\n" +
                "Вместимость бака: $mTankCapacityFuel\n" +
                "Расход топлива на 100 км: $mConsumptionPer100")
    }
}