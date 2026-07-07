package androidx.preference;

/* loaded from: classes.dex */
public class EditTextPreference extends androidx.preference.DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903184(0x7f030090, float:1.7413179E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = p101a.AbstractC0936a.m1763A(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = p137h1.AbstractC1502b.f6208c
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L30
            L1.g r5 = p046L1.C0363g.f1111o
            if (r5 != 0) goto L2c
            L1.g r5 = new L1.g
            r0 = 19
            r1 = 0
            r5.<init>(r0, r1)
            p046L1.C0363g.f1111o = r5
        L2c:
            L1.g r5 = p046L1.C0363g.f1111o
            r3.f4384r = r5
        L30:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public final java.lang.Object mo2677c(android.content.res.TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }
}
