package p024F;

/* renamed from: F.j */
/* loaded from: classes.dex */
public final class C0207j extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<p024F.C0207j> CREATOR = new p024F.C0206i(0);

    /* renamed from: l */
    public int f575l;

    public final java.lang.String toString() {
        return "HorizontalScrollView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " scrollPosition=" + this.f575l + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f575l);
    }
}
