package p145j;

/* renamed from: j.i0 */
/* loaded from: classes.dex */
public final class C1664i0 extends android.util.Property {
    @Override // android.util.Property
    public final java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((androidx.appcompat.widget.SwitchCompat) obj).f4013I);
    }

    @Override // android.util.Property
    public final void set(java.lang.Object obj, java.lang.Object obj2) {
        ((androidx.appcompat.widget.SwitchCompat) obj).setThumbPosition(((java.lang.Float) obj2).floatValue());
    }
}
