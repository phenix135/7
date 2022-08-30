package File_io;

import java.io.File;
//搜索文件
//递归案例
public class demo4 {
    public static void main(String[] args) {
       searchFile(new File("D:/元气壁纸缓存"),"dynamic");
    }
    public static void searchFile(File dir,String filename){
        //判断dir是否是文件夹
     if(dir!=null&&dir.isDirectory()){
         //提取当前目录下的一级文件对象
         File[]files=dir.listFiles();
         if(files!=null&&files.length>0){
             for (File file : files) {
          if(file.isFile()){
              if(file.getName().contains(filename)){

                  System.out.println("找到了"+file.getAbsoluteFile());

               }else{
                  searchFile(file,filename);
              }
              }
             }
         }
     }else{
         System.out.println("当前搜索的位置不是文件夹！");
     }


    }
}
