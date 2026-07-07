package com.google.android.gms.auth.api.signin;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends p062P1.AbstractC0527a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = new p024F.C0206i(3);

    /* renamed from: l */
    public final int f4893l;

    /* renamed from: m */
    public final java.lang.String f4894m;

    /* renamed from: n */
    public final java.lang.String f4895n;

    /* renamed from: o */
    public final java.lang.String f4896o;

    /* renamed from: p */
    public final java.lang.String f4897p;

    /* renamed from: q */
    public final android.net.Uri f4898q;

    /* renamed from: r */
    public java.lang.String f4899r;

    /* renamed from: s */
    public final long f4900s;

    /* renamed from: t */
    public final java.lang.String f4901t;

    /* renamed from: u */
    public final java.util.ArrayList f4902u;

    /* renamed from: v */
    public final java.lang.String f4903v;

    /* renamed from: w */
    public final java.lang.String f4904w;

    /* renamed from: x */
    public final java.util.HashSet f4905x = new java.util.HashSet();

    public GoogleSignInAccount(int i4, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j4, java.lang.String str6, java.util.ArrayList arrayList, java.lang.String str7, java.lang.String str8) {
        this.f4893l = i4;
        this.f4894m = str;
        this.f4895n = str2;
        this.f4896o = str3;
        this.f4897p = str4;
        this.f4898q = uri;
        this.f4899r = str5;
        this.f4900s = j4;
        this.f4901t = str6;
        this.f4902u = arrayList;
        this.f4903v = str7;
        this.f4904w = str8;
    }

    /* renamed from: d */
    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount m2926d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString("photoUrl");
        android.net.Uri parse = !android.text.TextUtils.isEmpty(optString) ? android.net.Uri.parse(optString) : null;
        long parseLong = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i4), 1));
        }
        java.lang.String optString2 = jSONObject.optString("id");
        java.lang.String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        java.lang.String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        java.lang.String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        java.lang.String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        java.lang.String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        java.lang.String string = jSONObject.getString("obfuscatedIdentifier");
        p058O1.AbstractC0515s.m1016c(string);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = new com.google.android.gms.auth.api.signin.GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new java.util.ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f4899r = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
        if (googleSignInAccount.f4901t.equals(this.f4901t)) {
            java.util.HashSet hashSet = new java.util.HashSet(googleSignInAccount.f4902u);
            hashSet.addAll(googleSignInAccount.f4905x);
            java.util.HashSet hashSet2 = new java.util.HashSet(this.f4902u);
            hashSet2.addAll(this.f4905x);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4901t.hashCode() + 527;
        java.util.HashSet hashSet = new java.util.HashSet(this.f4902u);
        hashSet.addAll(this.f4905x);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f4893l);
        p176p1.AbstractC1949a.m3917T(parcel, 2, this.f4894m);
        p176p1.AbstractC1949a.m3917T(parcel, 3, this.f4895n);
        p176p1.AbstractC1949a.m3917T(parcel, 4, this.f4896o);
        p176p1.AbstractC1949a.m3917T(parcel, 5, this.f4897p);
        p176p1.AbstractC1949a.m3916S(parcel, 6, this.f4898q, i4);
        p176p1.AbstractC1949a.m3917T(parcel, 7, this.f4899r);
        p176p1.AbstractC1949a.m3925a0(parcel, 8, 8);
        parcel.writeLong(this.f4900s);
        p176p1.AbstractC1949a.m3917T(parcel, 9, this.f4901t);
        p176p1.AbstractC1949a.m3919V(parcel, 10, this.f4902u);
        p176p1.AbstractC1949a.m3917T(parcel, 11, this.f4903v);
        p176p1.AbstractC1949a.m3917T(parcel, 12, this.f4904w);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
