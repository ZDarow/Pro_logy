package p046L1;

/* renamed from: L1.b */
/* loaded from: classes.dex */
public class DialogFragmentC0358b extends android.app.DialogFragment {

    /* renamed from: l */
    public android.app.AlertDialog f1097l;

    /* renamed from: m */
    public android.content.DialogInterface.OnCancelListener f1098m;

    /* renamed from: n */
    public android.app.AlertDialog f1099n;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f1098m;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.AlertDialog alertDialog = this.f1097l;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f1099n == null) {
            android.app.Activity activity = getActivity();
            p058O1.AbstractC0515s.m1017d(activity);
            this.f1099n = new android.app.AlertDialog.Builder(activity).create();
        }
        return this.f1099n;
    }
}
