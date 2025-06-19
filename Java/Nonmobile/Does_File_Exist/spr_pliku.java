public class spr_pliku {

    public static void main(String[] args) {

        File file = new File("plik.txt");

        boolean exists = file.exists();
        System.out.println("Czy istnieje " + exists);

        String absolutePath = file.getAbsolutePath();
        System.out.println("Ten plik jest w: " + absolutePath);

        Scanner scanner = new Scanner(file);
        String linia1 = scanner.nextLine();

        PrintWriter writer = new PrintWriter(file);

        writer.println("Ala ma kota");
        writer.println("Kot ma Alę");

        writer.close();

    }
}
