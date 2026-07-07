package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.n */
/* loaded from: classes.dex */
public final class BinderC1055n extends android.os.Binder implements android.support.v4.media.session.InterfaceC1045d {

    /* renamed from: d */
    public static final /* synthetic */ int f3842d = 0;

    /* renamed from: c */
    public final java.util.concurrent.atomic.AtomicReference f3843c;

    public BinderC1055n(android.support.v4.media.session.C1056o c1056o) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f3843c = new java.util.concurrent.atomic.AtomicReference(c1056o);
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: A */
    public final int mo2113A() {
        android.support.v4.media.session.C1056o c1056o = (android.support.v4.media.session.C1056o) this.f3843c.get();
        if (c1056o != null) {
            return c1056o.f3853j;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: B */
    public final void mo2114B(long j4) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: C */
    public final void mo2115C(java.lang.String str, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: D */
    public final void mo2116D(int i4, int i5) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: E */
    public final android.support.v4.media.session.ParcelableVolumeInfo mo2117E() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: F */
    public final android.support.v4.media.session.PlaybackStateCompat mo2118F() {
        android.support.v4.media.session.C1056o c1056o = (android.support.v4.media.session.C1056o) this.f3843c.get();
        if (c1056o == null) {
            return null;
        }
        android.support.v4.media.session.PlaybackStateCompat playbackStateCompat = c1056o.f3849f;
        android.support.v4.media.MediaMetadataCompat mediaMetadataCompat = c1056o.f3851h;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j4 = playbackStateCompat.f3809m;
        long j5 = -1;
        if (j4 == -1) {
            return playbackStateCompat;
        }
        int i4 = playbackStateCompat.f3808l;
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.f3815s <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j6 = (playbackStateCompat.f3811o * ((float) (elapsedRealtime - r7))) + j4;
        if (mediaMetadataCompat != null) {
            android.os.Bundle bundle = mediaMetadataCompat.f3773l;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j5 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        long j7 = (j5 < 0 || j6 <= j5) ? j6 < 0 ? 0L : j6 : j5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = playbackStateCompat.f3816t;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new android.support.v4.media.session.PlaybackStateCompat(playbackStateCompat.f3808l, j7, playbackStateCompat.f3810n, playbackStateCompat.f3811o, playbackStateCompat.f3812p, playbackStateCompat.f3813q, playbackStateCompat.f3814r, elapsedRealtime, arrayList, playbackStateCompat.f3817u, playbackStateCompat.f3818v);
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: G */
    public final void mo2119G() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: H */
    public final android.os.Bundle mo2120H() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: I */
    public final void mo2121I(android.net.Uri uri, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: J */
    public final void mo2122J(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: L */
    public final boolean mo2123L() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: M */
    public final void mo2124M(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: N */
    public final android.app.PendingIntent mo2109N() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: O */
    public final int mo2125O() {
        android.support.v4.media.session.C1056o c1056o = (android.support.v4.media.session.C1056o) this.f3843c.get();
        if (c1056o != null) {
            return c1056o.f3854k;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: P */
    public final void mo2126P(long j4) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: Q */
    public final void mo2127Q(int i4) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: S */
    public final void mo2128S(int i4) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: T */
    public final void mo2129T() {
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: U */
    public final void mo2130U(java.lang.String str, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: W */
    public final boolean mo2131W() {
        android.support.v4.media.session.C1056o c1056o = (android.support.v4.media.session.C1056o) this.f3843c.get();
        return c1056o != null && c1056o.f3852i;
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: X */
    public final java.lang.String mo2132X() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: a */
    public final void mo2133a() {
        throw new java.lang.AssertionError();
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: b0 */
    public final void mo2134b0() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: c */
    public final void mo2135c() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: c0 */
    public final void mo2136c0(float f4) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: d0 */
    public final void mo2137d0(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: e */
    public final void mo2138e(int i4) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: e0 */
    public final java.util.List mo2139e0() {
        return null;
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: f */
    public final void mo2140f() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: h */
    public final java.lang.CharSequence mo2141h() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: i */
    public final void mo2142i(java.lang.String str, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: i0 */
    public final void mo2143i0(int i4, int i5) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: k */
    public final void mo2110k(android.support.v4.media.session.InterfaceC1043b interfaceC1043b) {
        android.support.v4.media.session.C1056o c1056o = (android.support.v4.media.session.C1056o) this.f3843c.get();
        if (c1056o == null) {
            return;
        }
        c1056o.f3848e.register(interfaceC1043b, new p064Q.C0549u(android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid(), "android.media.session.MediaController"));
        synchronized (c1056o.f3847d) {
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: k0 */
    public final boolean mo2111k0(android.view.KeyEvent keyEvent) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: l */
    public final void mo2144l(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: m */
    public final android.support.v4.media.MediaMetadataCompat mo2145m() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: n */
    public final void mo2146n(java.lang.String str, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    public final void next() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: o */
    public final void mo2147o() {
        throw new java.lang.AssertionError();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.support.v4.media.session.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.support.v4.media.session.a, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i4, android.os.Parcel parcel, android.os.Parcel parcel2, int i5) {
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i4 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        android.support.v4.media.session.InterfaceC1043b interfaceC1043b = null;
        android.support.v4.media.session.InterfaceC1043b interfaceC1043b2 = null;
        switch (i4) {
            case 1:
                mo2137d0(parcel.readString(), (android.os.Bundle) p176p1.AbstractC1949a.m3924a(parcel, android.os.Bundle.CREATOR), (android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper) p176p1.AbstractC1949a.m3924a(parcel, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                boolean mo2111k0 = mo2111k0((android.view.KeyEvent) p176p1.AbstractC1949a.m3924a(parcel, android.view.KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(mo2111k0 ? 1 : 0);
                return true;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.media.session.InterfaceC1043b)) {
                        ?? obj = new java.lang.Object();
                        obj.f3825c = readStrongBinder;
                        interfaceC1043b = obj;
                    } else {
                        interfaceC1043b = (android.support.v4.media.session.InterfaceC1043b) queryLocalInterface;
                    }
                }
                mo2110k(interfaceC1043b);
                parcel2.writeNoException();
                return true;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof android.support.v4.media.session.InterfaceC1043b)) {
                        ?? obj2 = new java.lang.Object();
                        obj2.f3825c = readStrongBinder2;
                        interfaceC1043b2 = obj2;
                    } else {
                        interfaceC1043b2 = (android.support.v4.media.session.InterfaceC1043b) queryLocalInterface2;
                    }
                }
                mo2112r(interfaceC1043b2);
                parcel2.writeNoException();
                return true;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                boolean mo2123L = mo2123L();
                parcel2.writeNoException();
                parcel2.writeInt(mo2123L ? 1 : 0);
                return true;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.String mo2132X = mo2132X();
                parcel2.writeNoException();
                parcel2.writeString(mo2132X);
                return true;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.String mo2150u = mo2150u();
                parcel2.writeNoException();
                parcel2.writeString(mo2150u);
                return true;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                android.app.PendingIntent mo2109N = mo2109N();
                parcel2.writeNoException();
                p176p1.AbstractC1949a.m3920W(parcel2, mo2109N, 1);
                return true;
            case 9:
                long mo2154y = mo2154y();
                parcel2.writeNoException();
                parcel2.writeLong(mo2154y);
                return true;
            case 10:
                android.support.v4.media.session.ParcelableVolumeInfo mo2117E = mo2117E();
                parcel2.writeNoException();
                p176p1.AbstractC1949a.m3920W(parcel2, mo2117E, 1);
                return true;
            case 11:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                mo2143i0(readInt, readInt2);
                parcel2.writeNoException();
                return true;
            case 12:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                mo2116D(readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 13:
                mo2134b0();
                parcel2.writeNoException();
                return true;
            case 14:
                mo2153x(parcel.readString(), (android.os.Bundle) p176p1.AbstractC1949a.m3924a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                mo2115C(parcel.readString(), (android.os.Bundle) p176p1.AbstractC1949a.m3924a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                mo2121I((android.net.Uri) p176p1.AbstractC1949a.m3924a(parcel, android.net.Uri.CREATOR), (android.os.Bundle) p176p1.AbstractC1949a.m3924a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                mo2114B(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                mo2133a();
                parcel2.writeNoException();
                return true;
            case 19:
                mo2147o();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                mo2119G();
                parcel2.writeNoException();
                return true;
            case 23:
                mo2140f();
                parcel2.writeNoException();
                return true;
            case 24:
                mo2126P(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                mo2152w((android.support.v4.media.RatingCompat) p176p1.AbstractC1949a.m3924a(parcel, android.support.v4.media.RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                mo2142i(parcel.readString(), (android.os.Bundle) p176p1.AbstractC1949a.m3924a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                android.support.v4.media.MediaMetadataCompat mo2145m = mo2145m();
                parcel2.writeNoException();
                p176p1.AbstractC1949a.m3920W(parcel2, mo2145m, 1);
                return true;
            case 28:
                android.support.v4.media.session.PlaybackStateCompat mo2118F = mo2118F();
                parcel2.writeNoException();
                p176p1.AbstractC1949a.m3920W(parcel2, mo2118F, 1);
                return true;
            case 29:
                java.util.List mo2139e0 = mo2139e0();
                parcel2.writeNoException();
                if (mo2139e0 == null) {
                    parcel2.writeInt(-1);
                } else {
                    int size = mo2139e0.size();
                    parcel2.writeInt(size);
                    for (int i6 = 0; i6 < size; i6++) {
                        p176p1.AbstractC1949a.m3920W(parcel2, (android.os.Parcelable) mo2139e0.get(i6), 1);
                    }
                }
                return true;
            case 30:
                java.lang.CharSequence mo2141h = mo2141h();
                parcel2.writeNoException();
                if (mo2141h != null) {
                    parcel2.writeInt(1);
                    android.text.TextUtils.writeToParcel(mo2141h, parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 31:
                android.os.Bundle mo2120H = mo2120H();
                parcel2.writeNoException();
                p176p1.AbstractC1949a.m3920W(parcel2, mo2120H, 1);
                return true;
            case 32:
                mo2129T();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                mo2135c();
                parcel2.writeNoException();
                return true;
            case 34:
                mo2146n(parcel.readString(), (android.os.Bundle) p176p1.AbstractC1949a.m3924a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                mo2130U(parcel.readString(), (android.os.Bundle) p176p1.AbstractC1949a.m3924a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                mo2155z((android.net.Uri) p176p1.AbstractC1949a.m3924a(parcel, android.net.Uri.CREATOR), (android.os.Bundle) p176p1.AbstractC1949a.m3924a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int mo2113A = mo2113A();
                parcel2.writeNoException();
                parcel2.writeInt(mo2113A);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                mo2138e(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                mo2124M((android.support.v4.media.MediaDescriptionCompat) p176p1.AbstractC1949a.m3924a(parcel, android.support.v4.media.MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                mo2149s((android.support.v4.media.MediaDescriptionCompat) p176p1.AbstractC1949a.m3924a(parcel, android.support.v4.media.MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                mo2122J((android.support.v4.media.MediaDescriptionCompat) p176p1.AbstractC1949a.m3924a(parcel, android.support.v4.media.MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                mo2128S(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                boolean mo2131W = mo2131W();
                parcel2.writeNoException();
                parcel2.writeInt(mo2131W ? 1 : 0);
                return true;
            case 46:
                mo2151v(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int mo2125O = mo2125O();
                parcel2.writeNoException();
                parcel2.writeInt(mo2125O);
                return true;
            case 48:
                mo2127Q(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                mo2136c0(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                android.os.Bundle mo2148q = mo2148q();
                parcel2.writeNoException();
                p176p1.AbstractC1949a.m3920W(parcel2, mo2148q, 1);
                return true;
            case 51:
                mo2144l((android.support.v4.media.RatingCompat) p176p1.AbstractC1949a.m3924a(parcel, android.support.v4.media.RatingCompat.CREATOR), (android.os.Bundle) p176p1.AbstractC1949a.m3924a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i4, parcel, parcel2, i5);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    public final void previous() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: q */
    public final android.os.Bundle mo2148q() {
        ((android.support.v4.media.session.C1056o) this.f3843c.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: r */
    public final void mo2112r(android.support.v4.media.session.InterfaceC1043b interfaceC1043b) {
        android.support.v4.media.session.C1056o c1056o = (android.support.v4.media.session.C1056o) this.f3843c.get();
        if (c1056o == null) {
            return;
        }
        c1056o.f3848e.unregister(interfaceC1043b);
        android.os.Binder.getCallingPid();
        android.os.Binder.getCallingUid();
        synchronized (c1056o.f3847d) {
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: s */
    public final void mo2149s(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i4) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: u */
    public final java.lang.String mo2150u() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: v */
    public final void mo2151v(boolean z4) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: w */
    public final void mo2152w(android.support.v4.media.RatingCompat ratingCompat) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: x */
    public final void mo2153x(java.lang.String str, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: y */
    public final long mo2154y() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: z */
    public final void mo2155z(android.net.Uri uri, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }
}
