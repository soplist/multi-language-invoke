    #include "jni.h"
	#include "JNITestCpp.h"
	#include "iostream"  
    using namespace std;  
      
    JNIEXPORT void JNICALL Java_JNITestCpp_sayHelloWorld  
      (JNIEnv* env, jclass method, jstring param)  
    {  
        cout << "c++:helloworld" << endl;   
    }  