package ex_19

import ex_18.Aircraft

class Boeing747(number: String, maxRange: Int, tankCapacityFuel: Int, capacity: Int) : Aircraft(number, maxRange, tankCapacityFuel) {
    val mCapacity: Int = capacity
}