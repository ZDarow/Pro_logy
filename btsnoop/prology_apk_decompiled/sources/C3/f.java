package C3;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class f implements Comparator {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f397l;

    public /* synthetic */ f(int i4) {
        this.f397l = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (r0 != false) goto L16;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.f397l
            switch(r0) {
                case 0: goto L3d;
                default: goto L5;
            }
        L5:
            k1.g r7 = (k1.C0385g) r7
            k1.g r8 = (k1.C0385g) r8
            androidx.recyclerview.widget.RecyclerView r0 = r7.f7004d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r1
        L12:
            androidx.recyclerview.widget.RecyclerView r4 = r8.f7004d
            if (r4 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r1
        L19:
            r5 = -1
            if (r3 == r4) goto L22
            if (r0 != 0) goto L20
        L1e:
            r1 = r2
            goto L3c
        L20:
            r1 = r5
            goto L3c
        L22:
            boolean r0 = r7.f7001a
            boolean r3 = r8.f7001a
            if (r0 == r3) goto L2b
            if (r0 == 0) goto L1e
            goto L20
        L2b:
            int r0 = r8.f7002b
            int r2 = r7.f7002b
            int r0 = r0 - r2
            if (r0 == 0) goto L34
            r1 = r0
            goto L3c
        L34:
            int r7 = r7.f7003c
            int r8 = r8.f7003c
            int r7 = r7 - r8
            if (r7 == 0) goto L3c
            r1 = r7
        L3c:
            return r1
        L3d:
            C3.e r7 = (C3.e) r7
            B3.l r7 = r7.f391a
            C3.e r8 = (C3.e) r8
            B3.l r8 = r8.f391a
            if (r7 != r8) goto L49
            r7 = 0
            goto L55
        L49:
            if (r7 != 0) goto L4d
            r7 = -1
            goto L55
        L4d:
            if (r8 != 0) goto L51
            r7 = 1
            goto L55
        L51:
            int r7 = r7.compareTo(r8)
        L55:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.f.compare(java.lang.Object, java.lang.Object):int");
    }
}
