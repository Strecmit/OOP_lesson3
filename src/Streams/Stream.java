package Streams;

import java.util.Iterator;

public class Stream implements Iterable<Stream> {
    public String streamName;
    public int streamId;

    public Stream (int streamId, String streamName){
        this.streamId = streamId;
        this.streamName = streamName;
    }


    @Override
    public Iterator<Stream> iterator() {
        return null;
    }
}
