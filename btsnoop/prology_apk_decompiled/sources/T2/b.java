package T2;

import N1.r;
import T.B;
import T.C0098t;
import T.C0099u;
import T.C0101w;
import T.C0102x;
import T.C0103y;
import T.C0104z;
import T.E;
import android.content.Context;
import android.net.Uri;
import f2.c0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import q0.C0487t;
import q0.InterfaceC0468E;

/* loaded from: classes.dex */
public final class b extends E0.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f2429b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2430c;

    public b(String str, int i4, HashMap hashMap) {
        super(str);
        this.f2429b = i4;
        this.f2430c = hashMap;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [T.u, T.v] */
    @Override // E0.e
    public final B g() {
        C0098t c0098t = new C0098t();
        new F1.g();
        List emptyList = Collections.emptyList();
        c0 c0Var = c0.f5550p;
        C0101w c0101w = new C0101w();
        C0104z c0104z = C0104z.f2370a;
        String str = (String) this.f527a;
        Uri parse = str == null ? null : Uri.parse(str);
        int b4 = L.j.b(this.f2429b);
        String str2 = b4 != 1 ? b4 != 2 ? b4 != 3 ? null : "application/x-mpegURL" : "application/dash+xml" : "application/vnd.ms-sstr+xml";
        if (str2 == null) {
            str2 = null;
        }
        return new B("", new C0099u(c0098t), parse != null ? new C0103y(parse, str2, null, emptyList, c0Var, null, -9223372036854775807L) : null, new C0102x(c0101w), E.f2095y, c0104z);
    }

    @Override // E0.e
    public final InterfaceC0468E h(Context context) {
        T0.e eVar = new T0.e(1);
        HashMap hashMap = this.f2430c;
        eVar.f2391p = (hashMap.isEmpty() || !hashMap.containsKey("User-Agent")) ? "ExoPlayer" : (String) hashMap.get("User-Agent");
        eVar.f2389n = true;
        if (!hashMap.isEmpty()) {
            eVar.d(hashMap);
        }
        B1.d dVar = new B1.d(context, eVar);
        C0487t c0487t = new C0487t(context);
        c0487t.f7916b = dVar;
        r rVar = c0487t.f7915a;
        if (dVar != ((B1.d) rVar.f1311e)) {
            rVar.f1311e = dVar;
            ((HashMap) rVar.f1309c).clear();
            ((HashMap) rVar.f1310d).clear();
        }
        return c0487t;
    }
}
