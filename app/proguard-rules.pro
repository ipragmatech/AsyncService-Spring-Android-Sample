-dontwarn com.joanzapata.android.asyncservice.**
-keep @com.joanzapata.android.asyncservice.api.annotation.AsyncService class *
-keep class **Injector
-keepnames class **Injector
-keepnames class * {
    @com.joanzapata.android.asyncservice.api.annotation.InjectService *;
}
-keepnames class * {
    @com.joanzapata.android.asyncservice.api.annotation.OnMessage *;
}
-keepattributes SourceFile,LineNumberTable,Signature,*Annotation*
-dontwarn com.squareup.okhttp.**

#Keep file for Springandroid
-keep class org.springframework.** { *; }
-keep class org.codehaus.jackson.** { *; }
-keep class com.fasterxml.jackson.** { *; }
-keep class * implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator *;
}

#Warnings to be removed. Otherwise maven plugin stops, but not dangerous
-dontwarn android.support.**
-dontwarn com.sun.xml.internal.**
-dontwarn com.sun.istack.internal.**
-dontwarn org.codehaus.jackson.**
-dontwarn org.springframework.**
-dontwarn java.awt.**
-dontwarn javax.security.**
-dontwarn java.beans.**
-dontwarn javax.xml.**
-dontwarn java.util.**
-dontwarn org.w3c.dom.**
-dontwarn com.google.common.**
-dontwarn com.squareup.javawriter.JavaWriter
-dontwarn sun.misc.**
-dontwarn sun.nio.**
-dontwarn sun.reflect.**



#iPragmatech Specific
#-dontwarn com.ipragmatech.socialengineapi.**
-keep class com.ipragmatech.asyncservice.** { *; }
-keep interface com.ipragmatech.asyncservice.** { *; }

#Keep Serializable
-keepclassmembers class * implements java.io.Serializable {*;}
-keepclassmembers class * {
    @org.codehaus.jackson.annotate.* *;
    @com.fasterxml.jackson.annotation.* *;
}