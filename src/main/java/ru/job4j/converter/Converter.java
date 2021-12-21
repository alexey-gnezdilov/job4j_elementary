package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        /*float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(150);
        System.out.println("140 rubles are " + euro + " euro. ");
        System.out.println("150 rubles are " + dollar + " dollars. ");*/

        float inRublesForEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inRublesForEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);

        float inRublesForDollar = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(inRublesForDollar);
        boolean paasedDollar = expectedDollar == outDollar;
        System.out.println("180 rubles are 3 dollar. Test result : " + paasedDollar);
    }
}
