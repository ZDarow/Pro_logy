package io.flutter.embedding.engine.mutatorsstack;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class FlutterMutatorsStack {
    private java.util.List<p025F1.C0215g> mutators = new java.util.ArrayList();
    private android.graphics.Matrix finalMatrix = new android.graphics.Matrix();
    private java.util.List<android.graphics.Path> finalClippingPaths = new java.util.ArrayList();
    private float finalOpacity = 1.0f;

    public java.util.List<android.graphics.Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public android.graphics.Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public java.util.List<p025F1.C0215g> getMutators() {
        return this.mutators;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pushClipPath(android.graphics.Path path) {
        this.mutators.add(new java.lang.Object());
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pushClipRRect(int i4, int i5, int i6, int i7, float[] fArr) {
        android.graphics.Rect rect = new android.graphics.Rect(i4, i5, i6, i7);
        this.mutators.add(new java.lang.Object());
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(new android.graphics.RectF(rect), fArr, android.graphics.Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pushClipRect(int i4, int i5, int i6, int i7) {
        android.graphics.Rect rect = new android.graphics.Rect(i4, i5, i6, i7);
        this.mutators.add(new java.lang.Object());
        android.graphics.Path path = new android.graphics.Path();
        path.addRect(new android.graphics.RectF(rect), android.graphics.Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pushOpacity(float f4) {
        this.mutators.add(new java.lang.Object());
        this.finalOpacity *= f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pushTransform(float[] fArr) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        this.mutators.add(new java.lang.Object());
        this.finalMatrix.preConcat(matrix);
    }
}
