import java.io.*; 
import java.util.*; 

  
class Average_List_Int { 
    public static void main(String[] args) 
    { 
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of the Array List :");
        int len = input.nextInt();
        ArrayList<Integer> arrlist = new ArrayList<Integer>(len); 
        System.out.println("Enter the elements :\n");
        for (int i = 1; i <= len; i++) 
            arrlist.add(input.nextInt()); 
        System.out.println("The elements are :");
        for (int i = 0; i < arrlist.size(); i++) 
            System.out.print(arrlist.get(i) + " "); 
            
        System.out.println("\nThe average is :\n"+calculateAverage(arrlist));
    }
    
    public static double calculateAverage(List <Integer> marks) {
      Integer sum = 0;
      Integer count = 0;
      if(!marks.isEmpty() & marks.size()!=0) {
        for (Integer mark : marks) {
            sum += mark;
        }
        return sum.doubleValue() / marks.size();
      }
      return sum;
    }
} 


