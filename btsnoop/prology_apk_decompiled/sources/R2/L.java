package R2;

import I.C0035d;
import I.Q;
import a.AbstractC0110a;
import android.content.Context;
import android.util.Base64;
import b3.InterfaceC0195i;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p1.AbstractC0462a;
import r3.C0532t;
import r3.InterfaceC0533u;
import r3.T;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ o3.c[] f1791a;

    /* renamed from: b, reason: collision with root package name */
    public static final L.c f1792b;

    static {
        k3.l lVar = new k3.l(k3.b.f7087l, L.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        k3.q.f7105a.getClass();
        f1791a = new o3.c[]{lVar};
        L.a aVar = L.a.f1031m;
        y3.c cVar = r3.B.f8111b;
        T t4 = new T(null);
        cVar.getClass();
        InterfaceC0195i J = AbstractC0110a.J(cVar, t4);
        if (J.j(C0532t.f8178m) == null) {
            J = J.c(new T(null));
        }
        f1792b = new L.c(aVar, new w3.e(J));
    }

    public static final K2.o a(Context context) {
        K2.o oVar;
        L.c cVar = f1792b;
        o3.c cVar2 = f1791a[0];
        cVar.getClass();
        k3.h.e(context, "thisRef");
        k3.h.e(cVar2, "property");
        K2.o oVar2 = cVar.f1038d;
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (cVar.f1037c) {
            try {
                if (cVar.f1038d == null) {
                    Context applicationContext = context.getApplicationContext();
                    j3.l lVar = cVar.f1035a;
                    k3.h.d(applicationContext, "applicationContext");
                    List list = (List) lVar.b(applicationContext);
                    InterfaceC0533u interfaceC0533u = cVar.f1036b;
                    L.b bVar = new L.b(0, applicationContext, cVar);
                    k3.h.e(list, "migrations");
                    Q q4 = new Q(new K.f(B3.f.f242a, new C3.c(1, bVar)), AbstractC0462a.E(new C0035d(list, null)), new L1.g(6, false), interfaceC0533u);
                    cVar.f1038d = new K2.o(1, new K2.o(1, q4));
                }
                oVar = cVar.f1038d;
                k3.h.b(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public static final boolean b(String str, Object obj, Set set) {
        k3.h.e(str, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object c(Object obj, F1.g gVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!q3.i.p0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (!q3.i.p0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return obj;
            }
            String substring = str.substring(40);
            k3.h.d(substring, "substring(...)");
            return Double.valueOf(Double.parseDouble(substring));
        }
        if (q3.i.p0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return obj;
        }
        String substring2 = str.substring(40);
        k3.h.d(substring2, "substring(...)");
        gVar.getClass();
        k3.h.e(substring2, "listString");
        Object readObject = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(substring2, 0))).readObject();
        k3.h.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) readObject) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
