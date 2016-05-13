#include "jni.h"
#include "JNITest.h"
#include "stdio.h"

JNIEXPORT void JNICALL Java_JNITest_sayHelloWorld
  (JNIEnv *env, jobject arg, jstring inString)
{
    printf("c:hello world");
}