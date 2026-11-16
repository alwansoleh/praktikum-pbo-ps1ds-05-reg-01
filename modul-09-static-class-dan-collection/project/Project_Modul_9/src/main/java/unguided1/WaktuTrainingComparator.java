package unguided1;

import java.util.Comparator;

public class WaktuTrainingComparator implements Comparator<HasilEksperimen> {

    // Urutan: waktu training tercepat ke terlama
    @Override
    public int compare(HasilEksperimen a, HasilEksperimen b) {
        return Integer.compare(a.getWaktuTraining(), b.getWaktuTraining());
    }
}

