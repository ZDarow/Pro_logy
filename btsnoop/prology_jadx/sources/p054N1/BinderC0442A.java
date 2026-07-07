package p054N1;

/* renamed from: N1.A */
/* loaded from: classes.dex */
public final class BinderC0442A extends p114c2.AbstractBinderC1248c implements p050M1.InterfaceC0423g, p050M1.InterfaceC0424h {

    /* renamed from: k */
    public static final p066Q1.C0561b f1281k = p109b2.AbstractC1186b.f4617a;

    /* renamed from: d */
    public final android.content.Context f1282d;

    /* renamed from: e */
    public final p088W1.HandlerC0820f f1283e;

    /* renamed from: f */
    public final p066Q1.C0561b f1284f;

    /* renamed from: g */
    public final java.util.Set f1285g;

    /* renamed from: h */
    public final p013C2.C0139d f1286h;

    /* renamed from: i */
    public p114c2.C1246a f1287i;

    /* renamed from: j */
    public p054N1.C0463r f1288j;

    public BinderC0442A(android.content.Context context, p088W1.HandlerC0820f handlerC0820f, p013C2.C0139d c0139d) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.f1282d = context;
        this.f1283e = handlerC0820f;
        this.f1286h = c0139d;
        this.f1285g = (java.util.Set) c0139d.f375a;
        this.f1284f = f1281k;
    }

    @Override // p050M1.InterfaceC0423g
    /* renamed from: K */
    public final void mo900K(int i4) {
        p054N1.C0463r c0463r = this.f1288j;
        p054N1.C0460o c0460o = (p054N1.C0460o) ((p054N1.C0449d) c0463r.f1356f).f1318u.get((p054N1.C0447b) c0463r.f1353c);
        if (c0460o != null) {
            if (c0460o.f1341k) {
                c0460o.m972m(new p046L1.C0357a(17));
            } else {
                c0460o.mo900K(i4);
            }
        }
    }

    @Override // p050M1.InterfaceC0423g
    /* renamed from: V */
    public final void mo901V() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount;
        android.os.Parcel obtain;
        android.os.Parcel obtain2;
        int i4 = 2;
        p114c2.C1246a c1246a = this.f1287i;
        c1246a.getClass();
        try {
            c1246a.f4869K.getClass();
            android.accounts.Account account = new android.accounts.Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    android.content.Context context = c1246a.f4925n;
                    java.util.concurrent.locks.ReentrantLock reentrantLock = p042K1.C0324a.f984c;
                    p058O1.AbstractC0515s.m1017d(context);
                    java.util.concurrent.locks.ReentrantLock reentrantLock2 = p042K1.C0324a.f984c;
                    reentrantLock2.lock();
                    try {
                        if (p042K1.C0324a.f985d == null) {
                            p042K1.C0324a.f985d = new p042K1.C0324a(context.getApplicationContext());
                        }
                        p042K1.C0324a c0324a = p042K1.C0324a.f985d;
                        reentrantLock2.unlock();
                        java.lang.String m718a = c0324a.m718a("defaultGoogleSignInAccount");
                        if (!android.text.TextUtils.isEmpty(m718a)) {
                            java.lang.String m718a2 = c0324a.m718a("googleSignInAccount:" + m718a);
                            if (m718a2 != null) {
                                try {
                                    googleSignInAccount = com.google.android.gms.auth.api.signin.GoogleSignInAccount.m2926d(m718a2);
                                } catch (org.json.JSONException unused) {
                                }
                                java.lang.Integer num = c1246a.f4871M;
                                p058O1.AbstractC0515s.m1017d(num);
                                p058O1.C0510n c0510n = new p058O1.C0510n(2, account, num.intValue(), googleSignInAccount);
                                p114c2.C1249d c1249d = (p114c2.C1249d) c1246a.m2935q();
                                obtain = android.os.Parcel.obtain();
                                obtain.writeInterfaceToken(c1249d.f2909e);
                                int i5 = p088W1.AbstractC0817c.f2911a;
                                obtain.writeInt(1);
                                int m3921X = p176p1.AbstractC1949a.m3921X(obtain, 20293);
                                p176p1.AbstractC1949a.m3925a0(obtain, 1, 4);
                                obtain.writeInt(1);
                                p176p1.AbstractC1949a.m3916S(obtain, 2, c0510n, 0);
                                p176p1.AbstractC1949a.m3922Y(obtain, m3921X);
                                obtain.writeStrongBinder(this);
                                obtain2 = android.os.Parcel.obtain();
                                c1249d.f2908d.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                c1249d.f2908d.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (java.lang.Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            java.lang.Integer num2 = c1246a.f4871M;
            p058O1.AbstractC0515s.m1017d(num2);
            p058O1.C0510n c0510n2 = new p058O1.C0510n(2, account, num2.intValue(), googleSignInAccount);
            p114c2.C1249d c1249d2 = (p114c2.C1249d) c1246a.m2935q();
            obtain = android.os.Parcel.obtain();
            obtain.writeInterfaceToken(c1249d2.f2909e);
            int i52 = p088W1.AbstractC0817c.f2911a;
            obtain.writeInt(1);
            int m3921X2 = p176p1.AbstractC1949a.m3921X(obtain, 20293);
            p176p1.AbstractC1949a.m3925a0(obtain, 1, 4);
            obtain.writeInt(1);
            p176p1.AbstractC1949a.m3916S(obtain, 2, c0510n2, 0);
            p176p1.AbstractC1949a.m3922Y(obtain, m3921X2);
            obtain.writeStrongBinder(this);
            obtain2 = android.os.Parcel.obtain();
        } catch (android.os.RemoteException e4) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f1283e.post(new p054N1.RunnableC0462q(i4, this, new p114c2.C1251f(1, new p046L1.C0357a(8, null), null)));
            } catch (android.os.RemoteException unused2) {
                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    @Override // p050M1.InterfaceC0424h
    /* renamed from: f0 */
    public final void mo902f0(p046L1.C0357a c0357a) {
        this.f1288j.m979c(c0357a);
    }
}
