package ex_17

class Aircraft {
    val mNumber: String = "RA-89014"
    val mMaxRange: Int = 4600
    val mTankCapacityFuel: Int = 15805
    val mConsumptionPer100: Int
        get() = (15805 / 4600) * 100
}