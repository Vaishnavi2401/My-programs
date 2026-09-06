
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class S implements Serializable {

    int i;
    String s;

    public S() {

    }

    public S(int i, String s) {
        this.i = i;
        this.s = s;
    }
}

public class SerializableDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        S s = new S(20, "SerializableDemo");

        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);

        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        S u = (S) ois.readObject();

        System.out.println(u.i + " " + u.s);

        oos.close();
        ois.close();

    }
}
