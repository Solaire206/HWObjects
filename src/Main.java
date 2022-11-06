public class Main {

    public static void main(String[] args) {
        String authorKb = "Клайв Баркер";
        int yearKb = 1990;

        String authorDm = "Джордж Мартин";
        int yearDm = 1996;

        String[] authors = {"Клайв Баркер" , " Джордж Мартин" };
        int[] years = {1990, 1996};
        for (int i = 0; i < authors.length; i++) {
            System.out.println(" Автор - " + authors[i] + " ,год - " + years[i]);
        }
        Book kb = new Book("Клайв Баркер", 1990);
        kb.author = "Клайв Баркер";
        System.out.println("kb.author = " + kb.getAuthor());
        kb.year = 1990;
        System.out.println("kb.year = " + kb.getYear());

        Book dm = new Book("Джордж Мартин", 1996);
        dm.author = "Джордж Мартин";
        System.out.println("dm.author = " + dm.getAuthor());
        dm.year = 1996;
        System.out.println("dm.year = " + dm.getYear());
        dm.setYear(1997);
        System.out.println("dm.getYear() = " + dm.getYear());

    }
}