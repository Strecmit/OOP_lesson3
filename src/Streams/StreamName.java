package Streams;

public class StreamName implements Comparable<StreamName>{

    public String name;
    public int id;

    public StreamName(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(StreamName o) {
        return this.name.length() - o.name.length();
    }
}
