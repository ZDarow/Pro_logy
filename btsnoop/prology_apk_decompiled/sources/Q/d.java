package Q;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;
import n.C0442e;

/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f1510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f1512g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f1513h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f1514i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, String str, f fVar, String str2, Bundle bundle, Bundle bundle2) {
        super(str);
        this.f1514i = tVar;
        this.f1510e = fVar;
        this.f1511f = str2;
        this.f1512g = bundle;
        this.f1513h = bundle2;
    }

    @Override // Q.m
    public final void c(Object obj) {
        List list = (List) obj;
        C0442e c0442e = this.f1514i.f1574p;
        f fVar = this.f1510e;
        K2.o oVar = fVar.f1520d;
        Object obj2 = c0442e.get(((Messenger) oVar.f1009m).getBinder());
        String str = fVar.f1517a;
        String str2 = this.f1511f;
        if (obj2 != fVar) {
            if (t.s) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
                return;
            }
            return;
        }
        try {
            oVar.A(str2, list, this.f1512g, this.f1513h);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
