package katahistograma;

public class HistogramViewer<T> {
    public void show (Histogram<T> histogram){
        for (T item : histogram.keySet()) {
            System.out.println(item + "");
        }
        
    }
}
