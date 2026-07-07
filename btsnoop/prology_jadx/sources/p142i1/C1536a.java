package p142i1;

/* renamed from: i1.a */
/* loaded from: classes.dex */
public final class C1536a {

    /* renamed from: a */
    public final java.util.concurrent.Executor f6398a;

    /* renamed from: b */
    public final p142i1.InterfaceC1538c f6399b;

    /* renamed from: c */
    public final byte[] f6400c;

    /* renamed from: d */
    public final java.io.File f6401d;

    /* renamed from: e */
    public final java.lang.String f6402e;

    /* renamed from: f */
    public boolean f6403f = false;

    /* renamed from: g */
    public p166n0.C1889e[] f6404g;

    /* renamed from: h */
    public byte[] f6405h;

    public C1536a(android.content.res.AssetManager assetManager, java.util.concurrent.Executor executor, p142i1.InterfaceC1538c interfaceC1538c, java.lang.String str, java.io.File file) {
        this.f6398a = executor;
        this.f6399b = interfaceC1538c;
        this.f6402e = str;
        this.f6401d = file;
        int i4 = android.os.Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i4 <= 34) {
            switch (i4) {
                case 26:
                    bArr = p142i1.AbstractC1539d.f6413g;
                    break;
                case 27:
                    bArr = p142i1.AbstractC1539d.f6412f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = p142i1.AbstractC1539d.f6411e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = p142i1.AbstractC1539d.f6410d;
                    break;
            }
        }
        this.f6400c = bArr;
    }

    /* renamed from: a */
    public final java.io.FileInputStream m3406a(android.content.res.AssetManager assetManager, java.lang.String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (java.io.FileNotFoundException e4) {
            java.lang.String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f6399b.mo598m();
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void m3407b(int i4, java.io.Serializable serializable) {
        this.f6398a.execute(new p086W.RunnableC0787g(this, i4, serializable, 1));
    }
}
