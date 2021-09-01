package json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.*;

public class JsonToMap {

    public static void main(String[] args) {

        String str = "test";

        Student student1 = new Student(1, "1111", "112");
        Student student2 = new Student(2, "2222", "112");
        Student student3 = new Student(3, "3333", "112");
        List<Student> students = Arrays.asList(student1, student2, student3);

        Map<String,String > map = new HashMap<>();
        map.put("1","lishuai");
        map.put("2","gggw");

        String json = JsonUtils.getJson(str);
        String json2 = JsonUtils.getJson(students);
        String json3 = JsonUtils.getJson(map);

        System.out.println(json);
        System.out.println(json2);
        System.out.println(json3);
        System.out.println("====================");

        String  str1 = (String) JSON.parse(json);
        System.out.println(str1);

        System.out.println("====================");

        List<Student> ts = JSONArray.parseArray(json2, Student.class);

        ts.forEach(v-> {
            System.out.println(v.toString());
            System.out.println("-----------");
        });

        System.out.println("====================");

        Map maps = (Map) JSON.parse(json3);
        map.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
            System.out.println("-----------------");
        });
    }
}
