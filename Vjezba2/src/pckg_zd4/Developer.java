package pckg_zd4;

public class Developer implements DeveloperObserver{


    private final String nickname;
    private final String emailAddress;

    public Developer(String nickname, String emailAddress){
        this.nickname = nickname;
        this.emailAddress = emailAddress;
    }
    @Override
    public void onRepositoryUpdate(String repositoryName, String changeDesc, String currentCode, String timestamp, Developer author) {
        System.out.println("-----Notification---------");
        System.out.println("Repository: " + repositoryName);
        System.out.println("Author of change: " + author.getNickname() + " (" + timestamp + ">");
        System.out.println("Description: " + changeDesc);
        System.out.println("Current code: " + currentCode);
        System.out.println("Notification sent to: " + nickname + " <" + emailAddress + ">");
        System.out.println("-------------------------");


    }

    public String getNickname(){
        return  nickname;
    }
    public String getEmailAddress(){
        return emailAddress;

    }
}
