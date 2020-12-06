package ex_24

class An124(number: String, maxRange: Int, tankCapacityFuel: Int, override val carrying: Int) :
        Aircraft(number, maxRange, tankCapacityFuel), Cargo {

    override fun info() {
        println("Номер воздушного судна: $mNumber\n" +
                "Максимальная дальность полета: $mMaxRange\n" +
                "Вместимость бака: $mTankCapacityFuel\n" +
                "Расход топлива на 100 км: $mConsumptionPer100\n" +
                "Грузоподъёмность: $carrying")
    }
}