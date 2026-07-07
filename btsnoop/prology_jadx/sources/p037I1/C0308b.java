package p037I1;

/* renamed from: I1.b */
/* loaded from: classes.dex */
public final class C0308b implements java.io.FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ java.lang.String f922a;

    public C0308b(java.lang.String str) {
        this.f922a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return str.startsWith(this.f922a);
    }
}
