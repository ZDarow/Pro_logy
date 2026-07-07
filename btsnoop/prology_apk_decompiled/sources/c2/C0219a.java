package c2;

import M1.g;
import M1.h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219a extends com.google.android.gms.common.internal.a implements M1.c {
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final C2.d f4699K;

    /* renamed from: L, reason: collision with root package name */
    public final Bundle f4700L;

    /* renamed from: M, reason: collision with root package name */
    public final Integer f4701M;

    public C0219a(Context context, Looper looper, C2.d dVar, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, dVar, gVar, hVar);
        this.J = true;
        this.f4699K = dVar;
        this.f4700L = bundle;
        this.f4701M = (Integer) dVar.f372f;
    }

    @Override // com.google.android.gms.common.internal.a, M1.c
    public final boolean j() {
        return this.J;
    }

    @Override // M1.c
    public final int m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C0222d ? (C0222d) queryLocalInterface : new W1.a(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        C2.d dVar = this.f4699K;
        boolean equals = this.f4752n.getPackageName().equals((String) dVar.f369c);
        Bundle bundle = this.f4700L;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) dVar.f369c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
