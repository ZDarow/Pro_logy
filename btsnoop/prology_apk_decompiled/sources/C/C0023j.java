package C;

/* renamed from: C.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319a;

    /* renamed from: b, reason: collision with root package name */
    public int f320b;

    /* renamed from: c, reason: collision with root package name */
    public int f321c;

    public int a() {
        int i4 = this.f321c;
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

    public String toString() {
        switch (this.f319a) {
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f320b + ", mEndLine=" + this.f321c + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0023j(int i4, int i5, int i6) {
        this.f319a = i6;
        this.f320b = i4;
        this.f321c = i5;
    }
}
