public class JNIInvokeWithParam {  
    static {  
        System.loadLibrary("JNIInvokeWithParam");  
    }  
      
    public static native void sayHelloWorld(String msg);  
      
    public static void main(String[] args) {  
        sayHelloWorld("send from java:hello world!");  
    }  
}  