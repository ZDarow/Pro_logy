package c0;

import f2.AbstractC0275C;
import f2.r0;
import java.util.Set;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205d {

    /* renamed from: d, reason: collision with root package name */
    public static final C0205d f4597d;

    /* renamed from: a, reason: collision with root package name */
    public final int f4598a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4599b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.M f4600c;

    /* JADX WARN: Type inference failed for: r1v1, types: [f2.L, f2.C] */
    static {
        C0205d c0205d;
        if (W.y.f2709a >= 33) {
            ?? abstractC0275C = new AbstractC0275C(4);
            for (int i4 = 1; i4 <= 10; i4++) {
                abstractC0275C.a(Integer.valueOf(W.y.s(i4)));
            }
            c0205d = new C0205d(2, abstractC0275C.g());
        } else {
            c0205d = new C0205d(2, 10);
        }
        f4597d = c0205d;
    }

    public C0205d(int i4, Set set) {
        this.f4598a = i4;
        f2.M j4 = f2.M.j(set);
        this.f4600c = j4;
        r0 it = j4.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = Math.max(i5, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f4599b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0205d)) {
            return false;
        }
        C0205d c0205d = (C0205d) obj;
        return this.f4598a == c0205d.f4598a && this.f4599b == c0205d.f4599b && W.y.a(this.f4600c, c0205d.f4600c);
    }

    public final int hashCode() {
        int i4 = ((this.f4598a * 31) + this.f4599b) * 31;
        f2.M m4 = this.f4600c;
        return i4 + (m4 == null ? 0 : m4.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f4598a + ", maxChannelCount=" + this.f4599b + ", channelMasks=" + this.f4600c + "]";
    }

    public C0205d(int i4, int i5) {
        this.f4598a = i4;
        this.f4599b = i5;
        this.f4600c = null;
    }
}
