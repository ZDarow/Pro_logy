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
public final class k extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f7481p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f7481p = oVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new k(this.f7481p, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((k) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        F1.g gVar;
        AbstractC0462a.P(obj);
        o oVar = this.f7481p;
        ContentResolver contentResolver = oVar.f7496i;
        if (contentResolver == null) {
            k3.h.i("resolver");
            throw null;
        }
        Uri uri = o.f7489j;
        String[] a4 = AbstractC0495a.a();
        String str = oVar.f7493f;
        if (str == null) {
            k3.h.i("where");
            throw null;
        }
        String str2 = oVar.f7494g;
        if (str2 == null) {
            k3.h.i("whereVal");
            throw null;
        }
        String[] strArr = {str2};
        String str3 = oVar.f7495h;
        if (str3 == null) {
            k3.h.i("sortType");
            throw null;
        }
        Cursor query = contentResolver.query(uri, a4, str, strArr, str3);
        ArrayList arrayList = new ArrayList();
        if (query != null) {
            new Integer(query.getCount());
        }
        while (query != null && query.moveToNext()) {
            HashMap hashMap = new HashMap();
            k3.a c4 = k3.s.c(query.getColumnNames());
            while (true) {
                boolean hasNext = c4.hasNext();
                gVar = oVar.f7490c;
                if (hasNext) {
                    String str4 = (String) c4.next();
                    k3.h.b(str4);
                    gVar.getClass();
                    hashMap.put(str4, F1.g.D(str4, query));
                }
            }
            Uri uri2 = o.f7489j;
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
