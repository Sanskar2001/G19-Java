import java.util.Arrays;
import java.util.Comparator;;

class MyComparator implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
       
        if(o1.marks==o2.marks)
        return -(o1.rollNo-o2.rollNo);

        return o1.marks-o2.marks;
    }
    
}


class Demo {
 
    

    public static void main(String[] args) {
        

        int[]arr=new int [4];

        arr[0]=10;
        arr[1]=5;
        arr[2]=3;
        arr[3]=4;

        Arrays.sort(arr);

        for(int ele:arr)
        System.out.print(ele+" ");

        Student[] stArr=new Student[3];

        Student s1=new Student("Navish", 12, 18);
        Student s2=new Student("Prerna", 60, 18);
        Student s3=new Student("Vipul", 44, 20);

     
        stArr[0]=s1;
        stArr[1]=s2;
        stArr[2]=s3;


        MyComparator comparator=new MyComparator();
        Arrays.sort(stArr,comparator);

        for(Student st:stArr)
        System.out.println(st.name+" "+st.marks+" "+st.rollNo);


        // Student st=new Student("Mehvish",55,35);
        // Student st2=new Student("Naman", 75, 29);

        // st.compareTo(st2);





    }
}
