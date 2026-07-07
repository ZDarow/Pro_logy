package S0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1885l = 1;

    /* renamed from: m, reason: collision with root package name */
    public int f1886m;

    public /* synthetic */ c() {
    }

    public static String b(int i4) {
        return "" + ((char) ((i4 >> 24) & 255)) + ((char) ((i4 >> 16) & 255)) + ((char) ((i4 >> 8) & 255)) + ((char) (i4 & 255));
    }

    public static int d(int i4) {
        return (i4 >> 24) & 255;
    }

    public void a(int i4) {
        this.f1886m = i4 | this.f1886m;
    }

    public boolean c(int i4) {
        return (this.f1886m & i4) == i4;
    }

    public String toString() {
        switch (this.f1885l) {
            case 0:
                return b(this.f1886m);
            default:
                return super.toString();
        }
    }

    public c(int i4) {
        this.f1886m = i4;
    }
}
