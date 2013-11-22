package katahistograma;

public class HistogramBuilder<T> {
    

    
    public Histogram<T> build(T[]collection){
        Histogram <T> histogram = new Histogram<>();
        for (T item : collection) {
            histogram.put(item, histogram.get(item)+1);
        }
        return histogram;
    }
    
}
