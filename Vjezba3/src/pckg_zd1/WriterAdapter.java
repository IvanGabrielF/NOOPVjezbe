package pckg_zd1;

public class WriterAdapter implements WriterInt{


    private OldNovelist oldNovelist;

    public WriterAdapter(OldNovelist oldNovelist){
        this.oldNovelist = oldNovelist;
    }
    @Override
    public void writeNovel(int novelType) {
        oldNovelist.writeSFNovel();
    }
}
