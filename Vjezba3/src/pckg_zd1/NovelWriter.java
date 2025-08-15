package pckg_zd1;

public class NovelWriter implements WriterInt{

    private String writer;

    public NovelWriter(String writer){
        this.writer=writer;
    }
    @Override
    public void writeNovel(int novelType) {
        switch (novelType){
            case 1:
                System.out.println(writer + " piše povijesnu novelu...");System.out.println("****************************************");
                break;



            case 2:
                System.out.println(writer + " piše triler novelu...");
                System.out.println("****************************************");
                break;


            case 3:
                System.out.println(writer + " piše romantičnu novelu...");
                System.out.println("****************************************");
                break;
            default:
                throw new IllegalArgumentException("Nrpodržan tip novele: " + novelType);


        }


    }

    @Override
    public String toString() {
        return "NovelWriter{" +
                "writer='" + writer + '\'' +
                '}';
    }
}
