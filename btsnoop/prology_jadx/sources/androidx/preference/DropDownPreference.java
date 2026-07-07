package androidx.preference;

/* loaded from: classes.dex */
public class DropDownPreference extends androidx.preference.ListPreference {

    /* renamed from: u */
    public final android.widget.ArrayAdapter f4375u;

    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.prology.R.attr.dropdownPreferenceStyle);
        android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f4375u = arrayAdapter;
        arrayAdapter.clear();
        java.lang.CharSequence[] charSequenceArr = this.f4376s;
        if (charSequenceArr != null) {
            for (java.lang.CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: b */
    public final void mo2676b() {
        android.widget.ArrayAdapter arrayAdapter = this.f4375u;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
