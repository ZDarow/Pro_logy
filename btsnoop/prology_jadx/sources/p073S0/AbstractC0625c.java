package p073S0;

/* renamed from: S0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0625c {

    /* renamed from: l */
    public final /* synthetic */ int f1956l = 1;

    /* renamed from: m */
    public int f1957m;

    public /* synthetic */ AbstractC0625c() {
    }

    /* renamed from: b */
    public static java.lang.String m1135b(int i4) {
        return "" + ((char) ((i4 >> 24) & 255)) + ((char) ((i4 >> 16) & 255)) + ((char) ((i4 >> 8) & 255)) + ((char) (i4 & 255));
    }

    /* renamed from: d */
    public static int m1136d(int i4) {
        return (i4 >> 24) & 255;
    }

    /* renamed from: a */
    public void m1137a(int i4) {
        this.f1957m = i4 | this.f1957m;
    }

    /* renamed from: c */
    public boolean m1138c(int i4) {
        return (this.f1957m & i4) == i4;
    }

    public java.lang.String toString() {
        switch (this.f1956l) {
            case 0:
                return m1135b(this.f1957m);
            default:
                return super.toString();
        }
    }

    public AbstractC0625c(int i4) {
        this.f1957m = i4;
    }
}
