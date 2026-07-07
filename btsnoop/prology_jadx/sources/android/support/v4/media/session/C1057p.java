package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.p */
/* loaded from: classes.dex */
public class C1057p extends android.support.v4.media.session.C1056o {
    /* JADX WARN: Type inference failed for: r1v0, types: [Q.u, java.lang.Object] */
    @Override // android.support.v4.media.session.C1056o
    /* renamed from: c */
    public final p064Q.C0549u mo2190c() {
        android.media.session.MediaSessionManager.RemoteUserInfo currentControllerInfo;
        java.lang.String packageName;
        java.lang.String packageName2;
        int pid;
        int uid;
        currentControllerInfo = this.f3844a.getCurrentControllerInfo();
        ?? obj = new java.lang.Object();
        packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new java.lang.NullPointerException("package shouldn't be null");
        }
        if (android.text.TextUtils.isEmpty(packageName)) {
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        packageName2 = currentControllerInfo.getPackageName();
        pid = currentControllerInfo.getPid();
        uid = currentControllerInfo.getUid();
        obj.f1629a = new p064Q.C0551w(pid, uid, packageName2);
        return obj;
    }

    @Override // android.support.v4.media.session.C1056o
    /* renamed from: f */
    public final void mo2193f(p064Q.C0549u c0549u) {
    }
}
