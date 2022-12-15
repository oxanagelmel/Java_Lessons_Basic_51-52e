package lesson8Dez08;

public class LangTest {
    public static void main(String[] args) {
        String lang = "EN";
        if (lang.equals("EN")){
            System.out.println("Hello");
        } else if (lang.equals("GE")) {
            System.out.println("Hallo");
        } else if (lang.equals("SP")) {
            System.out.println("Hola");
        } else {
            System.out.println("not supported");
        }

      /*  switch (lang){
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
        int month = 6;
        switch (month){
         // case 3:
         // case 4:
         // case 5:
            case 3, 4 ,5:
                System.out.println("Spring");
        }*/

    }
}
