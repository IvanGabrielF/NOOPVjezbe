package pckg_zd1;

public class OldNovelist {

    private String name;

    public OldNovelist(String writer){
        this.name=writer;
    }

    public void writeSFNovel(){
        System.out.println(name + " piše Sf novelu..");

        System.out.println("************************************");
    }

    @Override
    public String toString() {
        return "OldNovelist{" +
                "name='" + name + '\'' +
                '}';
    }
}

