package p145j;

/* renamed from: j.w */
/* loaded from: classes.dex */
public final class C1691w extends p145j.C1689v {
    @Override // p145j.AbstractC1692x
    /* renamed from: a */
    public boolean mo3633a(android.widget.TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }

    @Override // p145j.C1689v
    /* renamed from: b */
    public void mo3631b(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }
}
