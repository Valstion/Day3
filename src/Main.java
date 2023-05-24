public class Main {
    public static void main(String[] args) {
        String vardas = "Jevgenij Diomin";
        System.out.println(vardas.toLowerCase());
        System.out.println(vardas.toUpperCase());
        System.out.println(vardas.charAt(0));
        System.out.println(vardas.contains("vge"));
        System.out.println(vardas.indexOf("g"));
        System.out.println(vardas.isBlank());
        System.out.println(vardas.isEmpty());
        System.out.println(vardas.length());
        System.out.println(vardas.repeat(5));
        System.out.println(vardas.split(" "));
        System.out.println(vardas.trim());
        System.out.println(vardas.substring(2, 4));
        System.out.println(vardas.substring(4));
        System.out.println(vardas.substring(vardas.length() - 3));
        System.out.println(vardas.length());
        String city = "      kauNAS     ";
        System.out.println(city);
        System.out.println(city.trim());
        System.out.println(city.trim().charAt(0) + "".toUpperCase());
        System.out.println(city.trim().substring(0, 1).toUpperCase() + city.trim().substring(1));
        city = city.trim();
        String firstLetter = city.substring(0, 1).toUpperCase();
        String restOfTheText = city.substring(1).toLowerCase();
        System.out.println("-------------------------------------------------------------------");
        System.out.println(firstLetter + restOfTheText);
        String phoNo = "+370 (635) 78895";
        System.out.println(phoNo.replace("(", "["));
        System.out.println(phoNo);
        System.out.println(city.replaceAll("a", "i"));
        System.out.println(phoNo.replace("(", "").replace(")", "").replace(" ", ""));

        System.out.println("____________________________________________________________________________________________________________");
        System.out.println(phoNo.replaceAll("[^[-+]?0-9]", ""));
        if (phoNo.substring(0, 3) == "370") {
            phoNo = phoNo.substring(3);
        }
        if (phoNo.substring(0, 1).equals("8")) {
            phoNo = phoNo.substring(1);
        }
        System.out.println(phoNo);

    }
}
