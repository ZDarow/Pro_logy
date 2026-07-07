package m0;

import android.net.Uri;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.C0159k;
import f2.Y;
import f2.h0;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;

/* renamed from: m0.m */
/* loaded from: classes.dex */
public final class C0432m implements Closeable {

    /* renamed from: A */
    public boolean f7246A;

    /* renamed from: B */
    public boolean f7247B;

    /* renamed from: C */
    public boolean f7248C;

    /* renamed from: D */
    public long f7249D;

    /* renamed from: l */
    public final Y f7250l;

    /* renamed from: m */
    public final Y f7251m;

    /* renamed from: n */
    public final String f7252n;

    /* renamed from: o */
    public final SocketFactory f7253o;

    /* renamed from: p */
    public final ArrayDeque f7254p = new ArrayDeque();

    /* renamed from: q */
    public final SparseArray f7255q = new SparseArray();

    /* renamed from: r */
    public final P2.a f7256r;
    public Uri s;

    /* renamed from: t */
    public y f7257t;

    /* renamed from: u */
    public F1.a f7258u;

    /* renamed from: v */
    public String f7259v;
    public long w;

    /* renamed from: x */
    public RunnableC0431l f7260x;

    /* renamed from: y */
    public W.p f7261y;

    /* renamed from: z */
    public int f7262z;

    /* JADX WARN: Type inference failed for: r1v3, types: [P2.a, java.lang.Object] */
    public C0432m(Y y4, Y y5, String str, Uri uri, SocketFactory socketFactory) {
        this.f7250l = y4;
        this.f7251m = y5;
        this.f7252n = str;
        this.f7253o = socketFactory;
        ?? obj = new Object();
        obj.f1502n = this;
        this.f7256r = obj;
        this.s = z.f(uri);
        this.f7257t = new y(new Y.x(this));
        this.w = 60000L;
        this.f7258u = z.d(uri);
        this.f7249D = -9223372036854775807L;
        this.f7262z = -1;
    }

    public static /* synthetic */ P2.a a(C0432m c0432m) {
        return c0432m.f7256r;
    }

    public static /* synthetic */ Uri b(C0432m c0432m) {
        return c0432m.s;
    }

    public static void c(C0432m c0432m, C0159k c0159k) {
        c0432m.getClass();
        if (c0432m.f7246A) {
            c0432m.f7251m.B(c0159k);
            return;
        }
        String message = c0159k.getMessage();
        if (message == null) {
            message = "";
        }
        c0432m.f7250l.F(message, c0159k);
    }

    public static /* synthetic */ SparseArray e(C0432m c0432m) {
        return c0432m.f7255q;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RunnableC0431l runnableC0431l = this.f7260x;
        if (runnableC0431l != null) {
            runnableC0431l.close();
            this.f7260x = null;
            Uri uri = this.s;
            String str = this.f7259v;
            str.getClass();
            P2.a aVar = this.f7256r;
            C0432m c0432m = (C0432m) aVar.f1502n;
            int i4 = c0432m.f7262z;
            if (i4 != -1 && i4 != 0) {
                c0432m.f7262z = 0;
                aVar.l(aVar.h(12, str, h0.f5570r, uri));
            }
        }
        this.f7257t.close();
    }

    public final void f() {
        long Z3;
        p pVar = (p) this.f7254p.pollFirst();
        if (pVar == null) {
            r rVar = (r) this.f7251m.f5535m;
            long j4 = rVar.f7294y;
            if (j4 != -9223372036854775807L) {
                Z3 = W.y.Z(j4);
            } else {
                long j5 = rVar.f7295z;
                Z3 = j5 != -9223372036854775807L ? W.y.Z(j5) : 0L;
            }
            rVar.f7286o.i(Z3);
            return;
        }
        Uri a4 = pVar.a();
        W.a.k(pVar.f7268c);
        String str = pVar.f7268c;
        String str2 = this.f7259v;
        P2.a aVar = this.f7256r;
        ((C0432m) aVar.f1502n).f7262z = 0;
        f2.r.d("Transport", str);
        aVar.l(aVar.h(10, str2, h0.b(1, new Object[]{"Transport", str}, null), a4));
    }

    public final Socket g(Uri uri) {
        W.a.e(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f7253o.createSocket(host, port);
    }

    public final void h(long j4) {
        if (this.f7262z == 2 && !this.f7248C) {
            Uri uri = this.s;
            String str = this.f7259v;
            str.getClass();
            P2.a aVar = this.f7256r;
            C0432m c0432m = (C0432m) aVar.f1502n;
            W.a.j(c0432m.f7262z == 2);
            aVar.l(aVar.h(5, str, h0.f5570r, uri));
            c0432m.f7248C = true;
        }
        this.f7249D = j4;
    }

    public final void i(long j4) {
        Uri uri = this.s;
        String str = this.f7259v;
        str.getClass();
        P2.a aVar = this.f7256r;
        int i4 = ((C0432m) aVar.f1502n).f7262z;
        W.a.j(i4 == 1 || i4 == 2);
        C0413B c0413b = C0413B.f7136c;
        Object[] objArr = {Double.valueOf(j4 / 1000.0d)};
        int i5 = W.y.f2709a;
        aVar.l(aVar.h(6, str, h0.b(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
