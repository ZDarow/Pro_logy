package C;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import u.C0574b;

/* loaded from: classes.dex */
public class K {

    /* renamed from: b, reason: collision with root package name */
    public static final O f293b;

    /* renamed from: a, reason: collision with root package name */
    public final O f294a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f293b = (i4 >= 34 ? new C() : i4 >= 30 ? new B() : i4 >= 29 ? new A() : new z()).b().f296a.a().f296a.b().f296a.c();
    }

    public K(O o2) {
        this.f294a = o2;
    }

    public O a() {
        return this.f294a;
    }

    public O b() {
        return this.f294a;
    }

    public O c() {
        return this.f294a;
    }

    public void d(View view) {
    }

    public C0019f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k4 = (K) obj;
        return m() == k4.m() && l() == k4.l() && Objects.equals(i(), k4.i()) && Objects.equals(g(), k4.g()) && Objects.equals(e(), k4.e());
    }

    public C0574b f() {
        return i();
    }

    public C0574b g() {
        return C0574b.f8471e;
    }

    public C0574b h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(m()), Boolean.valueOf(l()), i(), g(), e());
    }

    public C0574b i() {
        return C0574b.f8471e;
    }

    public C0574b j() {
        return i();
    }

    public O k(int i4, int i5, int i6, int i7) {
        return f293b;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean n(int i4) {
        return true;
    }

    public void o(C0574b[] c0574bArr) {
    }

    public void p(O o2) {
    }

    public void q(C0574b c0574b) {
    }

    public void r(int i4) {
    }
}
