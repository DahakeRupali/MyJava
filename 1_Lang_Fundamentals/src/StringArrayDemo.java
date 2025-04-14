import java.util.Arrays;
public class StringArrayDemo {
    public static void main(String args[]){
    String [] names ={"Vijay","Satya","Jaya","Shrini","Naresh","Sridevi"}; //Initialization
    System.out.println("Array content  are....\n");
    for(int i=0;i<names.length; i++)
        System.out.println(names[i]);
        //Sorting
//        for(int i=0;i<names.length-1; i++)
//        for(int j=i+1;j<names.length; j++)
//            if((names[i].compareTo(names[j])) > 0 )
//            {
//            String t = names[i];
//            names[i]=names[j];
//        names[j]=t;
//           }
        Arrays.sort(names);
        System.out.println("Sorted result......");
        for(int i=0;i<names.length; i++)
        System.out.println(names[i]);
    }
}