package u1;

import v1.InterfaceC0588a;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582b implements h {

    /* renamed from: n, reason: collision with root package name */
    public static final C0582b f8565n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0582b f8566o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0582b f8567p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0582b f8568q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0582b f8569r;
    public static final C0582b s;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8570l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f8571m;

    static {
        int i4 = 0;
        f8565n = new C0582b("NONE", i4);
        f8566o = new C0582b("FULL", i4);
        int i5 = 1;
        f8567p = new C0582b("FLAT", i5);
        f8568q = new C0582b("HALF_OPENED", i5);
        int i6 = 2;
        f8569r = new C0582b("FOLD", i6);
        s = new C0582b("HINGE", i6);
    }

    public /* synthetic */ C0582b(String str, int i4) {
        this.f8570l = i4;
        this.f8571m = str;
    }

    public String toString() {
        switch (this.f8570l) {
            case 0:
                return (String) this.f8571m;
            case 1:
                return (String) this.f8571m;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return (String) this.f8571m;
            default:
                return super.toString();
        }
    }

    public C0582b(InterfaceC0588a interfaceC0588a) {
        this.f8570l = 3;
        int i4 = m.f8592b;
        this.f8571m = interfaceC0588a;
    }
}
