package u0;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: h, reason: collision with root package name */
    public static final W0.d f8554h = new W0.d(13);

    /* renamed from: i, reason: collision with root package name */
    public static final W0.d f8555i = new W0.d(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f8556a;

    /* renamed from: e, reason: collision with root package name */
    public int f8560e;

    /* renamed from: f, reason: collision with root package name */
    public int f8561f;

    /* renamed from: g, reason: collision with root package name */
    public int f8562g;

    /* renamed from: c, reason: collision with root package name */
    public final r[] f8558c = new r[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8557b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f8559d = -1;

    public s(int i4) {
        this.f8556a = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(float f4, int i4) {
        r rVar;
        int i5 = this.f8559d;
        ArrayList arrayList = this.f8557b;
        if (i5 != 1) {
            Collections.sort(arrayList, f8554h);
            this.f8559d = 1;
        }
        int i6 = this.f8562g;
        r[] rVarArr = this.f8558c;
        if (i6 > 0) {
            int i7 = i6 - 1;
            this.f8562g = i7;
            rVar = rVarArr[i7];
        } else {
            rVar = new Object();
        }
        int i8 = this.f8560e;
        this.f8560e = i8 + 1;
        rVar.f8551a = i8;
        rVar.f8552b = i4;
        rVar.f8553c = f4;
        arrayList.add(rVar);
        this.f8561f += i4;
        while (true) {
            int i9 = this.f8561f;
            int i10 = this.f8556a;
            if (i9 <= i10) {
                return;
            }
            int i11 = i9 - i10;
            r rVar2 = (r) arrayList.get(0);
            int i12 = rVar2.f8552b;
            if (i12 <= i11) {
                this.f8561f -= i12;
                arrayList.remove(0);
                int i13 = this.f8562g;
                if (i13 < 5) {
                    this.f8562g = i13 + 1;
                    rVarArr[i13] = rVar2;
                }
            } else {
                rVar2.f8552b = i12 - i11;
                this.f8561f -= i11;
            }
        }
    }

    public final float b() {
        int i4 = this.f8559d;
        ArrayList arrayList = this.f8557b;
        if (i4 != 0) {
            Collections.sort(arrayList, f8555i);
            this.f8559d = 0;
        }
        float f4 = 0.5f * this.f8561f;
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            r rVar = (r) arrayList.get(i6);
            i5 += rVar.f8552b;
            if (i5 >= f4) {
                return rVar.f8553c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) arrayList.get(arrayList.size() - 1)).f8553c;
    }
}
