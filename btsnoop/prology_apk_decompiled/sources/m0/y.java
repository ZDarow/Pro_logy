package m0;

import f2.Y;
import f2.c0;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: r, reason: collision with root package name */
    public static final Charset f7314r = e2.d.f5436c;

    /* renamed from: l, reason: collision with root package name */
    public final Y.x f7315l;

    /* renamed from: m, reason: collision with root package name */
    public final u0.n f7316m = new u0.n("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: n, reason: collision with root package name */
    public final Map f7317n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o, reason: collision with root package name */
    public x f7318o;

    /* renamed from: p, reason: collision with root package name */
    public Socket f7319p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f7320q;

    public y(Y.x xVar) {
        this.f7315l = xVar;
    }

    public final void a(Socket socket) {
        this.f7319p = socket;
        this.f7318o = new x(this, socket.getOutputStream());
        this.f7316m.f(new w(this, socket.getInputStream()), new Y(18, this), 0);
    }

    public final void b(c0 c0Var) {
        W.a.k(this.f7318o);
        x xVar = this.f7318o;
        xVar.getClass();
        xVar.f7312n.post(new W.m(xVar, new e2.f(z.f7328h).b(c0Var).getBytes(f7314r), c0Var, 10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7320q) {
            return;
        }
        try {
            x xVar = this.f7318o;
            if (xVar != null) {
                xVar.close();
            }
            this.f7316m.e(null);
            Socket socket = this.f7319p;
            if (socket != null) {
                socket.close();
            }
            this.f7320q = true;
        } catch (Throwable th) {
            this.f7320q = true;
            throw th;
        }
    }
}
