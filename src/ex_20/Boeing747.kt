package ex_20

import ex_18.Aircraft

class Boeing747(number: String, maxRange: Int, tankCapacityFuel: Int, override val capacity: Int) :
    Aircraft(number, maxRange, tankCapacityFuel), Passenger