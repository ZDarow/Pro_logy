package n2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import b3.InterfaceC0190d;
import java.util.ArrayList;
import java.util.HashMap;
import p1.AbstractC0462a;
import q2.AbstractC0495a;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class v extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x f7514p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f7514p = xVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new v(this.f7514p, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((v) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        F1.g gVar;
        AbstractC0462a.P(obj);
        x xVar = this.f7514p;
        ContentResolver contentResolver = xVar.f7520e;
        if (contentResolver == null) {
            k3.h.i("resolver");
            throw null;
        }
        Uri uri = xVar.f7519d;
        if (uri == null) {
            k3.h.i("uri");
            throw null;
        }
        Cursor query = contentResolver.query(uri, AbstractC0495a.f7942a, null, null, null);
        ArrayList arrayList = new ArrayList();
        if (query != null) {
            new Integer(query.getCount());
        }
        while (query != null && query.moveToNext()) {
            HashMap hashMap = new HashMap();
            k3.a c4 = k3.s.c(query.getColumnNames());
            while (true) {
                boolean hasNext = c4.hasNext();
                gVar = xVar.f7518c;
                if (!hasNext) {
                    break;
                }
                String str = (String) c4.next();
                k3.h.b(str);
                gVar.getClass();
                hashMap.put(str, F1.g.B(str, query));
            }
            String valueOf = String.valueOf(hashMap.get("_id"));
            ContentResolver contentResolver2 = xVar.f7520e;
            if (contentResolver2 == null) {
                k3.h.i("resolver");
                throw null;
            }
            gVar.getClass();
            hashMap.put("num_of_songs", new Integer(F1.g.w(1, valueOf, contentResolver2)));
            arrayList.add(hashMap);
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
