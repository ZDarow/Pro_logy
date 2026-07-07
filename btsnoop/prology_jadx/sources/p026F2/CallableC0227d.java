package p026F2;

/* renamed from: F2.d */
/* loaded from: classes.dex */
public final class CallableC0227d implements java.util.concurrent.Callable {

    /* renamed from: a */
    public final /* synthetic */ android.content.Context f649a;

    /* renamed from: b */
    public final /* synthetic */ p026F2.C0229f f650b;

    public CallableC0227d(p026F2.C0229f c0229f, android.content.Context context) {
        this.f650b = c0229f;
        this.f649a = context;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        p026F2.C0229f c0229f = this.f650b;
        android.content.Context context = this.f649a;
        p089W2.AbstractC0821a.m1664b("FlutterLoader initTask");
        try {
            c0229f.getClass();
            io.flutter.embedding.engine.FlutterJNI flutterJNI = c0229f.f657e;
            int i4 = 0;
            try {
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                c0229f.f658f.execute(new p026F2.RunnableC0226c(0, this));
                java.io.File filesDir = context.getFilesDir();
                if (filesDir == null) {
                    filesDir = new java.io.File(context.getDataDir().getPath(), "files");
                }
                java.lang.String path = filesDir.getPath();
                java.io.File codeCacheDir = context.getCodeCacheDir();
                if (codeCacheDir == null) {
                    codeCacheDir = context.getCacheDir();
                }
                if (codeCacheDir == null) {
                    codeCacheDir = new java.io.File(context.getDataDir().getPath(), "cache");
                }
                java.lang.String path2 = codeCacheDir.getPath();
                java.io.File dir = context.getDir("flutter", 0);
                if (dir == null) {
                    dir = new java.io.File(context.getDataDir().getPath(), "app_flutter");
                }
                dir.getPath();
                p026F2.C0228e c0228e = new p026F2.C0228e(path, path2);
                android.os.Trace.endSection();
                return c0228e;
            } catch (java.lang.UnsatisfiedLinkError e4) {
                if (!e4.toString().contains("couldn't find \"libflutter.so\"") && !e4.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e4;
                }
                java.lang.String property = java.lang.System.getProperty("os.arch");
                java.io.File file = new java.io.File(c0229f.f656d.f645d);
                java.lang.String[] list = file.list();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
                int length = strArr.length;
                int i5 = 0;
                while (i5 < length) {
                    java.lang.String str = strArr[i5];
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("!");
                    java.lang.String str2 = java.io.File.separator;
                    sb.append(str2);
                    sb.append("lib");
                    sb.append(str2);
                    sb.append(str);
                    java.lang.String sb2 = sb.toString();
                    java.lang.String[] strArr2 = context.getApplicationInfo().splitSourceDirs;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    if (strArr2 != null) {
                        int length2 = strArr2.length;
                        for (int i6 = i4; i6 < length2; i6++) {
                            arrayList2.add(strArr2[i6] + sb2);
                        }
                        arrayList.addAll(arrayList2);
                    }
                    java.lang.String str3 = context.getApplicationInfo().sourceDir;
                    if (str3 != null && !str3.isEmpty()) {
                        arrayList.add(str3 + sb2);
                    }
                    i5++;
                    i4 = 0;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                sb3.append(property);
                sb3.append(", and the native libraries directory (with path ");
                sb3.append(file.getAbsolutePath());
                sb3.append(") ");
                sb3.append(file.exists() ? "contains the following files: " + java.util.Arrays.toString(list) : "does not exist");
                sb3.append(arrayList.isEmpty() ? "" : ", and the split and source libraries directory (with path(s) " + arrayList + ")");
                sb3.append(".");
                throw new java.lang.UnsupportedOperationException(sb3.toString(), e4);
            }
        } finally {
        }
    }
}
