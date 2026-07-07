package com.google.android.gms.auth.api.signin;

import F.i;
import O1.s;
import P1.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new i(3);

    /* renamed from: l, reason: collision with root package name */
    public final int f4722l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4723m;

    /* renamed from: n, reason: collision with root package name */
    public final String f4724n;

    /* renamed from: o, reason: collision with root package name */
    public final String f4725o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4726p;

    /* renamed from: q, reason: collision with root package name */
    public final Uri f4727q;

    /* renamed from: r, reason: collision with root package name */
    public String f4728r;
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4729t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4730u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4731v;
    public final String w;

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f4732x = new HashSet();

    public GoogleSignInAccount(int i4, String str, String str2, String str3, String str4, Uri uri, String str5, long j4, String str6, ArrayList arrayList, String str7, String str8) {
        this.f4722l = i4;
        this.f4723m = str;
        this.f4724n = str2;
        this.f4725o = str3;
        this.f4726p = str4;
        this.f4727q = uri;
        this.f4728r = str5;
        this.s = j4;
        this.f4729t = str6;
        this.f4730u = arrayList;
        this.f4731v = str7;
        this.w = str8;
    }

    public static GoogleSignInAccount d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(jSONArray.getString(i4), 1));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        s.c(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f4728r = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f4729t.equals(this.f4729t)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f4730u);
            hashSet.addAll(googleSignInAccount.f4732x);
            HashSet hashSet2 = new HashSet(this.f4730u);
            hashSet2.addAll(this.f4732x);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4729t.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f4730u);
        hashSet.addAll(this.f4732x);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f4722l);
        AbstractC0462a.T(parcel, 2, this.f4723m);
        AbstractC0462a.T(parcel, 3, this.f4724n);
        AbstractC0462a.T(parcel, 4, this.f4725o);
        AbstractC0462a.T(parcel, 5, this.f4726p);
        AbstractC0462a.S(parcel, 6, this.f4727q, i4);
        AbstractC0462a.T(parcel, 7, this.f4728r);
        AbstractC0462a.a0(parcel, 8, 8);
        parcel.writeLong(this.s);
        AbstractC0462a.T(parcel, 9, this.f4729t);
        AbstractC0462a.V(parcel, 10, this.f4730u);
        AbstractC0462a.T(parcel, 11, this.f4731v);
        AbstractC0462a.T(parcel, 12, this.w);
        AbstractC0462a.Y(parcel, X3);
    }
}
