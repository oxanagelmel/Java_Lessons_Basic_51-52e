package lesson9Dez13;

//Программа проверяющая язык

public class IfSwitchCaseLangTest {
    public static void main(String[] args) {
       String lang = "EN";
         if (lang.equals("EN")){
            System.out.println("Hello");//строго фиксированная строка/ число в " "
        } else if (lang.equals("GE")) {
            System.out.println("Hallo");
        } else if (lang.equals("SP")) {
            System.out.println("Hola");
        } else {
            System.out.println("not supported");
        }

        //JDK-7 - Java 7
        // String str = "EN"; нельзя забивать вместо "EN" - str так как это не строго фиксированная строка->не константа
        // str это изменяемая переменная
        // нельзя использовать 2 разных типа данных - только один, например только int
        switch (lang){
            case "EN": //строго фиксированная строка/ число в " "
                System.out.println("Hello");
                break; //прерви, как return вернуть
            case "GE":
                System.out.println("Hallo");
                break;
            case "SP":
                System.out.println("Hola");
                break;
            default:
                System.out.println("not supported");
        }

        //JDK-12 -> Java 12 -> ещё проще
        int aMonth = 3;
        switch (lang){
            case "EN" -> {
                switch (aMonth) {
                    case 1 -> System.out.println(1);
                }
                System.out.println("Hello");
            }
            case "GE" -> System.out.println("Hallo");
            case "SP" -> System.out.println("Hola");
            default -> System.out.println("not supported");
        }
        int month = 6;
        switch (month){
         // case 3:
         // case 4:
         // case 5:
            case 3, 4 ,5: { // в switch тоже может быть ветвление с {}
                if (lang.equals("EN")){
                    System.out.println("Spring");
                } else {
                    System.out.println("Frühling");
                }
            }
        }
        // switch case не всегда подходит на пример:
        if (month > 7){
            ///
        }

        // Пример: до JDK-17 использовался только один тип, теперь это изменилось
        //         Используется когда программа, принимает различные объекты например калькулятор
        Object o = "Str";
        o = 12;
        switch (o) {
            case Integer i -> System.out.println("int");
            case String s -> System.out.println("string");
            default -> System.out.println("");
        }
        // Switch case
        // можно использовать если хотим сделать какую то обработку, времена года, каталог в магазине (строго фикс.)
        // можно и без него обойтись
    }
}
