package N1;

import B2.AbstractC0007h;
import O1.InterfaceC0062b;
import a0.C0134n;
import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import c0.C0206e;
import c0.K;
import java.util.HashMap;
import q0.InterfaceC0468E;

/* loaded from: classes.dex */
public final class r implements InterfaceC0062b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1307a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1308b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1309c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1310d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1311e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1312f;

    public r(C0060d c0060d, M1.c cVar, C0058b c0058b) {
        this.f1312f = c0060d;
        this.f1310d = null;
        this.f1311e = null;
        this.f1307a = false;
        this.f1308b = cVar;
        this.f1309c = c0058b;
    }

    @Override // O1.InterfaceC0062b
    public void a(L1.a aVar) {
        ((C0060d) this.f1312f).f1277x.post(new q(0, this, aVar));
    }

    public e2.j b(int i4) {
        e2.j jVar;
        e2.j jVar2;
        HashMap hashMap = (HashMap) this.f1309c;
        e2.j jVar3 = (e2.j) hashMap.get(Integer.valueOf(i4));
        if (jVar3 != null) {
            return jVar3;
        }
        final B1.d dVar = (B1.d) this.f1311e;
        dVar.getClass();
        if (i4 == 0) {
            final Class asSubclass = DashMediaSource$Factory.class.asSubclass(InterfaceC0468E.class);
            final int i5 = 0;
            jVar = new e2.j() { // from class: q0.s
                @Override // e2.j
                public final Object get() {
                    switch (i5) {
                        case 0:
                            return C0487t.d((Class) asSubclass, dVar);
                        case 1:
                            return C0487t.d((Class) asSubclass, dVar);
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            return C0487t.d((Class) asSubclass, dVar);
                        default:
                            return new U(dVar, (y0.m) ((N1.r) asSubclass).f1308b);
                    }
                }
            };
        } else if (i4 == 1) {
            final Class asSubclass2 = SsMediaSource$Factory.class.asSubclass(InterfaceC0468E.class);
            final int i6 = 1;
            jVar = new e2.j() { // from class: q0.s
                @Override // e2.j
                public final Object get() {
                    switch (i6) {
                        case 0:
                            return C0487t.d((Class) asSubclass2, dVar);
                        case 1:
                            return C0487t.d((Class) asSubclass2, dVar);
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            return C0487t.d((Class) asSubclass2, dVar);
                        default:
                            return new U(dVar, (y0.m) ((N1.r) asSubclass2).f1308b);
                    }
                }
            };
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    jVar2 = new C0134n(3, RtspMediaSource$Factory.class.asSubclass(InterfaceC0468E.class));
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException(AbstractC0007h.k("Unrecognized contentType: ", i4));
                    }
                    final int i7 = 3;
                    jVar2 = new e2.j() { // from class: q0.s
                        @Override // e2.j
                        public final Object get() {
                            switch (i7) {
                                case 0:
                                    return C0487t.d((Class) this, dVar);
                                case 1:
                                    return C0487t.d((Class) this, dVar);
                                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                    return C0487t.d((Class) this, dVar);
                                default:
                                    return new U(dVar, (y0.m) ((N1.r) this).f1308b);
                            }
                        }
                    };
                }
                hashMap.put(Integer.valueOf(i4), jVar2);
                return jVar2;
            }
            final Class asSubclass3 = HlsMediaSource$Factory.class.asSubclass(InterfaceC0468E.class);
            final int i8 = 2;
            jVar = new e2.j() { // from class: q0.s
                @Override // e2.j
                public final Object get() {
                    switch (i8) {
                        case 0:
                            return C0487t.d((Class) asSubclass3, dVar);
                        case 1:
                            return C0487t.d((Class) asSubclass3, dVar);
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            return C0487t.d((Class) asSubclass3, dVar);
                        default:
                            return new U(dVar, (y0.m) ((N1.r) asSubclass3).f1308b);
                    }
                }
            };
        }
        jVar2 = jVar;
        hashMap.put(Integer.valueOf(i4), jVar2);
        return jVar2;
    }

    public void c(L1.a aVar) {
        o oVar = (o) ((C0060d) this.f1312f).f1275u.get((C0058b) this.f1309c);
        if (oVar != null) {
            oVar.m(aVar);
        }
    }

    public r(Context context, w0.p pVar) {
        this.f1308b = context.getApplicationContext();
        this.f1309c = pVar;
        this.f1312f = W.t.f2700a;
    }

    public r(Context context) {
        this.f1308b = context;
        this.f1309c = C0206e.f4601c;
        this.f1311e = K.f4558a;
    }

    public r(y0.m mVar, L1.g gVar) {
        this.f1308b = mVar;
        this.f1312f = gVar;
        this.f1309c = new HashMap();
        this.f1310d = new HashMap();
        this.f1307a = true;
    }
}
