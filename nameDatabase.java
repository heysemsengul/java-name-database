package PersonalProjects;

public class nameDatabase {

    private static nameDatabase instance;

    private String[] firstNames = {"Ahmet", "Mehmet", "Ayse", "Fatma"};
    private String[] lastNames  = {"Yilmaz", "Kahraman", "Demir", "Celik"};

    /* private */ nameDatabase() {
   // if you add private you can only call it with getInstance // 	
    }

    public static nameDatabase getInstance() {
        if (instance == null) {
            instance = new nameDatabase();
        }
        return instance;
    }

    public String generateName() {
        int randomFirstIndex = (int)(Math.random() * firstNames.length);
        int randomLastIndex  = (int)(Math.random() * lastNames.length);
        return firstNames[randomFirstIndex] + " " + lastNames[randomLastIndex];
    }

    public void printAll() {
        System.out.println("=== First Names ===");
        for (int i = 0; i < firstNames.length; i++)
            System.out.println("  " + (i + 1) + ". " + firstNames[i]);

        System.out.println("=== Last Names ===");
        for (int i = 0; i < lastNames.length; i++)
            System.out.println("  " + (i + 1) + ". " + lastNames[i]);
    }
}