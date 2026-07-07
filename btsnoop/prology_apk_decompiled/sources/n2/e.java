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
public final class e extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f7460p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f7460p = gVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new e(this.f7460p, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((e) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        AbstractC0462a.P(obj);
        g gVar = this.f7460p;
        ContentResolver contentResolver = gVar.f7466e;
        if (contentResolver == null) {
            k3.h.i("resolver");
            throw null;
        }
        Uri uri = gVar.f7465d;
        if (uri == null) {
            k3.h.i("uri");
            throw null;
        }
        String[] strArr = AbstractC0495a.f7943b;
        String str = gVar.f7467f;
        if (str == null) {
            k3.h.i("sortType");
            throw null;
        }
        Cursor query = contentResolver.query(uri, strArr, null, null, str);
        ArrayList arrayList = new ArrayList();
        if (query != null) {
            new Integer(query.getCount());
        }
        while (query != null && query.moveToNext()) {
            HashMap hashMap = new HashMap();
            k3.a c4 = k3.s.c(query.getColumnNames());
            while (c4.hasNext()) {
                String str2 = (String) c4.next();
                k3.h.b(str2);
                gVar.f7464c.getClass();
                hashMap.put(str2, F1.g.y(str2, query));
            }
            arrayList.add(hashMap);
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
