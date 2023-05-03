class StringBuilderDemo {
    
    public static void main(String[] args) {
        
        StringBuilder stringBuilder=new StringBuilder();
        System.out.println(stringBuilder.capacity());

        StringBuilder sb2=new StringBuilder("Hello");
       

        sb2.append(" World");
        System.out.println(sb2);

        sb2.deleteCharAt(1);
        System.out.println(sb2);

        sb2.insert(1,'Z');
        System.out.println(sb2);

        System.out.println(sb2.reverse());
    }
}
