package ex_21

/*
    Задание 21: Авиакомпания 5. Абстрактный класс

    Усовершенствуем программу так, чтобы нельзя было создать неопределенный тип самолета: сделайте класс Aircraft
    абстрактным.
 */

fun main() {
    val boeing = Boeing747("RA-89014", 4600, 15805, 660)
    print(boeing.capacity)
}