package O;

import B2.AbstractC0007h;
import B2.E;
import K2.o;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.support.v4.media.session.t;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import j.l0;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import l.C0397b;
import l.C0398c;
import l.C0401f;
import l1.C0403a;
import l1.InterfaceC0406d;

/* loaded from: classes.dex */
public class d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, k, InterfaceC0406d {

    /* renamed from: y, reason: collision with root package name */
    public static final Object f1335y = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final int f1336l = -1;

    /* renamed from: m, reason: collision with root package name */
    public final String f1337m = UUID.randomUUID().toString();

    /* renamed from: n, reason: collision with root package name */
    public final t f1338n = new t(9);

    /* renamed from: o, reason: collision with root package name */
    public t f1339o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.f f1340p;

    /* renamed from: q, reason: collision with root package name */
    public m f1341q;

    /* renamed from: r, reason: collision with root package name */
    public Y1.a f1342r;
    public final ArrayList s;

    /* renamed from: t, reason: collision with root package name */
    public final o f1343t;

    /* renamed from: u, reason: collision with root package name */
    public final c f1344u;

    /* renamed from: v, reason: collision with root package name */
    public int f1345v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1346x;

    /* JADX WARN: Type inference failed for: r0v11, types: [Y1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, androidx.lifecycle.k] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j.l0, java.lang.Object] */
    public d() {
        Object obj;
        v vVar;
        new a(this, 1);
        this.f1340p = androidx.lifecycle.f.f4157p;
        new androidx.lifecycle.o();
        new AtomicInteger();
        this.s = new ArrayList();
        this.f1343t = new o(6, this);
        this.f1341q = new m(this);
        ?? obj2 = new Object();
        obj2.f3079m = this;
        ?? obj3 = new Object();
        obj3.f6710c = new C0401f();
        obj2.f3080n = obj3;
        this.f1342r = obj2;
        ArrayList arrayList = this.s;
        o oVar = this.f1343t;
        if (!arrayList.contains(oVar)) {
            if (this.f1336l >= 0) {
                d dVar = (d) oVar.f1009m;
                dVar.f1342r.b();
                androidx.lifecycle.f fVar = dVar.f1341q.f4164c;
                if (fVar != androidx.lifecycle.f.f4154m && fVar != androidx.lifecycle.f.f4155n) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                l0 l0Var = (l0) dVar.f1342r.f3080n;
                l0Var.getClass();
                Iterator it = ((C0401f) l0Var.f6710c).iterator();
                while (true) {
                    C0397b c0397b = (C0397b) it;
                    obj = null;
                    if (!c0397b.hasNext()) {
                        vVar = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) c0397b.next();
                    k3.h.d(entry, "components");
                    String str = (String) entry.getKey();
                    vVar = (v) entry.getValue();
                    if (k3.h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                        break;
                    }
                }
                if (vVar == null) {
                    v vVar2 = new v((l0) dVar.f1342r.f3080n, dVar);
                    C0401f c0401f = (C0401f) ((l0) dVar.f1342r.f3080n).f6710c;
                    C0398c a4 = c0401f.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (a4 != null) {
                        obj = a4.f7111m;
                    } else {
                        C0398c c0398c = new C0398c("androidx.lifecycle.internal.SavedStateHandlesProvider", vVar2);
                        c0401f.f7120o++;
                        C0398c c0398c2 = c0401f.f7118m;
                        if (c0398c2 == null) {
                            c0401f.f7117l = c0398c;
                            c0401f.f7118m = c0398c;
                        } else {
                            c0398c2.f7112n = c0398c;
                            c0398c.f7113o = c0398c2;
                            c0401f.f7118m = c0398c;
                        }
                    }
                    if (((v) obj) != null) {
                        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                    }
                    dVar.f1341q.a(new C0403a(1, vVar2));
                }
                Y1.a aVar = dVar.f1342r;
                if (!aVar.f3078l) {
                    aVar.b();
                }
                m b4 = aVar.f3079m.b();
                if (b4.f4164c.compareTo(androidx.lifecycle.f.f4156o) >= 0) {
                    throw new IllegalStateException(("performRestore cannot be called when owner is " + b4.f4164c).toString());
                }
                l0 l0Var2 = (l0) aVar.f3080n;
                if (!l0Var2.f6708a) {
                    throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
                }
                if (l0Var2.f6709b) {
                    throw new IllegalStateException("SavedStateRegistry was already restored.");
                }
                l0Var2.f6711d = null;
                l0Var2.f6709b = true;
            } else {
                arrayList.add(oVar);
            }
        }
        new a(this, 0);
        new b(this);
        this.f1344u = new c(this);
        this.f1345v = -1;
        new L1.g(9, this);
    }

    @Override // l1.InterfaceC0406d
    public final l0 a() {
        return (l0) this.f1342r.f3080n;
    }

    @Override // androidx.lifecycle.k
    public final m b() {
        return this.f1341q;
    }

    public final E0.e c() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final t d() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [O.h, java.lang.Object] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.w) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1346x) {
            return;
        }
        this.f1346x = true;
        this.w = true;
        if (this.f1345v >= 0) {
            t d4 = d();
            int i4 = this.f1345v;
            if (i4 < 0) {
                throw new IllegalArgumentException(AbstractC0007h.k("Bad id: ", i4));
            }
            synchronized (((ArrayList) d4.f3736o)) {
            }
            this.f1345v = -1;
            return;
        }
        E e4 = new E(d());
        ?? obj = new Object();
        obj.f1350a = 3;
        obj.f1351b = this;
        ((ArrayList) e4.f120d).add(obj);
        obj.f1352c = 0;
        obj.f1353d = 0;
        obj.f1354e = 0;
        obj.f1355f = 0;
        if (e4.f118b) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + e4);
            PrintWriter printWriter = new PrintWriter(new i());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(e4.f119c);
            printWriter.print(" mCommitted=");
            printWriter.println(e4.f118b);
            ArrayList arrayList = (ArrayList) e4.f120d;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    h hVar = (h) arrayList.get(i5);
                    switch (hVar.f1350a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            str = "REPLACE";
                            break;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            str = "REMOVE";
                            break;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            str = "HIDE";
                            break;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            str = "SHOW";
                            break;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "DETACH";
                            break;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + hVar.f1350a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(hVar.f1351b);
                    if (hVar.f1352c != 0 || hVar.f1353d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(hVar.f1352c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(hVar.f1353d));
                    }
                    if (hVar.f1354e != 0 || hVar.f1355f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(hVar.f1354e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(hVar.f1355f));
                    }
                }
            }
            printWriter.close();
        }
        e4.f118b = true;
        t tVar = (t) e4.f121e;
        e4.f119c = -1;
        synchronized (((ArrayList) tVar.f3736o)) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1337m);
        sb.append(")");
        return sb.toString();
    }
}
