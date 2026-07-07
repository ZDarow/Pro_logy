package d0;

import W.y;
import android.os.Handler;
import android.os.Message;
import e0.C0251c;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class o implements Handler.Callback {

    /* renamed from: l, reason: collision with root package name */
    public final u0.e f4917l;

    /* renamed from: m, reason: collision with root package name */
    public final d f4918m;

    /* renamed from: q, reason: collision with root package name */
    public C0251c f4922q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4923r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4924t;

    /* renamed from: p, reason: collision with root package name */
    public final TreeMap f4921p = new TreeMap();

    /* renamed from: o, reason: collision with root package name */
    public final Handler f4920o = y.n(this);

    /* renamed from: n, reason: collision with root package name */
    public final I0.b f4919n = new I0.b(1);

    public o(C0251c c0251c, d dVar, u0.e eVar) {
        this.f4922q = c0251c;
        this.f4918m = dVar;
        this.f4917l = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f4924t) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        m mVar = (m) message.obj;
        long j4 = mVar.f4910a;
        TreeMap treeMap = this.f4921p;
        long j5 = mVar.f4911b;
        Long l4 = (Long) treeMap.get(Long.valueOf(j5));
        if (l4 == null) {
            treeMap.put(Long.valueOf(j5), Long.valueOf(j4));
        } else if (l4.longValue() > j4) {
            treeMap.put(Long.valueOf(j5), Long.valueOf(j4));
        }
        return true;
    }
}
