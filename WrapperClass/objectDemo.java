class objectDemo
{

    static void changeValue(int x)
    {
        x++;
    }

    static void updateSem(Student s)
    {
        s.sem++;
    }

    public static void main(String[] args) {
        
        int a=25;

        changeValue(a);
        System.out.println(a);
        Student st=new Student(100, 4);
        updateSem(st);

        System.out.println(st.sem);
    }
}