package p129f2;

/* renamed from: f2.L */
/* loaded from: classes.dex */
public final class C1396L extends p129f2.AbstractC1387C {
    @Override // p129f2.AbstractC1387C
    /* renamed from: b */
    public final p129f2.AbstractC1387C mo3146b(java.lang.Object obj) {
        obj.getClass();
        m3145a(obj);
        return this;
    }

    /* renamed from: g */
    public final p129f2.AbstractC1397M m3175g() {
        int i4 = this.f5693b;
        if (i4 == 0) {
            int i5 = p129f2.AbstractC1397M.f5709n;
            return p129f2.C1427i0.f5774u;
        }
        if (i4 != 1) {
            p129f2.AbstractC1397M m3177i = p129f2.AbstractC1397M.m3177i(i4, this.f5692a);
            this.f5693b = m3177i.size();
            this.f5694c = true;
            return m3177i;
        }
        java.lang.Object obj = this.f5692a[0];
        java.util.Objects.requireNonNull(obj);
        int i6 = p129f2.AbstractC1397M.f5709n;
        return new p129f2.C1441p0(obj);
    }
}
