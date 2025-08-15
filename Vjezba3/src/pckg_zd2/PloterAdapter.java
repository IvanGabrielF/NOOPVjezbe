package pckg_zd2;

public class PloterAdapter implements Ispis{

    private StariPloter stariPloter;

    public PloterAdapter(StariPloter stariPloter){
        this.stariPloter = stariPloter;
    }
    @Override
    public void ispisGrafike() {
        stariPloter.plotGrapihcs();

    }
}
