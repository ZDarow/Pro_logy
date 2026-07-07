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
public final class s extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u f7506p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f7506p = uVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new s(this.f7506p, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((s) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        F1.g gVar;
        AbstractC0462a.P(obj);
        u uVar = this.f7506p;
        ContentResolver contentResolver = uVar.f7513f;
        if (contentResolver == null) {
            k3.h.i("resolver");
            throw null;
        }
        Uri uri = uVar.f7511d;
        if (uri == null) {
            k3.h.i("uri");
            throw null;
        }
        String[] strArr = AbstractC0495a.f7944c;
        String str = uVar.f7512e;
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
            while (true) {
                boolean hasNext = c4.hasNext();
                gVar = uVar.f7510c;
                if (!hasNext) {
                    break;
                }
                String str2 = (String) c4.next();
                k3.h.b(str2);
                gVar.getClass();
                hashMap.put(str2, F1.g.A(str2, query));
            }
            String valueOf = String.valueOf(hashMap.get("_id"));
            ContentResolver contentResolver2 = uVar.f7513f;
            if (contentResolver2 == null) {
                k3.h.i("resolver");
                throw null;
            }
            gVar.getClass();
            hashMap.put("num_of_songs", new Integer(F1.g.w(0, valueOf, contentResolver2)));
            if (hashMap.get("name") != null && !k3.h.a(hashMap.get("_id"), new Integer(0))) {
                arrayList.add(hashMap);
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
