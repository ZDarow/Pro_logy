package N1;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b2.AbstractC0186b;
import c2.AbstractBinderC0221c;
import c2.C0219a;
import c2.C0222d;
import c2.C0224f;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class A extends AbstractBinderC0221c implements M1.g, M1.h {

    /* renamed from: k, reason: collision with root package name */
    public static final Q1.b f1239k = AbstractC0186b.f4456a;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1240d;

    /* renamed from: e, reason: collision with root package name */
    public final W1.f f1241e;

    /* renamed from: f, reason: collision with root package name */
    public final Q1.b f1242f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f1243g;

    /* renamed from: h, reason: collision with root package name */
    public final C2.d f1244h;

    /* renamed from: i, reason: collision with root package name */
    public C0219a f1245i;

    /* renamed from: j, reason: collision with root package name */
    public r f1246j;

    public A(Context context, W1.f fVar, C2.d dVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.f1240d = context;
        this.f1241e = fVar;
        this.f1244h = dVar;
        this.f1243g = (Set) dVar.f367a;
        this.f1242f = f1239k;
    }

    @Override // M1.g
    public final void K(int i4) {
        r rVar = this.f1246j;
        o oVar = (o) ((C0060d) rVar.f1312f).f1275u.get((C0058b) rVar.f1309c);
        if (oVar != null) {
            if (oVar.f1297k) {
                oVar.m(new L1.a(17));
            } else {
                oVar.K(i4);
            }
        }
    }

    @Override // M1.g
    public final void V() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        int i4 = 2;
        C0219a c0219a = this.f1245i;
        c0219a.getClass();
        try {
            c0219a.f4699K.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = c0219a.f4752n;
                    ReentrantLock reentrantLock = K1.a.f945c;
                    O1.s.d(context);
                    ReentrantLock reentrantLock2 = K1.a.f945c;
                    reentrantLock2.lock();
                    try {
                        if (K1.a.f946d == null) {
                            K1.a.f946d = new K1.a(context.getApplicationContext());
                        }
                        K1.a aVar = K1.a.f946d;
                        reentrantLock2.unlock();
                        String a4 = aVar.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a4)) {
                            String a5 = aVar.a("googleSignInAccount:" + a4);
                            if (a5 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.d(a5);
                                } catch (JSONException unused) {
                                }
                                Integer num = c0219a.f4701M;
                                O1.s.d(num);
                                O1.n nVar = new O1.n(2, account, num.intValue(), googleSignInAccount);
                                C0222d c0222d = (C0222d) c0219a.q();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(c0222d.f2813e);
                                int i5 = W1.c.f2815a;
                                obtain.writeInt(1);
                                int X3 = AbstractC0462a.X(obtain, 20293);
                                AbstractC0462a.a0(obtain, 1, 4);
                                obtain.writeInt(1);
                                AbstractC0462a.S(obtain, 2, nVar, 0);
                                AbstractC0462a.Y(obtain, X3);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                c0222d.f2812d.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                c0222d.f2812d.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            Integer num2 = c0219a.f4701M;
            O1.s.d(num2);
            O1.n nVar2 = new O1.n(2, account, num2.intValue(), googleSignInAccount);
            C0222d c0222d2 = (C0222d) c0219a.q();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c0222d2.f2813e);
            int i52 = W1.c.f2815a;
            obtain.writeInt(1);
            int X32 = AbstractC0462a.X(obtain, 20293);
            AbstractC0462a.a0(obtain, 1, 4);
            obtain.writeInt(1);
            AbstractC0462a.S(obtain, 2, nVar2, 0);
            AbstractC0462a.Y(obtain, X32);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f1241e.post(new q(i4, this, new C0224f(1, new L1.a(8, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    @Override // M1.h
    public final void f0(L1.a aVar) {
        this.f1246j.c(aVar);
    }
}
