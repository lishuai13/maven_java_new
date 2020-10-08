package compareTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Comparable接口：自然排序
 */
public class ComparableTest {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("liming", 90),
                new Student("xiaohong", 95),
                new Student("zhoubin", 88),
                new Student("xiaoli", 94)
        );
        // 排序前
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("---------------------------------");
        Collections.sort(studentList);
        // 排序后
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}


/**
 * 实体类实现Comparable接口，重写比较方法
 */
class Student implements Comparable<Student>{

    private String name;
    private int record;

    public Student() {
    }

    public Student(String name, int record) {
        this.name = name;
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", record=" + record +
                '}';
    }

    //按年龄进行排序，此处年龄是基本类型，compareTo是封装类型的方法，因此使用不了
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.record, o.record);
    }
}
