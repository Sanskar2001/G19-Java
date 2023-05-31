import java.util.HashSet;
class DuplicateElements
{

    static boolean checkDuplicate(int[]arr)
    {

        HashSet<Integer>set=new HashSet<Integer>();

        for(int ele:arr)
        {
            if(set.contains(ele))
            return true;

            set.add(ele);

        }

        return false;

    }

    public static void main(String[] args) {
        

        int []arr={1,2,3,4,5,2};
        
        if(checkDuplicate(arr))
        System.out.println("Duplicate element exsits");
        else
        System.out.println("Does'nt Exists");



    }
}