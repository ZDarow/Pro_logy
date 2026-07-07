package p011C;

/* renamed from: C.j */
/* loaded from: classes.dex */
public final class C0118j {

    /* renamed from: a */
    public final /* synthetic */ int f325a;

    /* renamed from: b */
    public int f326b;

    /* renamed from: c */
    public int f327c;

    /* renamed from: a */
    public int m432a() {
        int i4 = this.f327c;
        if (i4 == 2) {
            return 10;
        }
        if (i4 == 5) {
            return 11;
        }
        if (i4 == 29) {
            return 12;
        }
        if (i4 == 42) {
            return 16;
        }
        if (i4 != 22) {
            return i4 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public java.lang.String toString() {
        switch (this.f325a) {
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f326b + ", mEndLine=" + this.f327c + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0118j(int i4, int i5, int i6) {
        this.f325a = i6;
        this.f326b = i4;
        this.f327c = i5;
    }
}
