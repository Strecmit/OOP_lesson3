package Streams;

//import Students.*;
import java.util.Iterator;

public class StreamIterator implements Iterator<StreamName> {

    private Stream stream;
    public StreamIterator(Stream stream){

        this.stream = stream;
    }
    private int indexS = 0;


    private StreamName[] getStreamNames(){
        String[] namesS = stream.streamNames.toString().split(" ");

        StreamName[] streamNames = new StreamName[namesS.length];

        int id = 0;

        for (String name: namesS){
            streamNames[id] = new StreamName(id, name);
            id++;
        }
        return streamNames;
    }


    @Override
    public boolean hasNext() {
        return indexS < getStreamNames().length;
    }

    @Override
    public StreamName next() {
        StreamName[] streamNames = getStreamNames();
        return streamNames[indexS++];
    }
}
