package by.itstep.javatraining.revision.task;

/*	Task 09. The Count of Local Maximus [количество локальных максимумов]
 *
 *	Элемент последовательности называется локальным максимумом,
 *	если он строго больше предыдущего и последующего элемента
 *	последовательности. Первый и последний элемент последовательности
 *	не являются локальными максимумами по определению.
 *	Дано целое число. Необходимо подсчитать количество строгих локальных
 *	максимумов среди цифр заданного числа.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено количество строгих локальных максимумов.
 *
 *	[ input 1]: 2414241
 *	[output 1]: 3
 *
 *	[ input 2]: 131131
 *	[output 2]: 2
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -13245
 *	[output 4]: 1
 *
 *	[ input 5]: 12345
 *	[output 5]: 0
 */

public class Task09 {
    public static int task09(long number) {
        if (number < 0) {
            number = -number;
        }

        int firstNumber = (int) (number % 10);
        int secondNumber = (int) (number / 10 % 10);
        int thirdNumber = (int) (number / 100 % 10);
        int count = 0;
        while (number > 100) {
            if (secondNumber > firstNumber && secondNumber > thirdNumber) {
                count++;
            }
            number /= 10;
            int temp = (int) (number / 100 % 10);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = temp;
        }
        return count;
    }
}

