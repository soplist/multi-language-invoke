#include "jni.h"
#include "JNIInvokeWithParam.h"
#include "iostream"  
using namespace std;  
      
JNIEXPORT void JNICALL Java_JNIInvokeWithParam_sayHelloWorld  
  (JNIEnv* env, jclass method, jstring param)  
{  
    const char* pt = env->GetStringUTFChars(param, 0);   
    cout << pt << "c++:called by Java Native Interface" << endl; 
}  
