package ex_18

/*
    Задание 18: Авиакомпания 2. Конструктор

    Усовершенствуйте программу для авиакомпании. Пусть свойства: номер воздушного судна, максимальная дальность полета
    и вместимость бака определяются через конструктор. Для этих свойств значения определять не надо.
 */

fun main() {
    val aircraft = Aircraft("RA-89014", 4600, 15805)
    print(aircraft.mConsumptionPer100)
}