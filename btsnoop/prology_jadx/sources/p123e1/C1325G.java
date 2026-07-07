package p123e1;

/* renamed from: e1.G */
/* loaded from: classes.dex */
public final class C1325G {

    /* renamed from: a */
    public int f5329a;

    /* renamed from: b */
    public int f5330b;

    /* renamed from: c */
    public int f5331c;

    /* renamed from: d */
    public final java.io.Serializable f5332d;

    /* renamed from: e */
    public java.lang.Object f5333e;

    public C1325G(int i4, int i5) {
        this(Integer.MIN_VALUE, i4, i5);
    }

    /* renamed from: a */
    public void m3084a() {
        int i4 = this.f5331c;
        this.f5331c = i4 == Integer.MIN_VALUE ? this.f5329a : i4 + this.f5330b;
        this.f5333e = ((java.lang.String) this.f5332d) + this.f5331c;
    }

    /* renamed from: b */
    public int m3085b(int i4) {
        int i5 = this.f5330b;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (((java.util.ArrayList) this.f5332d).size() == 0) {
            return i4;
        }
        android.view.View view = (android.view.View) ((java.util.ArrayList) this.f5332d).get(r3.size() - 1);
        p152k1.C1758F c1758f = (p152k1.C1758F) view.getLayoutParams();
        this.f5330b = ((androidx.recyclerview.widget.StaggeredGridLayoutManager) this.f5333e).f4461j.mo551d(view);
        c1758f.getClass();
        return this.f5330b;
    }

    /* renamed from: c */
    public void m3086c() {
        if (this.f5331c == Integer.MIN_VALUE) {
            throw new java.lang.IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public C1325G(int i4, int i5, int i6) {
        java.lang.String str;
        if (i4 != Integer.MIN_VALUE) {
            str = i4 + "/";
        } else {
            str = "";
        }
        this.f5332d = str;
        this.f5329a = i5;
        this.f5330b = i6;
        this.f5331c = Integer.MIN_VALUE;
        this.f5333e = "";
    }

    public C1325G(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, int i4) {
        this.f5333e = staggeredGridLayoutManager;
        this.f5332d = new java.util.ArrayList();
        this.f5329a = Integer.MIN_VALUE;
        this.f5330b = Integer.MIN_VALUE;
        this.f5331c = i4;
    }
}
