class Student implements Comparable<Student>{
    
    String name;
    int rollNo;
    int marks;

    public Student(String name,int rollNo,int marks)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;   
    }

    @Override
    public int compareTo(Student o) {
      
        if(this.marks==o.marks)
        return this.rollNo-o.rollNo;

        return -(this.marks-o.marks);
    }


}
