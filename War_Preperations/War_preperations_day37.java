package War_Preperations;

public class War_preperations_day37 {
    public static void main(String[] args) {
        Sword sword1 = new Sword(Material.iron, Gemstone.none, 2, 6);
        Sword sword2 = new Sword(Material.steel, Gemstone.ruby, 85, 19);
        Sword sword3 = new Sword(Material.binarium, Gemstone.diamond, 55, 15);

        System.out.println(sword1.toString());
        System.out.println(sword2.toString());
        System.out.println(sword3.toString());
    }
}
