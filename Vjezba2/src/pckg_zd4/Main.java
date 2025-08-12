package pckg_zd4;

public class Main {
    public static void main(String[] args) {
        RepositoryProject repository = new RepositoryProject("JavaNotes", "// initial code...");

        Developer developerMira = new Developer("Mira", "mira@example.com");
        Developer developerLuka = new Developer("Luka", "luka@example.com");
        Developer developerEma  = new Developer("Ema",  "ema@example.com");

        repository.addDeveloper(developerMira);
        repository.addDeveloper(developerLuka);
        repository.addDeveloper(developerEma);

        repository.commitChange("Bug fix: login NullPointerException", "// fixed login...", developerMira);

        repository.removeDeveloper(developerLuka);

        repository.commitChange("Feature: PDF export", "// pdf export implementation...", developerEma);

        repository.addDeveloper(developerLuka);

        repository.commitChange("Performance improvement: caching layer", "// added caching...", developerMira);
    }
}
