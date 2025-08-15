package pckg_zd1;

public class AppClient {

    public static void main(String[] args) {

        NovelWriter novelist = new NovelWriter("Pisac");

        novelist.writeNovel(2);
        novelist.writeNovel(1);

        WriterAdapter adapter = new WriterAdapter(new OldNovelist("SF pisac"));
        adapter.writeNovel(32);
    }
}
