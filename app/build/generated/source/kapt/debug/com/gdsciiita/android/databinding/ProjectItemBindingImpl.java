package com.gdsciiita.android.databinding;
import com.gdsciiita.android.R;
import com.gdsciiita.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProjectItemBindingImpl extends ProjectItemBinding  {

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

    public ProjectItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ProjectItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.desc.setTag(null);
        this.github.setTag(null);
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
        if (BR.project == variableId) {
            setProject((com.gdsciiita.android.model.Project) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProject(@Nullable com.gdsciiita.android.model.Project Project) {
        this.mProject = Project;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.project);
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
        java.lang.String projectName = null;
        java.lang.String projectDesc = null;
        java.lang.String projectLogo = null;
        java.lang.String projectLink = null;
        java.lang.String projectGithub = null;
        com.gdsciiita.android.model.Project project = mProject;

        if ((dirtyFlags & 0x3L) != 0) {



                if (project != null) {
                    // read project.name
                    projectName = project.getName();
                    // read project.desc
                    projectDesc = project.getDesc();
                    // read project.logo
                    projectLogo = project.getLogo();
                    // read project.link
                    projectLink = project.getLink();
                    // read project.github
                    projectGithub = project.getGithub();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.desc, projectDesc);
            com.gdsciiita.android.BindingAdaptersKt.bindButton(this.github, projectGithub);
            com.gdsciiita.android.BindingAdaptersKt.bindButton(this.link, projectLink);
            com.gdsciiita.android.BindingAdaptersKt.bindImage(this.logo, projectLogo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, projectName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): project
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}