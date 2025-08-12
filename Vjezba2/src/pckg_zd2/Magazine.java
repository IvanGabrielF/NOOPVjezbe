package pckg_zd2;

import java.util.ArrayList;
import java.util.List;

public abstract class Magazine implements Observable {

    private final String name;
    private final String freqLabel;
    private final List<ObserverInt> subs = new ArrayList<>();
    private int issueCnt = 0;

    protected Magazine(String name, String freqLabel) {
        this.name = name;
        this.freqLabel = freqLabel;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addSub(ObserverInt subscriber) {
        if (!subs.contains(subscriber)) {
            subs.add(subscriber);
        }
    }

    @Override
    public void removeSub(ObserverInt subscriber) {
        subs.remove(subscriber);
    }

    @Override
    public void notifySub(String issueLbl) {
        for (ObserverInt s : subs) {
            s.update(name, issueLbl);
        }
    }

    protected void releaseNewIssue() {
        issueCnt++;
        String label = freqLabel + " izdanje " + issueCnt;
        System.out.println(name + " - " + label + " je objavljeno!");
        notifySub(label);
    }
}
