package T;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2074a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f2075b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2076c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2077d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2078e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f2079f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f2080g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f2081h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f2082i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f2083j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f2084k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f2085l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f2086m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f2087n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f2088o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f2089p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f2090q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2091r;
    public CharSequence s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f2092t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f2093u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f2094v;
    public Integer w;

    public final void a(byte[] bArr, int i4) {
        if (this.f2079f != null) {
            Integer valueOf = Integer.valueOf(i4);
            int i5 = W.y.f2709a;
            if (!valueOf.equals(3) && W.y.a(this.f2080g, 3)) {
                return;
            }
        }
        this.f2079f = (byte[]) bArr.clone();
        this.f2080g = Integer.valueOf(i4);
    }

    public final void b(CharSequence charSequence) {
        this.f2093u = charSequence;
    }

    public final void c(Integer num) {
        this.f2087n = num;
    }

    public final void d(Integer num) {
        this.f2086m = num;
    }

    public final void e(Integer num) {
        this.f2085l = num;
    }
}
