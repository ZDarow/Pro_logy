package p145j;

/* renamed from: j.e0 */
/* loaded from: classes.dex */
public final class C1656e0 extends p031H.AbstractC0243c {
    public static final android.os.Parcelable.Creator<p145j.C1656e0> CREATOR = new p031H.C0242b(1);

    /* renamed from: n */
    public boolean f6897n;

    public C1656e0(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6897n = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
    }

    public final java.lang.String toString() {
        return "SearchView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " isIconified=" + this.f6897n + "}";
    }

    @Override // p031H.AbstractC0243c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeValue(java.lang.Boolean.valueOf(this.f6897n));
    }
}
