public class JNITest {  
    static {  
        System.loadLibrary("Test");  
    }  
      
    public static native void sayHelloWorld(String msg);  
      
    public static void main(String[] args) {  
        sayHelloWorld("hello, world");  
    }  
}  