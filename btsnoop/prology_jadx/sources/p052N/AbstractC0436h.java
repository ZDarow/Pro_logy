package p052N;

/* renamed from: N.h */
/* loaded from: classes.dex */
public abstract class AbstractC0436h {
    /* renamed from: a */
    public static void m938a(java.io.FileDescriptor fileDescriptor) {
        android.system.Os.close(fileDescriptor);
    }

    /* renamed from: b */
    public static java.io.FileDescriptor m939b(java.io.FileDescriptor fileDescriptor) {
        return android.system.Os.dup(fileDescriptor);
    }

    /* renamed from: c */
    public static long m940c(java.io.FileDescriptor fileDescriptor, long j4, int i4) {
        return android.system.Os.lseek(fileDescriptor, j4, i4);
    }
}
