package p124e2;

/* renamed from: e2.b */
/* loaded from: classes.dex */
public final class C1354b extends p124e2.AbstractC1353a {

    /* renamed from: l */
    public final char f5626l;

    public C1354b(char c4) {
        this.f5626l = c4;
    }

    @Override // p124e2.AbstractC1353a
    /* renamed from: a */
    public final boolean mo3112a(char c4) {
        return c4 == this.f5626l;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c4 = this.f5626l;
        for (int i4 = 0; i4 < 4; i4++) {
            cArr[5 - i4] = "0123456789ABCDEF".charAt(c4 & 15);
            c4 = (char) (c4 >> 4);
        }
        sb.append(java.lang.String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
