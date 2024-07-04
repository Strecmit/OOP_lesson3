package Streams;

import java.util.Comparator;

public class StreamComparator implements Comparator<StreamName> {

    public StreamComparator() {
    }

    @Override
    public int compare(StreamName o1, StreamName o2) {
        return o1.toString().compareTo(o2.toString());
    }

}
