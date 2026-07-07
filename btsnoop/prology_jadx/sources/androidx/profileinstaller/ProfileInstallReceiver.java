package androidx.profileinstaller;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle extras;
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            p142i1.AbstractC1539d.m3427s(context, new p142i1.ExecutorC1537b(0), new p129f2.C1408Y(7, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            android.os.Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                java.lang.String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new java.io.File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        android.util.Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                p129f2.C1408Y c1408y = new p129f2.C1408Y(7, this);
                try {
                    p142i1.AbstractC1539d.m3413e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c1408y.mo595i(10, null);
                    return;
                } catch (android.content.pm.PackageManager.NameNotFoundException e4) {
                    c1408y.mo595i(7, e4);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            android.os.Process.sendSignal(android.os.Process.myPid(), 10);
            android.util.Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            java.lang.String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            p129f2.C1408Y c1408y2 = new p129f2.C1408Y(7, this);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                c1408y2.mo595i(16, null);
            } else if (p142i1.AbstractC1539d.m3411c(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                c1408y2.mo595i(14, null);
            } else {
                c1408y2.mo595i(15, null);
            }
        }
    }
}
