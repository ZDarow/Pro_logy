package e2;

import W.r;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5440a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5441b;

    public /* synthetic */ f(String str, int i4) {
        this.f5440a = i4;
        this.f5441b = str;
    }

    public static f c(r rVar) {
        String str;
        rVar.H(2);
        int u4 = rVar.u();
        int i4 = u4 >> 1;
        int u5 = ((rVar.u() >> 3) & 31) | ((u4 & 1) << 5);
        if (i4 == 4 || i4 == 5 || i4 == 7) {
            str = "dvhe";
        } else if (i4 == 8) {
            str = "hev1";
        } else {
            if (i4 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i4);
        sb.append(u5 >= 10 ? "." : ".0");
        sb.append(u5);
        return new f(sb.toString(), 2);
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f5441b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public String toString() {
        switch (this.f5440a) {
            case 1:
                return "<" + this.f5441b + '>';
            default:
                return super.toString();
        }
    }

    public f(String str) {
        this.f5440a = 0;
        str.getClass();
        this.f5441b = str;
    }
}
