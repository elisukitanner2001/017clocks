
package pkg017_recursion_overload;

/**
 *
 * @author compsci
 */
public class StartRecursion {
    public static void main(String[] args){
        int n = 10;
        recurse(n);
        System.out.println();
        n=0;
        recurseup(n);
        System.out.println();
        int startValue = 0;
        int stopValue = 50;
        recurseEvens(startValue, stopValue);
    }

    private static void recurse(int n) {
        
        System.out.println("We have done recurse" + n + "times");
        n--;
        if(n >= 0) {
            recurse(n);            
        }
        
    
        
    }

    private static void recurseup(int n) {
         System.out.println("We have done recurseup" + n + "times");
        n++;
        if(n <= 10) {
            recurseup(n);            
        }
    }
    /**
     * 
     * @param startValue
     * @param stopValue 
     */
    //overload defintion:methods have the same name
    //but filter in pass parms
    //that is how java tells them apart
    private static void recurseEvens(int startValue, int stopValue){
        if (startValue %2 !=0){
            recurseEvens(startValue + 2, stopValue);
        }else if (startValue < stopValue){
         
        }else{            
            System.out.println("finished");
        }
        
    }
}//end of class
