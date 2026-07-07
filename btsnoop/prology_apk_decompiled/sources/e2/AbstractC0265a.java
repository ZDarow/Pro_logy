package e2;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0265a implements g {
    public abstract boolean a(char c4);

    @Override // e2.g
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
