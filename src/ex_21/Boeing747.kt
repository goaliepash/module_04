package ex_21

import ex_18.Aircraft
import ex_20.Passenger

class Boeing747(number: String, maxRange: Int, tankCapacityFuel: Int, override val capacity: Int) :
    Aircraft(number, maxRange, tankCapacityFuel), Passenger

