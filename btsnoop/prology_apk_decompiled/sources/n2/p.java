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
public final class p extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f7497p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f7497p = rVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new p(this.f7497p, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((p) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        F1.g gVar;
        AbstractC0462a.P(obj);
        r rVar = this.f7497p;
        ContentResolver contentResolver = rVar.f7505g;
        if (contentResolver == null) {
            k3.h.i("resolver");
            throw null;
        }
        Uri uri = rVar.f7503e;
        if (uri == null) {
            k3.h.i("uri");
            throw null;
        }
        String[] a4 = AbstractC0495a.a();
        String str = rVar.f7502d;
        String str2 = rVar.f7504f;
        if (str2 == null) {
            k3.h.i("sortType");
            throw null;
        }
        Cursor query = contentResolver.query(uri, a4, str, null, str2);
        ArrayList arrayList = new ArrayList();
        if (query != null) {
            new Integer(query.getCount());
        }
        while (query != null && query.moveToNext()) {
            HashMap hashMap = new HashMap();
            k3.a c4 = k3.s.c(query.getColumnNames());
            while (true) {
                boolean hasNext = c4.hasNext();
                gVar = rVar.f7501c;
                if (!hasNext) {
                    break;
                }
                String str3 = (String) c4.next();
                k3.h.b(str3);
                gVar.getClass();
                hashMap.put(str3, F1.g.D(str3, query));
            }
            Uri uri2 = rVar.f7503e;
            if (uri2 == null) {
                k3.h.i("uri");
                throw null;
            }
            gVar.getClass();
            F1.g.C(uri2, hashMap);
            hashMap.putAll(hashMap);
            arrayList.add(hashMap);
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
