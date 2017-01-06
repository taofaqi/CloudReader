package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class FragmentBaseBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_content_part, 1);
        sViewsWithIds.put(R.id.container, 2);
        sViewsWithIds.put(R.id.ll_error_refresh, 3);
        sViewsWithIds.put(R.id.img_err, 4);
        sViewsWithIds.put(R.id.ll_progress_bar, 5);
        sViewsWithIds.put(R.id.img_progress, 6);
    }
    // views
    public final android.widget.RelativeLayout container;
    public final android.widget.ImageView imgErr;
    public final android.widget.ImageView imgProgress;
    public final android.widget.LinearLayout llErrorRefresh;
    public final android.widget.LinearLayout llProgressBar;
    public final android.widget.LinearLayout llRoot;
    public final android.widget.RelativeLayout rlContentPart;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBaseBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.container = (android.widget.RelativeLayout) bindings[2];
        this.imgErr = (android.widget.ImageView) bindings[4];
        this.imgProgress = (android.widget.ImageView) bindings[6];
        this.llErrorRefresh = (android.widget.LinearLayout) bindings[3];
        this.llProgressBar = (android.widget.LinearLayout) bindings[5];
        this.llRoot = (android.widget.LinearLayout) bindings[0];
        this.llRoot.setTag(null);
        this.rlContentPart = (android.widget.RelativeLayout) bindings[1];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static FragmentBaseBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FragmentBaseBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentBaseBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.fragment_base, root, attachToRoot, bindingComponent);
    }
    public static FragmentBaseBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FragmentBaseBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.fragment_base, null, false), bindingComponent);
    }
    public static FragmentBaseBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FragmentBaseBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_base_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentBaseBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}