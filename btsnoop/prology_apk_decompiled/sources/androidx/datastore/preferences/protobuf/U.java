package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0169v f4040a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4041b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f4042c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4043d;

    public U(AbstractC0169v abstractC0169v, String str, Object[] objArr) {
        this.f4040a = abstractC0169v;
        this.f4041b = str;
        this.f4042c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4043d = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 < 55296) {
                this.f4043d = i4 | (charAt2 << i6);
                return;
            } else {
                i4 |= (charAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    public final AbstractC0149a a() {
        return this.f4040a;
    }

    public final Object[] b() {
        return this.f4042c;
    }

    public final String c() {
        return this.f4041b;
    }

    public final int d() {
        int i4 = this.f4043d;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }
}
