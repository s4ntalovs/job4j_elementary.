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
        float Dollar = Converter.rubleToDollar(140);
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");    
        System.out.println("140 rubles are " + Dollar + " Dollar.");
    }
}
