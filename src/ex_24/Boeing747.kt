package ex_24

class Boeing747(number: String, maxRange: Int, tankCapacityFuel: Int, override val capacity: Int) :
        Aircraft(number, maxRange, tankCapacityFuel), Passenger {

    override fun info() {
        println("Номер воздушного судна: $mNumber\n" +
                "Максимальная дальность полета: $mMaxRange\n" +
                "Вместимость бака: $mTankCapacityFuel\n" +
                "Расход топлива на 100 км: $mConsumptionPer100\n" +
                "Количество пассажиров: $capacity")
    }
}