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
        System.out.println("____________________________________________________________________________________________________________");

        String names1 = "Jevgenij";
        String surName1 = "Diomin";
        int name2 = names1.length();
        int surName2 = surName1.length();
        if(name2 > surName2) {
            System.out.println(surName1);
        }else {
            System.out.println(names1);
        }
        System.out.println("____________________________________________________________________________________________________________");
        System.out.println(surName1.toLowerCase());
        System.out.println(names1.toUpperCase());
        System.out.println("____________________________________________________________________________________________________________");
        String nameSur3;
        nameSur3 =  names1.charAt(0) + "" + surName1.charAt(0) ;
        System.out.println(nameSur3);
        System.out.println("_______________4_____________________________________________________________________________________________");

        String nameSur4 = "";
        int length12 = names1.length();
        int length13 = surName1.length();
        System.out.println(length12);
        System.out.println(length13);
        nameSur4 += names1.substring(length12-3);
        nameSur4 += surName1.substring(length13-3);



       System.out.println(nameSur4);
        System.out.println("____________________________________________________________________________________________________________");

       String aap = "An American in Paris";
        System.out.println(aap.replaceAll("[Aa]", "*"));
        System.out.println("____________________________________________________________________________________________________________");
        System.out.println(aap.replaceAll("[AaOoEeUuYyIi]", ""));
        String aap1 = "Breakfast at Tiffany's";
        String aap2 = "2001: A Space Odyssey";
        String aap3 = "It's a Wonderful Life";
        System.out.println(aap1.replaceAll("[A a O o E e U u Y y I i]", ""));
        System.out.println(aap2.replaceAll("[A a O o E e U u Y y I i]", ""));
        System.out.println(aap3.replaceAll("[A a O o E e U u Y y I i]", ""));
        System.out.println("____________________________________________________________________________________________________________");

        String starWars = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(starWars);
        System.out.println(starWars.replaceAll("[^?[0-9]]" , ""));
    }
}
