package ex_18

open class Aircraft(number: String, maxRange: Int, tankCapacityFuel: Int) {
    val mNumber: String = number
    val mMaxRange: Int = maxRange
    val mTankCapacityFuel: Int = tankCapacityFuel
    val mConsumptionPer100: Int
        get() = (mTankCapacityFuel / mMaxRange) * 100
}