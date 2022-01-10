package com.gdsciiita.android.databinding;
import com.gdsciiita.android.R;
import com.gdsciiita.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MemberItemBindingImpl extends MemberItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MemberItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private MemberItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            );
        this.address.setTag(null);
        this.card.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.profile.setTag(null);
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
        if (BR.member == variableId) {
            setMember((com.gdsciiita.android.model.Member) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMember(@Nullable com.gdsciiita.android.model.Member Member) {
        this.mMember = Member;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.member);
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
        com.gdsciiita.android.model.Member member = mMember;
        java.lang.String memberDesignation = null;
        int memberType = 0;
        java.lang.String memberName = null;
        java.lang.String memberProfilePic = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (member != null) {
                    // read member.designation
                    memberDesignation = member.getDesignation();
                    // read member.type
                    memberType = member.getType();
                    // read member.name
                    memberName = member.getName();
                    // read member.profilePic
                    memberProfilePic = member.getProfilePic();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, memberDesignation);
            com.gdsciiita.android.BindingAdaptersKt.bindCard(this.card, memberType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, memberName);
            com.gdsciiita.android.BindingAdaptersKt.bindImage(this.profile, memberProfilePic);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): member
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}