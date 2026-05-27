package computer.bad_code;

public class Main {
    public static void main(String[] args) {



        // Parametre sırası hataya çok açık
        Computer hp = new Computer(
                "İntel i7",
                "16GB",
                "512gb",
                "450GRTX",
                true, // Okunabilirlik düşük, hangisi true hangisi false.
                false
        );


        // burdaki örnekte olduğu gibi bu bilgisayarda bir GPU yok ve kullanmak şartı ile GPU da "null" pas etmek zorunda kaldık.
        Computer mac = new Computer(
            "m3",
                "8gb",
                "256gb",
                null,
                true,
                true
                );

        // Her bilgisayarda GPU olmayabilir --- apple silicon işlemcili olabilir. cpu içine göünülü
        // bu durumda GPU için null geçmemiz gerkeir.


    }
}
