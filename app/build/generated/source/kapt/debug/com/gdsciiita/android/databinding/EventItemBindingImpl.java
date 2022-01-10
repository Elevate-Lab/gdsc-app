package com.gdsciiita.android.databinding;
import com.gdsciiita.android.R;
import com.gdsciiita.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EventItemBindingImpl extends EventItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EventItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private EventItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.date.setTag(null);
        this.desc.setTag(null);
        this.link.setTag(null);
        this.logo.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.event == variableId) {
            setEvent((com.gdsciiita.android.model.Event) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEvent(@Nullable com.gdsciiita.android.model.Event Event) {
        this.mEvent = Event;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.event);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String eventDesc = null;
        java.lang.String eventLogo = null;
        java.lang.String eventLink = null;
        java.lang.String eventDate = null;
        com.gdsciiita.android.model.Event event = mEvent;
        java.lang.String eventName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (event != null) {
                    // read event.desc
                    eventDesc = event.getDesc();
                    // read event.logo
                    eventLogo = event.getLogo();
                    // read event.link
                    eventLink = event.getLink();
                    // read event.date
                    eventDate = event.getDate();
                    // read event.name
                    eventName = event.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.date, eventDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.desc, eventDesc);
            com.gdsciiita.android.BindingAdaptersKt.bindButton(this.link, eventLink);
            com.gdsciiita.android.BindingAdaptersKt.bindImage(this.logo, eventLogo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, eventName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): event
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}