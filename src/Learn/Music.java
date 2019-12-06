package Learn;


import java.util.Collection;

public class Music<T,K> {

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    private T id;
    private K name;


    public static void main(String[] args) {
        Music<String,Integer> music = new Music<>();
        music.setId("a");
        System.out.println(1<<4);

        String a = new String("abc");
        String b = "abc";
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
