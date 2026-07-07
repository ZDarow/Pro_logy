package w0;

import T.C0088i;
import T.C0094o;
import T.C0095p;
import T.b0;
import W.y;
import a0.C0133m;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import f2.G;
import f2.I;
import f2.c0;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: w0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8758a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8759b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8760c;

    /* renamed from: d, reason: collision with root package name */
    public C0095p f8761d;

    /* renamed from: e, reason: collision with root package name */
    public long f8762e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8763f;

    /* renamed from: g, reason: collision with root package name */
    public long f8764g;

    /* renamed from: h, reason: collision with root package name */
    public w f8765h;

    /* renamed from: i, reason: collision with root package name */
    public Executor f8766i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0597g f8767j;

    public C0596f(C0597g c0597g, Context context) {
        this.f8767j = c0597g;
        this.f8758a = context;
        this.f8759b = y.J(context) ? 1 : 5;
        this.f8760c = new ArrayList();
        this.f8762e = -9223372036854775807L;
        this.f8765h = w.f8886j;
        this.f8766i = C0597g.f8768m;
    }

    public final void a(boolean z4) {
        this.f8763f = false;
        this.f8762e = -9223372036854775807L;
        C0597g c0597g = this.f8767j;
        if (c0597g.f8780l == 1) {
            c0597g.f8779k++;
            c0597g.f8771c.a();
            W.v vVar = c0597g.f8777i;
            W.a.k(vVar);
            vVar.c(new F2.c(13, c0597g));
        }
        if (z4) {
            p pVar = c0597g.f8770b;
            s sVar = pVar.f8839b;
            sVar.f8866m = 0L;
            sVar.f8869p = -1L;
            sVar.f8867n = -1L;
            pVar.f8844g = -9223372036854775807L;
            pVar.f8842e = -9223372036854775807L;
            pVar.c(1);
            pVar.f8845h = -9223372036854775807L;
        }
    }

    public final void b(C0095p c0095p) {
        C0597g c0597g = this.f8767j;
        W.a.j(c0597g.f8780l == 0);
        C0088i c0088i = c0095p.f2336z;
        if (c0088i == null || !c0088i.d()) {
            c0088i = C0088i.f2250h;
        }
        if (c0088i.f2253c != 7 || y.f2709a < 34) {
        }
        Looper myLooper = Looper.myLooper();
        W.a.k(myLooper);
        c0597g.f8777i = c0597g.f8773e.a(myLooper, null);
        try {
            C0593c c0593c = c0597g.f8772d;
            G g4 = I.f5510m;
            c0 c0Var = c0.f5550p;
            c0593c.a();
            Pair pair = c0597g.f8778j;
            if (pair == null) {
                throw null;
            }
            int i4 = ((W.s) pair.second).f2698a;
            throw null;
        } catch (b0 e4) {
            throw new x(e4, c0095p);
        }
    }

    public final void c() {
        if (this.f8761d == null) {
            return;
        }
        new ArrayList().addAll(this.f8760c);
        C0095p c0095p = this.f8761d;
        c0095p.getClass();
        W.a.k(null);
        C0088i c0088i = c0095p.f2336z;
        if (c0088i == null || !c0088i.d()) {
            C0088i c0088i2 = C0088i.f2250h;
        }
        int i4 = c0095p.s;
        W.a.d("width must be positive, but is: " + i4, i4 > 0);
        int i5 = c0095p.f2331t;
        W.a.d("height must be positive, but is: " + i5, i5 > 0);
        throw null;
    }

    public final void d(long j4, long j5) {
        try {
            this.f8767j.a(j4, j5);
        } catch (C0133m e4) {
            C0095p c0095p = this.f8761d;
            if (c0095p == null) {
                c0095p = new C0095p(new C0094o());
            }
            throw new x(e4, c0095p);
        }
    }

    public final void e(Surface surface, W.s sVar) {
        C0597g c0597g = this.f8767j;
        Pair pair = c0597g.f8778j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((W.s) c0597g.f8778j.second).equals(sVar)) {
            return;
        }
        c0597g.f8778j = Pair.create(surface, sVar);
        int i4 = sVar.f2698a;
    }
}
