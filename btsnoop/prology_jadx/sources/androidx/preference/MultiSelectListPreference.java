package androidx.preference;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends androidx.preference.DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903159(0x7f030077, float:1.7413128E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = p101a.AbstractC0936a.m1763A(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int[] r1 = p137h1.AbstractC1502b.f6210e
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L23
            r4.getTextArray(r2)
        L23:
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L2e
            r5 = 1
            r4.getTextArray(r5)
        L2e:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public final java.lang.Object mo2677c(android.content.res.TypedArray typedArray, int i4) {
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i4);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
