import Streams.*;
import java.util.*;

public class MainStream {

    public static void main(String[] args) {

        Comparator<StreamName> compareById = new Comparator<StreamName>() {

            @Override
            public int compare(StreamName o1, StreamName o2) {
                return o1.id - o2.id;
            }
        };
        Comparator<StreamName> compareByName = new Comparator<StreamName>() {

            @Override
            public int compare(StreamName o1, StreamName o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Stream stream1 = new Stream();

        StreamName group_A = new StreamName(1, "Альфа");
        StreamName group_B = new StreamName(2, "Бета");
        StreamName group_G = new StreamName(3, "Гамма");
        StreamName group_D = new StreamName(4, "Дельта");
        StreamName group_E = new StreamName(5, "Эпсилон");
        StreamName group_J = new StreamName(6, "Дзета");

        stream1.addStreamName(group_A);
        stream1.addStreamName(group_E);
        stream1.addStreamName(group_B);
        stream1.addStreamName(group_J);
        stream1.addStreamName(group_D);
        stream1.addStreamName(group_G);

       // System.out.println("size: " + stream1.size());

        //System.out.println(stream1.getName(3));

        System.out.println("for-each Поток 1:");

        for (StreamName streamName:stream1){
           System.out.print(streamName.toString());
        }
        System.out.println();
        ArrayList<StreamName> arrStreamName = new ArrayList<>(List.of(group_E, group_J, group_A, group_D, group_B, group_G));
        System.out.println("До сортировки: "+arrStreamName);
        Collections.sort(arrStreamName, compareById);
        System.out.println("После сортировки по ID: "+arrStreamName);
        Collections.sort(arrStreamName, compareByName);
        System.out.println("После сортировки по имени: "+arrStreamName);
        Collections.sort(arrStreamName);
        System.out.println("После сортировки по длине имени: "+arrStreamName);


        //System.out.print("id " + group_E.id +" "+ group_E.name);


    }
}
