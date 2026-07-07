package B2;

import android.view.KeyEvent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f118b;

    /* renamed from: c, reason: collision with root package name */
    public int f119c;

    /* renamed from: d, reason: collision with root package name */
    public Object f120d;

    /* renamed from: e, reason: collision with root package name */
    public Object f121e;

    public /* synthetic */ E() {
        this.f117a = 1;
    }

    public E a() {
        O1.s.a("execute parameter required", ((N1.j) this.f120d) != null);
        return new E(this, (L1.c[]) this.f121e, this.f118b, this.f119c);
    }

    public String toString() {
        switch (this.f117a) {
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f119c >= 0) {
                    sb.append(" #");
                    sb.append(this.f119c);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public E(E e4, L1.c[] cVarArr, boolean z4, int i4) {
        this.f117a = 2;
        this.f121e = e4;
        this.f120d = cVarArr;
        boolean z5 = false;
        if (cVarArr != null && z4) {
            z5 = true;
        }
        this.f118b = z5;
        this.f119c = i4;
    }

    public E(android.support.v4.media.session.t tVar) {
        this.f117a = 3;
        tVar.getClass();
        this.f120d = new ArrayList();
        this.f119c = -1;
        this.f121e = tVar;
    }

    public E(android.support.v4.media.session.t tVar, KeyEvent keyEvent) {
        this.f117a = 0;
        this.f121e = tVar;
        this.f119c = ((F[]) tVar.f3734m).length;
        this.f118b = false;
        this.f120d = keyEvent;
    }
}
