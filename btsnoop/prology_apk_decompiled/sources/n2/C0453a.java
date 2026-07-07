package n2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import b3.InterfaceC0190d;
import java.util.ArrayList;
import java.util.HashMap;
import p1.AbstractC0462a;
import r3.InterfaceC0533u;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453a extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f7451p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453a(c cVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f7451p = cVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new C0453a(this.f7451p, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((C0453a) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        AbstractC0462a.P(obj);
        c cVar = this.f7451p;
        ContentResolver contentResolver = cVar.f7458f;
        if (contentResolver == null) {
            k3.h.i("resolver");
            throw null;
        }
        Uri uri = cVar.f7456d;
        if (uri == null) {
            k3.h.i("uri");
            throw null;
        }
        String str = cVar.f7457e;
        if (str == null) {
            k3.h.i("sortType");
            throw null;
        }
        Cursor query = contentResolver.query(uri, null, null, null, str);
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
                cVar.f7455c.getClass();
                hashMap.put(str2, F1.g.x(str2, query));
            }
            if (String.valueOf(hashMap.get("album_art")).length() == 0) {
                hashMap.remove("album_art");
            }
            arrayList.add(hashMap);
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
