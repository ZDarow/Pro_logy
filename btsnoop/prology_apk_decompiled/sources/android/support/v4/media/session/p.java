package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class p extends o {
    /* JADX WARN: Type inference failed for: r1v0, types: [Q.u, java.lang.Object] */
    @Override // android.support.v4.media.session.o
    public final Q.u c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo;
        String packageName;
        String packageName2;
        int pid;
        int uid;
        currentControllerInfo = this.f3717a.getCurrentControllerInfo();
        ?? obj = new Object();
        packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        packageName2 = currentControllerInfo.getPackageName();
        pid = currentControllerInfo.getPid();
        uid = currentControllerInfo.getUid();
        obj.f1577a = new Q.w(pid, uid, packageName2);
        return obj;
    }

    @Override // android.support.v4.media.session.o
    public final void f(Q.u uVar) {
    }
}
