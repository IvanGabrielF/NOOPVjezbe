package pckg_zd4;

public interface RepositoryObservable {

    void addDeveloper(Developer developer);
    void removeDeveloper(Developer developer);
    void notifyDevelopers(String changeDesc, String currentCode, Developer author);

}
