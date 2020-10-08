package compareTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Comparator定制比较器
 */
public class ComparatorTest {

    public static void main(String[] args) {
        List<Student2> studentList = Arrays.asList(new Student2("liming", 90),
                new Student2("xiaohong", 95),
                new Student2("zhoubin", 88),
                new Student2("xiaoli", 94)
        );
        for (Student2 student2 : studentList) {
            System.out.println(student2);
        }

        System.out.println("----------------------------------");

        // 1. 可以实现自己的外部接口进行排序
        studentList.sort(new AscComparator());

        for (Student2 student2 : studentList) {
            System.out.println(student2);
        }

//        System.out.println("----------------------------------");
//        // 2、 可以lambda实现自定义排序,反排
//        studentList.sort((stu1, stu2) -> stu2.getRecord() - stu1.getRecord());
//        System.out.println(studentList);
    }
}

/**
 * 定制比较器，实现Comparator接口
 */
class AscComparator implements Comparator<Student2> {

    @Override
    public int compare(Student2 stu1, Student2 stu2) {

        // 根据成绩降序排列,因为成绩不是封装类型，就需要使用Integer方法
        return Integer.compare(stu2.getRecord(),stu1.getRecord());

    }

}

/**
 * 实体类
 */
class Student2 {

    private String name;
    private int record;

    public Student2() {
    }

    public Student2(String name, int record) {
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
        return "Student2{" +
                "name='" + name + '\'' +
                ", record=" + record +
                '}';
    }


}


