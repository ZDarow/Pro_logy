package p114c2;

/* renamed from: c2.c */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1248c extends p088W1.AbstractBinderC0816b {
    @Override // p088W1.AbstractBinderC0816b
    /* renamed from: l0 */
    public final boolean mo1659l0(int i4, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i4) {
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                p088W1.AbstractC0817c.m1662b(parcel);
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                p088W1.AbstractC0817c.m1662b(parcel);
                break;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
            default:
                return false;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                p088W1.AbstractC0817c.m1662b(parcel);
                break;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                p088W1.AbstractC0817c.m1662b(parcel);
                break;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                p114c2.C1251f c1251f = (p114c2.C1251f) p088W1.AbstractC0817c.m1661a(parcel, p114c2.C1251f.CREATOR);
                p088W1.AbstractC0817c.m1662b(parcel);
                p054N1.BinderC0442A binderC0442A = (p054N1.BinderC0442A) this;
                binderC0442A.f1283e.post(new p054N1.RunnableC0462q(2, binderC0442A, c1251f));
                break;
            case 9:
                p088W1.AbstractC0817c.m1662b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
