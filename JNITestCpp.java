public class JNITestCpp {  
    static {  
        System.loadLibrary("JNITestCpp");  
    }  
      
    public static native void sayHelloWorld(String msg);  
      
    public static void main(String[] args) {  
        sayHelloWorld("hello, world");  
    }  
} 