package pckg_zd4;

public interface DeveloperObserver {
    void onRepositoryUpdate(String repositoryName, String changeDesc, String currentCode, String timestamp, Developer author);


}
