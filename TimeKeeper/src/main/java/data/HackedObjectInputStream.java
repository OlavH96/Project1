package data;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class HackedObjectInputStream extends ObjectInputStream {

    public HackedObjectInputStream(InputStream in) throws IOException {
        super(in);
    }

   /* @Override
    protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
        ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();

        System.out.println(resultClassDescriptor);


            resultClassDescriptor = ObjectStreamClass.lookup(data.Event.class);


        return resultClassDescriptor;
    }*/
}