package C;

import a0.C0133m;
import android.view.View;

/* renamed from: C.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0016c implements y0.r, e2.e, W2.c, W.h {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f304l;

    public /* synthetic */ C0016c(int i4) {
        this.f304l = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f9  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.text.SpannableString, android.text.Spannable] */
    @Override // e2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C0016c.apply(java.lang.Object):java.lang.Object");
    }

    @Override // W.h
    public void b(Object obj) {
        switch (this.f304l) {
            case 15:
                ((T.M) obj).t(new C0133m(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 16:
                ((T.M) obj).getClass();
                return;
            case 17:
                ((b0.j) obj).getClass();
                return;
            case 18:
                ((b0.j) obj).getClass();
                return;
            case 19:
                ((b0.j) obj).getClass();
                return;
            case 20:
                ((b0.j) obj).getClass();
                return;
            case 21:
                ((b0.j) obj).getClass();
                return;
            case 22:
                ((b0.j) obj).getClass();
                return;
            case 23:
                ((b0.j) obj).getClass();
                return;
            case 24:
                ((b0.j) obj).getClass();
                return;
            case 25:
                ((b0.j) obj).getClass();
                return;
            case 26:
                ((b0.j) obj).getClass();
                return;
            case 27:
                ((b0.j) obj).getClass();
                return;
            case 28:
                ((b0.j) obj).getClass();
                return;
            default:
                ((b0.j) obj).getClass();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y0.r
    public y0.o[] c() {
        switch (this.f304l) {
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new y0.o[]{new D0.c()};
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return new y0.o[]{new E0.b()};
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                return new y0.o[]{new S0.q(V0.j.f2619c, 16)};
            default:
                return new y0.o[]{new Object()};
        }
    }

    @Override // W2.c
    public boolean d(View view) {
        return view.hasFocus();
    }
}
