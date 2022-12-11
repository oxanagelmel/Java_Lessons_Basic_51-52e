package lesson6Dez01;

public class Converter {
    // euro/usd = 1.02 -> 100eur = 102usd -> 100 * 1.02 -> соотнощение
    // 100usd -> 98.04eur    = 100 / 1.02
    // конвертировать из доллара в евро -> toEur
    // конвертировать из евро в доллар -> toUsd

 //можно так
 /*   public double toEur(double usd){ //100usd
        return usd / 1.02; //~98 eur
    }
    public double toUsd(double eur){ //100eur
        return eur * 1.02; // 102 usd
    }
 */
    //но можно и умнее, чтобы не записывать число в ручную
    private double rate; //= 1.02; //записываем зафиксированный курс обмена и пишим внизу this.rate

    public Converter(double rate){ //задаём извне курс обмена, в момент создания
        this.rate = rate;
    }
    public double toEur(double usd){ //100usd
        return usd / this.rate; //~98 eur
    }
    public double toUsd(double eur){ //100eur
        return eur * this.rate; // 102 usd
    }

}
