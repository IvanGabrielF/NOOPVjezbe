package pckg_zd4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RepositoryProject implements RepositoryObservable {

    private final String projectName;
    private final ArrayList<Developer> developerList = new ArrayList<>();
    private String currentCode;

    public RepositoryProject(String projectName, String initialCode) {
        this.projectName = projectName;
        this.currentCode = initialCode;
    }

    @Override
    public void addDeveloper(Developer developer) {
        if (!developerList.contains(developer)) {
            developerList.add(developer);
        }
    }

    @Override
    public void removeDeveloper(Developer developer) {
        developerList.remove(developer);
    }

    @Override
    public void notifyDevelopers(String changeDescription, String currentCode, Developer author) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        for (Developer developer : developerList) {
            developer.onRepositoryUpdate(projectName, changeDescription, currentCode, timestamp, author);
        }
    }

    public void commitChange(String changeDescription, String newCode, Developer author) {
        this.currentCode = newCode;
        notifyDevelopers(changeDescription, currentCode, author);
    }

    public String getCurrentCode() {
        return currentCode;
    }
}
