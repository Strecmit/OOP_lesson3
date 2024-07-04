package Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StreamName> {

    public ArrayList streamNames = new ArrayList();
    public void addStreamName(StreamName streamName) {
        streamNames.add(streamName);

    }
    public int size(){
        int size = streamNames.size();
        return size;
    }

    public String getName(int i){
        return streamNames.get(i).toString();
    }
    @Override
    public Iterator<StreamName> iterator() {
        return new StreamIterator(this);
        }
    }


