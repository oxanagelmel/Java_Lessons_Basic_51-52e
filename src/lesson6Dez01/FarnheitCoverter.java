package lesson6Dez01;
//4) напишите класс с методами для конвертации градусы цельсия в фаренгейты
//   и метод для конвертации фаренгейтов в цельсия
//   (Фаренгейт — 32) : 1,8 = Цельсий   Пример: (50°F - 32) : 1,8 = 10°C
//   Цельсий х 1,8 + 32 = Фаренгейт     Пример: 10°C x 1,8 + 32 = 50°F
//5) напишите метод для получения суммы трех чисел
public class FarnheitCoverter {

    int fromCelsius(int celc) {
        return (int)(celc * 1.8 +32);
    }
    int toCelcius(int farenheit) {
        return (int)((farenheit - 32) / 1.8);
    }
}
