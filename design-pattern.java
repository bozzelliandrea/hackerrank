/**
Singleton:  https://www.hackerrank.com/challenges/java-singleton/problem

implement a singleton class
*/
class Singleton {

    public String str;
    
    private static Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getSingleInstance() {
        if(instance != null)
            return instance;
        
        instance = new  Singleton();
        return instance;
    }
    
}
