package p056O;

/* renamed from: O.d */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0476d implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener, android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.InterfaceC1147k, p157l1.InterfaceC1825d {

    /* renamed from: y */
    public static final java.lang.Object f1379y = new java.lang.Object();

    /* renamed from: l */
    public final int f1380l = -1;

    /* renamed from: m */
    public final java.lang.String f1381m = java.util.UUID.randomUUID().toString();

    /* renamed from: n */
    public final android.support.v4.media.session.C1061t f1382n = new android.support.v4.media.session.C1061t(9);

    /* renamed from: o */
    public android.support.v4.media.session.C1061t f1383o;

    /* renamed from: p */
    public final androidx.lifecycle.EnumC1142f f1384p;

    /* renamed from: q */
    public androidx.lifecycle.C1149m f1385q;

    /* renamed from: r */
    public p096Y1.C0890a f1386r;

    /* renamed from: s */
    public final java.util.ArrayList f1387s;

    /* renamed from: t */
    public final p043K2.C0339o f1388t;

    /* renamed from: u */
    public final p056O.DialogInterfaceOnDismissListenerC0475c f1389u;

    /* renamed from: v */
    public int f1390v;

    /* renamed from: w */
    public boolean f1391w;

    /* renamed from: x */
    public boolean f1392x;

    /* JADX WARN: Type inference failed for: r0v11, types: [Y1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, androidx.lifecycle.k] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j.l0, java.lang.Object] */
    public DialogInterfaceOnCancelListenerC0476d() {
        java.lang.Object obj;
        androidx.lifecycle.C1158v c1158v;
        new p056O.RunnableC0473a(this, 1);
        this.f1384p = androidx.lifecycle.EnumC1142f.f4306p;
        new androidx.lifecycle.C1151o();
        new java.util.concurrent.atomic.AtomicInteger();
        this.f1387s = new java.util.ArrayList();
        this.f1388t = new p043K2.C0339o(6, this);
        this.f1385q = new androidx.lifecycle.C1149m(this);
        ?? obj2 = new java.lang.Object();
        obj2.f3189m = this;
        ?? obj3 = new java.lang.Object();
        obj3.f6968c = new p155l.C1820f();
        obj2.f3190n = obj3;
        this.f1386r = obj2;
        java.util.ArrayList arrayList = this.f1387s;
        p043K2.C0339o c0339o = this.f1388t;
        if (!arrayList.contains(c0339o)) {
            if (this.f1380l >= 0) {
                p056O.DialogInterfaceOnCancelListenerC0476d dialogInterfaceOnCancelListenerC0476d = (p056O.DialogInterfaceOnCancelListenerC0476d) c0339o.f1048m;
                dialogInterfaceOnCancelListenerC0476d.f1386r.m1728b();
                androidx.lifecycle.EnumC1142f enumC1142f = dialogInterfaceOnCancelListenerC0476d.f1385q.f4313c;
                if (enumC1142f != androidx.lifecycle.EnumC1142f.f4303m && enumC1142f != androidx.lifecycle.EnumC1142f.f4304n) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                p145j.C1670l0 c1670l0 = (p145j.C1670l0) dialogInterfaceOnCancelListenerC0476d.f1386r.f3190n;
                c1670l0.getClass();
                java.util.Iterator it = ((p155l.C1820f) c1670l0.f6968c).iterator();
                while (true) {
                    p155l.C1816b c1816b = (p155l.C1816b) it;
                    obj = null;
                    if (!c1816b.hasNext()) {
                        c1158v = null;
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) c1816b.next();
                    p154k3.AbstractC1803h.m3778d(entry, "components");
                    java.lang.String str = (java.lang.String) entry.getKey();
                    c1158v = (androidx.lifecycle.C1158v) entry.getValue();
                    if (p154k3.AbstractC1803h.m3775a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                        break;
                    }
                }
                if (c1158v == null) {
                    androidx.lifecycle.C1158v c1158v2 = new androidx.lifecycle.C1158v((p145j.C1670l0) dialogInterfaceOnCancelListenerC0476d.f1386r.f3190n, dialogInterfaceOnCancelListenerC0476d);
                    p155l.C1820f c1820f = (p155l.C1820f) ((p145j.C1670l0) dialogInterfaceOnCancelListenerC0476d.f1386r.f3190n).f6968c;
                    p155l.C1817c mo3792a = c1820f.mo3792a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (mo3792a != null) {
                        obj = mo3792a.f7381m;
                    } else {
                        p155l.C1817c c1817c = new p155l.C1817c("androidx.lifecycle.internal.SavedStateHandlesProvider", c1158v2);
                        c1820f.f7390o++;
                        p155l.C1817c c1817c2 = c1820f.f7388m;
                        if (c1817c2 == null) {
                            c1820f.f7387l = c1817c;
                            c1820f.f7388m = c1817c;
                        } else {
                            c1817c2.f7382n = c1817c;
                            c1817c.f7383o = c1817c2;
                            c1820f.f7388m = c1817c;
                        }
                    }
                    if (((androidx.lifecycle.C1158v) obj) != null) {
                        throw new java.lang.IllegalArgumentException("SavedStateProvider with the given key is already registered");
                    }
                    dialogInterfaceOnCancelListenerC0476d.f1385q.m2657a(new p157l1.C1822a(1, c1158v2));
                }
                p096Y1.C0890a c0890a = dialogInterfaceOnCancelListenerC0476d.f1386r;
                if (!c0890a.f3188l) {
                    c0890a.m1728b();
                }
                androidx.lifecycle.C1149m mo127b = c0890a.f3189m.mo127b();
                if (mo127b.f4313c.compareTo(androidx.lifecycle.EnumC1142f.f4305o) >= 0) {
                    throw new java.lang.IllegalStateException(("performRestore cannot be called when owner is " + mo127b.f4313c).toString());
                }
                p145j.C1670l0 c1670l02 = (p145j.C1670l0) c0890a.f3190n;
                if (!c1670l02.f6966a) {
                    throw new java.lang.IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
                }
                if (c1670l02.f6967b) {
                    throw new java.lang.IllegalStateException("SavedStateRegistry was already restored.");
                }
                c1670l02.f6969d = null;
                c1670l02.f6967b = true;
            } else {
                arrayList.add(c0339o);
            }
        }
        new p056O.RunnableC0473a(this, 0);
        new p056O.DialogInterfaceOnCancelListenerC0474b(this);
        this.f1389u = new p056O.DialogInterfaceOnDismissListenerC0475c(this);
        this.f1390v = -1;
        new p046L1.C0363g(9, this);
    }

    @Override // p157l1.InterfaceC1825d
    /* renamed from: a */
    public final p145j.C1670l0 mo986a() {
        return (p145j.C1670l0) this.f1386r.f3190n;
    }

    @Override // androidx.lifecycle.InterfaceC1147k
    /* renamed from: b */
    public final androidx.lifecycle.C1149m mo127b() {
        return this.f1385q;
    }

    /* renamed from: c */
    public final p021E0.AbstractC0193e m987c() {
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: d */
    public final android.support.v4.media.session.C1061t m988d() {
        throw new java.lang.IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [O.h, java.lang.Object] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.String str;
        if (this.f1391w) {
            return;
        }
        if (android.util.Log.isLoggable("FragmentManager", 3)) {
            android.util.Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1392x) {
            return;
        }
        this.f1392x = true;
        this.f1391w = true;
        if (this.f1390v >= 0) {
            android.support.v4.media.session.C1061t m988d = m988d();
            int i4 = this.f1390v;
            if (i4 < 0) {
                throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Bad id: ", i4));
            }
            synchronized (((java.util.ArrayList) m988d.f3863o)) {
            }
            this.f1390v = -1;
            return;
        }
        p009B2.C0034E c0034e = new p009B2.C0034E(m988d());
        ?? obj = new java.lang.Object();
        obj.f1396a = 3;
        obj.f1397b = this;
        ((java.util.ArrayList) c0034e.f123d).add(obj);
        obj.f1398c = 0;
        obj.f1399d = 0;
        obj.f1400e = 0;
        obj.f1401f = 0;
        if (c0034e.f121b) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "Commit: " + c0034e);
            java.io.PrintWriter printWriter = new java.io.PrintWriter(new p056O.C0481i());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((java.lang.String) null);
            printWriter.print(" mIndex=");
            printWriter.print(c0034e.f122c);
            printWriter.print(" mCommitted=");
            printWriter.println(c0034e.f121b);
            java.util.ArrayList arrayList = (java.util.ArrayList) c0034e.f123d;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    p056O.C0480h c0480h = (p056O.C0480h) arrayList.get(i5);
                    switch (c0480h.f1396a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            str = "REPLACE";
                            break;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            str = "REMOVE";
                            break;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            str = "HIDE";
                            break;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            str = "SHOW";
                            break;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "DETACH";
                            break;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + c0480h.f1396a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(c0480h.f1397b);
                    if (c0480h.f1398c != 0 || c0480h.f1399d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(java.lang.Integer.toHexString(c0480h.f1398c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(java.lang.Integer.toHexString(c0480h.f1399d));
                    }
                    if (c0480h.f1400e != 0 || c0480h.f1401f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(java.lang.Integer.toHexString(c0480h.f1400e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(java.lang.Integer.toHexString(c0480h.f1401f));
                    }
                }
            }
            printWriter.close();
        }
        c0034e.f121b = true;
        android.support.v4.media.session.C1061t c1061t = (android.support.v4.media.session.C1061t) c0034e.f124e;
        c0034e.f122c = -1;
        synchronized (((java.util.ArrayList) c1061t.f3863o)) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1381m);
        sb.append(")");
        return sb.toString();
    }
}
