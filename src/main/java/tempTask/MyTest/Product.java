package tempTask.MyTest;

import lombok.Data;

import java.util.List;

@Data
public class Product {

    private Integer id;

    private Integer parentId;

    private String Level;

    private String name;

    private List<Product> childList;
}
