package Learn;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/4 14:21
 * Description:
 */
public enum LearnEnum {

    Wang("A",12),Li("B",13);

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    LearnEnum(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "LearnEnum{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
