package p071R2;

/* renamed from: R2.N */
/* loaded from: classes.dex */
public final class C0593N extends java.io.ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final java.lang.Class resolveClass(java.io.ObjectStreamClass objectStreamClass) {
        java.lang.String[] strArr = {"java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;"};
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p105a3.AbstractC1032o.m2057Q(4));
        for (int i4 = 0; i4 < 4; i4++) {
            linkedHashSet.add(strArr[i4]);
        }
        java.lang.String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || linkedHashSet.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new java.lang.ClassNotFoundException(objectStreamClass.getName());
    }
}
