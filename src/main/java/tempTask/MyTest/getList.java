package tempTask.MyTest;


import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class getList {

    private static List<Product2> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Testpoi testpoi = new Testpoi();

        //读取excel表格数据到List<Map<String, String>>
        List<Map<String, String>> list = testpoi.getExcelTOList();

        //处理List为树型结构
        int i = 1;
        //遍历解析出来的list
        List<Product> products = new ArrayList<>();
        for (Map<String, String> map : list) {

            String name1 = map.get("一级品类");
            if (name1!=null &&  (!name1.equals("")) ) {
                boolean flag = false;
                for (Product product : products) {
                    if (product.getName().equals(name1)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    Product product = new Product();
                    product.setParentId(0);
                    product.setId(i++);
                    product.setLevel("1");
                    product.setName(name1);
                    products.add(product);
                }


                String name2 = map.get("二级品类");
                if ( name2!=null && (!name2.equals("")) ) {
                    boolean flag2 = false;
                    for (Product product : products) {
                        if (product.getName().equals(name2)) {
                            flag2 = true;
                            break;
                        }
                    }
                    if (!flag2) {
                        Product product = new Product();
                        product.setId(i++);
                        product.setLevel("2");
                        product.setName(name2);
                        Product parent = new Product();
                        for (Product product2 : products) {
                            if (product2.getName().equals(name1)) {
                                parent = product2;
                                break;
                            }
                        }
                        product.setParentId(parent.getId());
                        List<Product> childList = parent.getChildList();
                        if (childList==null){
                            List<Product> childList2 = new ArrayList<>();
                            childList2.add(product);
                            parent.setChildList(childList2);
                        }else{
                            childList.add(product);
                            parent.setChildList(childList);
                        }
                        products.add(product);
                    }

                    String name3 = map.get("三级品类");
                    if ( name3!=null && (!name3.equals(""))  ) {
                        boolean flag3 = false;
                        for (Product product : products) {
                            if (product.getName().equals(name3)) {
                                flag3 = true;
                                break;
                            }
                        }
                        if (!flag3) {
                            Product product = new Product();
                            product.setId(i++);
                            product.setLevel("3");
                            product.setName(name3);
                            Product parent = new Product();
                            for (Product product2 : products) {
                                if (product2.getName().equals(name2)) {
                                    parent = product2;
                                    break;
                                }
                            }
                            product.setParentId(parent.getId());
                            List<Product> childList = parent.getChildList();
                            if (childList==null){
                                List<Product> childList2 = new ArrayList<>();
                                childList2.add(product);
                                parent.setChildList(childList2);
                            }else{
                                childList.add(product);
                                parent.setChildList(childList);
                            }
                            products.add(product);
                        }

                        String name4 = map.get("四级品类");
                        if ( name4!=null && (!name4.equals(""))  ) {
                            boolean flag4 = false;
                            for (Product product : products) {
                                if (product.getName().equals(name4)) {
                                    flag4 = true;
                                    break;
                                }
                            }
                            if (!flag4) {
                                Product product = new Product();
                                product.setId(i++);
                                product.setLevel("4");
                                product.setName(name4);
                                Product parent = new Product();
                                for (Product product2 : products) {
                                    if (product2.getName().equals(name3)) {
                                        parent = product2;
                                        break;
                                    }
                                }
                                product.setParentId(parent.getId());
                                List<Product> childList = parent.getChildList();
                                if (childList==null){
                                    List<Product> childList2 = new ArrayList<>();
                                    childList2.add(product);
                                    parent.setChildList(childList2);
                                }else{
                                    childList.add(product);
                                    parent.setChildList(childList);
                                }
                                products.add(product);
                            }
                        }
                    }
                }
            }
        }

        for (Product product : products){
            System.out.println(product.toString());
        }

        //只保留父级为空的树
        products.removeIf(product -> product.getParentId() != 0);

        //遍历数组转换成父子关系
        for (Product product: products){
            task(product);
        }

        //保存Excel
        writeListToFile("E:\\result.xlsx", result);
    }

    public static void task(Product product){
        Product2 product2 = new Product2();
        product2.setId(product.getId());
        product2.setParentId(product.getParentId());
        product2.setName(product.getName());
        product2.setLevel(product.getLevel());
        result.add(product2);

        List<Product> childList = product.getChildList();
        if (childList==null||childList.isEmpty())
            return;

        for (Product value : childList) {
            task(value);
        }
    }



    public static void writeListToFile(String fileName, List<Product2> product2s) throws Exception{
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("混投信息");
        HSSFRow head = sheet.createRow(0);
        head.createCell(0).setCellValue("id");
        head.createCell(1).setCellValue("parent_id");
        head.createCell(2).setCellValue("name");
        head.createCell(3).setCellValue("level");
        if(product2s!=null&&product2s.size()>0) {
            for (Product2 product2 : product2s) {
                HSSFRow body = sheet.createRow(sheet.getLastRowNum()+1);
                body.createCell(0).setCellValue(product2.getId());
                body.createCell(1).setCellValue(product2.getParentId());
                body.createCell(2).setCellValue(product2.getName());
                body.createCell(3).setCellValue(product2.getLevel());
            }
            FileOutputStream fos = new FileOutputStream(fileName);
            workbook.write(fos);
            fos.close();
        }
        System.out.println("导出成功!");
    }
}
